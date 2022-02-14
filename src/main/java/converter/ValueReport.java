import java.text.MessageFormat;
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
        return MessageFormat.format(
            Msg.VAL_REPORT.getMsg(),
            src,
            detail,
            target);
    }
}
