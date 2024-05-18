
package Resources;
import java .util.Date;
public class Department extends Manger{

    private String DENAME;
    private int DENUMBER;
    private  Date  MGSTATDATE;
    Manger manger;

    public Department(String name,String password,String email,int phonenum, String address, Gender gender, int id,Manger manger, String EID, int salary, int hours, String DENAME, int DENUMBER, Date MGSTATDATE) {
        super(name,password,email,phonenum,address,gender,id, EID, salary, hours);
        this.DENAME = DENAME;
        this.DENUMBER = DENUMBER;
        this.MGSTATDATE = MGSTATDATE;
        this.manger=manger;
    }

    public String getDENAME() {
        return DENAME;
    }

    public void setDENAME(String DENAME) {
        try {
            this.DENAME = DENAME;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getDENUMBER() {
        return DENUMBER;
    }

    public void setDENUMBER(int DENUMBER) {
        if (DENUMBER < 0) {
            throw new IllegalArgumentException("Department Number cannot be negative.");
        }
        this.DENUMBER = DENUMBER;
    }

    public Date getMGSTATDATE() {
        return MGSTATDATE;
    }

    public void setMGSTATDATE(Date MGSTATDATE) {
        try {
            this.MGSTATDATE = MGSTATDATE;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
