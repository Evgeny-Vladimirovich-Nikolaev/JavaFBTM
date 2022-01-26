public class MatrixRunner {

    public static void main(String[] args) {
        new MatrixDemo().demonstrateMatrices();
        new UserInterface().initActions();
        Receiver.close();
    }

}
