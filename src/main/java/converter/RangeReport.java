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
        try {
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
            return Msg.FORMAT_ERROR.getMsg();
        }
    }
}
