public enum Message {

    CHOOSE_ACTION
            ("Выберите действие:" +
                    "\n1 - решить квадратное уравнение" +
                    "\n2 - найти факториал" +
                    "\n0 - выйти из программы"),
    IO_ERROR("Ошибка ввода/вывода"),
    ERROR("Неизветсная ошибка"),
    INIT_NOT_0_VALUE("Введите целое число не равное 0"),
    INIT_INTEGER_VALUE("Введите целое число"),
    INIT_NOT_NEGATIVE_INTEGER("Введите неотрицательное целое число"),
    INVALID_NUMBER("Неправильный формат числа"),
    INVALID_LINE(" не является числом"),
    INVALID_COEFFICIENT("Первый коэффициент не может быть равен 0"),
    RESUME(" - слишком большое число\n" +
            "1 - продолжить\n" +
            "2 - ввести другое число\n"),
    NO_ROOTS("Уравнение не имеет корней"),
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
