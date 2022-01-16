package NewBank;

public class Account extends Bank implements Client {
    private final int agency = 1;
    private static int id = 1;

    public Account(String name, String type) {
        this.setAgency(agency);
        this.setAccount(id++);
        this.setClient(name);
        this.setType(type);
        this.setMoney(0);
        this.setStatus(true);
    }

    @Override
    public void Deposit(double money) {
        if (this.isStatus()) {
            this.setMoney(this.getMoney() + money);
        }
    }

    @Override
    public void Withdraw(double money) {
        if (this.isStatus() && this.getMoney() >= money) {
            this.setMoney(this.getMoney() - money);
        }
    }

    @Override
    public void Transfer(double money, Account account) {
        if (this.isStatus() && this.getMoney() >= money) {
            if (account.isStatus()) {
                this.setMoney(this.getMoney() - money);
                account.setMoney(account.getMoney() + money);
            }
        }
    }

    @Override
    public void getInfo() {
        System.out.println("----------ACCOUNT INFO----------");
        System.out.println("Agency: " + this.getAgency());
        System.out.println("Account Number: " + this.getAccount());
        System.out.println("Name: " + this.getClient());
        System.out.println("Type: " + this.getType());
        System.out.println("Money: $" + this.getMoney());
        if (this.isStatus()) {
            System.out.println("Status: Open");
        } else {
            System.out.println("Status: Closed");
        }
    }

}