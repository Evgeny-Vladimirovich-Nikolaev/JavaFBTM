public enum MatrixMsg {

    CHOOSE_OPERATION
            ("""
                    Выберите действие:
                    1 - сложение матриц
                    2 - разность матриц
                    3 - умножение матрицы на число
                    4 - умножение матриц
                    5 - возведение матрицы в степень
                    6 - вычисление детерминанта и ранга матрицы
                    0 - отмена"""),
    INITIALIZATION_OPTIONS
            ("""
                    Выберите вариант инициализации:
                    1 - назначить случайные матрицы
                    2 - определить матрицы
                    0 - отмена"""),
    SPECIFY_ROWS_NUMBER
            ("Укажите количество строк "),
    SPECIFY_COLUMNS_NUMBER
            ("Укажите количество столбцов "),
    LINE_CONDITIONS
            ("\n(желательно не более 20)"),
    FILL_MATRIX
            ("Введите построчно значения матрицы %s\n(желательно в пределах от -100 до 100)\n"),
    ENTER_VALUE
            ("Введите значение %s[%s][%s]"),
    FIRST_MATRIX
            ("первой матрицы"),
    SECOND_MATRIX
            ("второй матрицы");

    private String msg;

    MatrixMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
