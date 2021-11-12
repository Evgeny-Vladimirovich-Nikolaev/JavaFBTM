public enum Message {

    CHOOSE_ACTION
            ("""
                    Выберите действие:
                    1 - решить квадратное уравнение
                    2 - найти факториал
                    0 - выйти из программы"""),
    IO_ERROR("Ошибка ввода/вывода"),
    ERROR("Неизветсная ошибка"),
    INIT_NOT_0("Введите целое число не равное 0"),
    INIT_INTEGER("Введите целое число"),
    INIT_NOT_NEGATIVE("Введите неотрицательное целое число"),
    INVALID_NUMBER("Неправильный формат числа"),
    INVALID_LINE(" не является числом"),
    INVALID_COEFFICIENT("Первый коэффициент не может быть равен 0"),
    RESUME("""
             - слишком большое число
            1 - продолжить
            2 - ввести другое число
            """),
    EQUATION("Уравнение "),
    NO_ROOTS(" не имеет корней"),
    ONE_ROOT(" имеет один корень:\nx = "),
    TWO_ROOTS(" имеет два корня:\nx1 = "),
    APPROXIMATELY("≈"),
    OVERFLOW("Ошибка переполнения памяти");


    private String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
