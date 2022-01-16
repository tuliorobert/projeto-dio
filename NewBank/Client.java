package NewBank;

public interface Client {

    public void Deposit(double money);
    public void Withdraw(double money);
    public void Transfer(double money, Account account);
    public void getInfo();

}