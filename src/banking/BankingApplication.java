package banking;
import banking.InsufficientBalanceException;
public class BankingApplication
{
    String first_name;
    String last_name;
    double balance = 0;
    public BankingApplication(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public double withdraw(double amount) throws InsufficientBalanceException
    {
        if (amount > this.balance)
        {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else
        {
            this.balance -= amount;
            return amount;
        }
    }
    public void getInformation()
    {
        System.out.println("Account information:"+this.first_name+" "+this.last_name+" "+this.balance);
    }
}
