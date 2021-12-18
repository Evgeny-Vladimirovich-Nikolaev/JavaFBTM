public class Employee {

    private final int ID;
    private String lastName;
    private final String FIRST_NAME;
    private final String PATRONYMIC;
    private final String HIRE_DATE;

    public Employee(int id, String lastName, String FirstName, String Patronymic, String HireDate) {
        this.ID = id;
        this.lastName = lastName;
        this.FIRST_NAME = FirstName;
        this.PATRONYMIC = Patronymic;
        this.HIRE_DATE = HireDate;
    }

    public int getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getPATRONYMIC() {
        return PATRONYMIC;
    }

    public String getHIRE_DATE() {
        return HIRE_DATE;
    }
}
