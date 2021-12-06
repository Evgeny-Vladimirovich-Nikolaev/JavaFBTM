public class Controller {

    private Convertible convertible;
    private int value;
    private int[] range;
    private int choice = -1;

    void initActions() {
        do {
            chooseOperation();
            initData();
        } while (resume());
    }

    private void chooseOperation() {
        while (choice < 1 || choice > 6) {
            NumberReceiver numberReceiver = new NumberReceiver();
            choice = numberReceiver.receiveInt(Msg.CHOOSE_OPERATION.getMsg());
        }
        switch (choice) {
            case 1 -> convertible = new CelsiusFahrenheit(true);
            case 2 -> convertible = new CelsiusFahrenheit(false);
            case 3 -> convertible = new CelsiusKelvin(true);
            case 4 -> convertible = new CelsiusKelvin(false);
            case 5 -> convertible = new KelvinFahrenheit(true);
            case 6 -> convertible = new KelvinFahrenheit(false);
        }
    }

    private void initData() {
        StringReceiver stringReceiver = new StringReceiver();
        while (true) {
            String data = stringReceiver.receive(Msg.CONDITION.getMsg());
            try {
                value = Integer.parseInt(data);
                convertible.convert(value);
                writeMessage(value, convertible.convert(value));
                break;
            } catch (NumberFormatException ex) {
                try {
                    range = new RangeParser().parseArray(data);
                    writeMessage(range, convertible.convert(range));
                    break;
                } catch (NullPointerException e) {
                    System.out.println(Msg.DATA_ERROR.getMsg());
                }
            }
        }
    }

    private boolean resume() {
        StringReceiver receiver = new StringReceiver();
        String response = "";
        while (!"Y".equalsIgnoreCase(response) && !"N".equalsIgnoreCase(response)) {
            response = receiver.receive(Msg.REQUEST.getMsg());
        }
        if ("Y".equalsIgnoreCase(response)) {
            Receiver.close();
        }
        return "N".equalsIgnoreCase(response);
    }

    private void writeMessage(int src, int target) {
        System.out.println(new ValueReport(choice, src, target));
        choice = -1;
    }

    private void writeMessage(int[] range, int[] target) {
        System.out.println(new RangeReport(choice, range, target));
        choice = -1;
    }
}

class RangeParser {

    int[] parseArray(String range) {
        int[] arr = new int[2];
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();
        int ind = 0;
        try {
            while (ind < range.length() && range.charAt(ind) != '/') {
                val1.append(range.charAt(ind++));
            }
            while (++ind < range.length()) {
                val2.append(range.charAt(ind));
            }
            arr[0] = Integer.parseInt(val1.toString());
            arr[1] = Integer.parseInt(val2.toString());
        } catch (NumberFormatException numEx) {
            return null;
        }
        return arr;
    }
}

class ValueReport {

    private int choice, src, target;
    private String detail;

    ValueReport(int choice, int src, int target) {
        this.choice = choice;
        this.src = src;
        this.target = target;
        this.detail = writeDetail();
    }

    private String writeDetail() {
        return switch (choice) {
            case 1 -> Msg.CEL_FAHR.getMsg();
            case 2 -> Msg.FAHR_CEL.getMsg();
            case 3 -> Msg.CEL_KEL.getMsg();
            case 4 -> Msg.KEL_CEL.getMsg();
            case 5 -> Msg.KEL_FAHR.getMsg();
            case 6 -> Msg.FAHR_KEL.getMsg();
            default -> "";
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(Msg.VAL_REPORT.getMsg());
        sb.append(src);
        sb.append(detail);
        sb.append(target);
        return sb.toString();
    }
}

class RangeReport {

    private int choice;
    private int[] srcRange, targetRange;
    private String detail;

    RangeReport(int choice, int[] srcRange, int[] targetRange) {
        this.choice = choice;
        this.srcRange = srcRange;
        this.targetRange = targetRange;
        this.detail = writeDetail();
    }

    private String writeDetail() {
        return switch (choice) {
            case 1 -> Msg.CEL_FAHR.getMsg();
            case 2 -> Msg.FAHR_CEL.getMsg();
            case 3 -> Msg.CEL_KEL.getMsg();
            case 4 -> Msg.KEL_CEL.getMsg();
            case 5 -> Msg.KEL_FAHR.getMsg();
            case 6 -> Msg.FAHR_KEL.getMsg();
            default -> "";
        };
    }

    @Override
    public String toString() {
        try{
            StringBuilder sb = new StringBuilder(Msg.RANGE_REPORT.getMsg());
            sb.append(srcRange[0]);
            sb.append('/');
            sb.append(srcRange[1]);
            sb.append(detail);
            sb.append(targetRange[0]);
            sb.append('/');
            sb.append(targetRange[1]);
            return sb.toString();
        } catch (NullPointerException e) {
            return Msg.DATA_ERROR.getMsg();
        }
    }
}