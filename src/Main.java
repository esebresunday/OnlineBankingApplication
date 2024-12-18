import banking.BankingApplication;

class Main
{
    public static void main(String[] args)
    {
        BankingApplication bk = new BankingApplication("John","Doe");
        bk.deposit(342.35);
        System.out.println(bk.getBalance());
        System.out.println(bk.withdraw(22));
        System.out.println(bk.getBalance());
        bk.getInformation();
    }
}