import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************");
        process("accountId001", 50, "USD");
        System.out.println("   ");
        System.out.println("**********************");
        process("accountId003", 250, "HRV");
        System.out.println("   ");
        System.out.println("**********************");
        process("accountId001", 50, "EUR");
        System.out.println("   ");
        System.out.println("**********************");
        process("accountId001", 50, "USD");
        System.out.println("   ");
        System.out.println("**********************");
        process("accountId001", 150, "USD");
        System.out.println("   ");
        System.out.println("**********************");
    }

    public static void process(String id, int amount, String Currency) {
        try {
            new BankApplication().process(id, amount, Currency);
        } catch (WrongAccountException exception) {
            System.out.println("This account doesn't exist");
        } catch (WrongCurrencyException exception) {
            System.out.println("Wrong currency for this account");
        } catch (WrongOperationException exception) {
            System.out.println("Not enough money ");
        } catch (Exception exception) {
            System.out.println("Something went wrong, try again");
        } finally {
            System.out.println("Thank you for use our service");
        }
    }
}