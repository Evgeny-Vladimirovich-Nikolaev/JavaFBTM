public class Controller {

    private Convertible convertible;
    private int value;
    private int[] range;

    void initActions() {
        while (resume()) {
            chooseOperation();
            initData();
        }
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
        int choice = -1;
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
                break;
            } catch (NumberFormatException ex) {
                try{
                    new RangeParser().parseArray(data);
                } catch (Exception e) {
                    System.out.println("Ошибка ввода данных");
                }

            }
        }
    }
}
