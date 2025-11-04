package Java_Language.Advanced;
class InvalidBalanceException extends Exception {
    // Constructor to pass custom error message
    InvalidBalanceException(String message) {
        super(message);
    }
}
class UserDefinedExc {
    public static void main(String[] args) {
        int balance,c,d;
        try {
            // Parse balance from command-line arguments
            balance = Integer.parseInt(args[0]); // May throw NumberFormatException
            c = Integer.parseInt(args[1]);
            d = Integer.parseInt(args[2]);
            updateBalance(balance,c,d); // may throw a user-defined exception
        } catch (InvalidBalanceException ex) {
            System.out.println("Caught in catch of InvalidBalanceException");
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            System.out.println("Caught in catch of NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        } catch (Exception ex) {
            System.out.println("Caught in catch of Parent Exception");
        }
        System.out.println("Main method completed.");
    }
    // Method to update balance, throws InvalidBalanceException if balance < 0
    public static void updateBalance(int balance,int credit,int debit) throws InvalidBalanceException {
        balance = balance + credit - debit;
        if (balance < 0) {
            balance = balance -credit + debit; // to reset it to its passed value
            throw new InvalidBalanceException("Account balance cannot be less than zero.");
        }
        System.out.println("Updated balance : "+balance);
        System.out.println("No exception occurred in updateBalance() method.");
    }
}