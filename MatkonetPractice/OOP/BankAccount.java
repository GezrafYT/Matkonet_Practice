package MatkonetPractice.OOP;

public class BankAccount {
    private String name;
    private int accountNumber;
    private double money;

    public BankAccount(String name, int accountNumber, double money)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
