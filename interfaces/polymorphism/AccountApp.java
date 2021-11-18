package interfaces.polymorphism;

public class AccountApp {
    public static void main(String[] args) {
        Greater<Account> accountComparer =
                (Account acc1, Account acc2) ->
                        acc1.getBalance()>acc2.getBalance()?
                                acc1:
                                acc2;

        Account account1 = new Account(6);
        Account account2 = new Account(4);

        System.out.println("Account with greater balance: " + accountComparer.greater(account2,account1));

    }
}
