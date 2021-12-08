public enum RoadMsg {

    OVER_LOAD("Проезд запрещен для автомобилей, общая фактическая масса котороых больше %s т");

    private String msg;

    RoadMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
