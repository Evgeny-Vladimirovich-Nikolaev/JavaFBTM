public enum AnimalsMsg {

    SCENARIO("""
                    Выберите развитие:
                    1 - начать дрессировку
                    2 - добавить животное
                    0 - куда я попал?""");

    private String msg;

    AnimalsMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
