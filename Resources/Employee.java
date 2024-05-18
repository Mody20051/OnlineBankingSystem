package Resources;

public class Employee extends Personalnformation{

    private String  EID;
    private int salary;
    private int hours;



    public Employee(String name,String password,String email,int phonenum, String address, Gender gender, int id, String EID, int salary, int hours) {
        super(name,password,email,phonenum,address, gender, id);
        this.EID = EID;
        this.salary = salary;
        this.hours = hours;
    }

    public int getSalary() {
        return salary*hours;
    }

    public void setSalary(int salary) {
        try {
            this.salary = salary;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        try {
            this.hours = hours;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EID='" + EID + '\'' +
                ", salary=" + salary +
                ", hours=" + hours +
                '}';
    }
}
