package NewBank;

public class Bank {
    private int agency, account;
    private String client, type;
    private double money;
    private boolean status;

    public int getAgency() {
        return this.agency;
    }

    protected void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccount() {
        return this.account;
    }

    protected void setAccount(int account) {
        this.account = account;
    }

    public String getClient() {
        return this.client;
    }

    protected void setClient(String client) {
        this.client = client;
    }

    public String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return this.money;
    }

    protected void setMoney(double money) {
        this.money = money;
    }

    public boolean isStatus() {
        return this.status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }
}