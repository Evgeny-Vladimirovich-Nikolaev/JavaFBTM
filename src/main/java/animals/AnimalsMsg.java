public enum AnimalsMsg {

    END("0 - закончить тренировку\n"),
    SCENARIO_1("""
                    Выберите развитие:
                    1 - начать дрессировку
                    2 - добавить животное
                    0 - куда я попал?"""),
    SCENARIO_2("""
                    Выберите развитие:
                    1 - начать дрессировку
                    0 - куда я попал?"""),
    SHOW("У вас есть:\n"),
    START("Кому дать задание:\n");

    private String msg;

    AnimalsMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
