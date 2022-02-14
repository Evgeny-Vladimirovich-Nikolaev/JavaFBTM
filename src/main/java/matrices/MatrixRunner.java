public class MatrixRunner {
    public static void main(String[] args) {
        new MatrixDemo().demonstrateMatrices();
        new MainInterface().initActions();
        Receiver.close();
    }

}
