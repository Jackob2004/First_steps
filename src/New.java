// Encapsulation to make sure that "sensitive" data is hidden from users

class Account{
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    }


public class New {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setBalance(4444);
        System.out.println(account1.getBalance());

    }
}
