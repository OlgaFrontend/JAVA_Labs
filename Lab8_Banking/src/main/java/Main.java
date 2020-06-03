
import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
Bank bank = new Bank();

       Account account1 =  new Account("Account1" , BigDecimal.valueOf(10000));
        Account account2 =  new Account("Account2" , BigDecimal.valueOf(0));

        System.out.println("Аккаунти : ");
        System.out.println(account1);
        System.out.println(account2);


        System.out.println("Намагаємось зняти гроші з Account2  у  якого немає на рахунку : ");
        account2.withdraw(BigDecimal.valueOf(100));

        System.out.println("Перешлемо гроші з першого аккаунта на другий : ");

        bank.transfer(account1,account2, BigDecimal.valueOf(5000));
        System.out.println("Баланс після переведення грошей : ");

        System.out.println(account1);
        System.out.println(account2);


    }
}
