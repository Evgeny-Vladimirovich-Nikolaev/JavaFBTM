public class Report{

    private int choice, src, target;
    private int[] srcRange, targetRange;
    private String detail;

    Report(int choice, int src, int target) {
        this.choice = choice;
        this.src = src;
        this.target = target;
        this.detail = writeDetail();
    }

    Report(int choice, int[] srcRange, int[] targetRange) {
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

    void writeValue() {
        System.out.println(
                "Конвертация значения "
                + src
                + detail
                + target);
    }

    void writeRange() {
        System.out.println(
                "Конвертация значений "
                        + srcRange[0]
                        +'/'
                        + srcRange[1]
                        + detail
                        + targetRange[0]
                        + '/'
                        + targetRange[1]);
    }
}
