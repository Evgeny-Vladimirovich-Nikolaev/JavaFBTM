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

    private boolean resume() {
        StringReceiver receiver = new StringReceiver();
        String response = "";
        while (!"Y".equalsIgnoreCase(response) && !"N".equalsIgnoreCase(response)) {
            response = receiver.receive(Msg.REQUEST.getMsg());
        }
        if ("Y".equalsIgnoreCase(response)) {
            StringReceiver.close();
        }
        return "N".equalsIgnoreCase(response);
    }

    private void chooseOperation() {
        while (choice < 0 || choice > 6) {
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
                } catch (Exception e) {
                    System.out.println(Msg.DATA_ERROR.getMsg());
                }

            }
        }
    }

    private void writeMessage(int src, int target) {
        System.out.println("Значение в целевой системе равно " + target);
        choice = -1;
    }

    private void writeMessage(int[] range, int[] target) {
        System.out.println("Значения в целевой системе "
                            + target[0]
                            + "/"
                            + target[1]);
        choice = -1;
    }
}
