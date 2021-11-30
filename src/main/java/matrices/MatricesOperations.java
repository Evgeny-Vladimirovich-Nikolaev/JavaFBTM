public class MatricesOperations {

    void initActions() {
        while (resume()) {

        }
    }

    boolean resume() {
        StringReceiver receiver = new StringReceiver();
        String response = "";
        while (!"Y".equalsIgnoreCase(response) && !"N".equalsIgnoreCase(response)) {
            response = receiver.receive(Message.REQUEST.getMsg());
        }
        if("Y".equalsIgnoreCase(response)) {
            StringReceiver.close();
        }
        return "N".equalsIgnoreCase(response);
    }

    private void chooseOperation() {
        int choice = -1;
        while(choice < 0 || choice > 2) {
            NumberReceiver numberReceiver = new NumberReceiver();
            choice = numberReceiver.receiveInt(Message.CHOOSE_ACTION.getMsg());
        }
        switch (choice) {
            case 1  : addMatrix();
            break;
            case 2 : subtractMatrix();
            break;
            case 3 : multiplyByNumber();
            break;
            case 4 : multiplyByMatrix();
            break;
            case 5 : powerMatrix();
            break;
            case 6 : findDeterminant();
            break;
            case 7 : findRank();
            break;
        }
    }

    private void addMatrix() {

    }

    private void subtractMatrix() {

    }

    private void multiplyByNumber() {

    }

    private void multiplyByMatrix() {

    }

    private void powerMatrix() {

    }

    private void findDeterminant() {

    }

    private void findRank() {

    }
}
