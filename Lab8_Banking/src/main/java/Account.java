import java.math.BigDecimal;
import java.util.*;

public class Account {


    private String name;
    private BigDecimal balance;
    private List<Account> accountList = new ArrayList<>();


    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
        accountList.add(this);
    }


    //метод для зняття грошей
    public synchronized void withdraw(BigDecimal amount) {
        if (this.getBalance().intValue()<amount.intValue()){
            System.out.println("Недостатньо коштів");
        }else {
            this.balance = this.balance.subtract(amount);
            System.out.println("З рахунку знято " + amount);
        }
    }

    //метод для поповнення рахунку
    public synchronized void deposite(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }


    public Account() {
        accountList.add(this);
    }

    public BigDecimal getBalance() {
        return balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("name='").append(name).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }


}
