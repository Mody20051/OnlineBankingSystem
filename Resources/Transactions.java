package Resources;
import java.util.Date;

public class Transactions {
    Type type;

    double UpdateBalance;
    Status status;
    Date date;

    Transactions() {
    }
    Transactions(Type type, Status status,double UpdateBalance, Date date) {
        this.type = type;
        this.status = status;
        this.date = new Date(date.getTime());
        this.UpdateBalance=UpdateBalance;
        }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getUpdateBalance() {
        return UpdateBalance;
    }

    public void setUpdateBalance(double updateBalance) {
        UpdateBalance = updateBalance;
    }

}



