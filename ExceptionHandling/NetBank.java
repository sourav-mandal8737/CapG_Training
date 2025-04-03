package ExceptionHandling;

public class NetBank {
    private int currentBalance = 50000;
    private int pin = 1234;

    public static class InvalidPinException extends Exception {
        public InvalidPinException(String message) {
            super(message);
        }
    }

    public static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    public void setBalance(int deposit, int pin) throws InvalidPinException {
        if (this.pin == pin) {
            currentBalance += deposit;
        } else {
            throw new InvalidPinException("Invalid pin");
        }
    }

    public void getBalance(int pin) throws InvalidPinException {
        if (this.pin == pin) {
            System.out.println(currentBalance);
        } else {
            throw new InvalidPinException("Invalid pin");
        }
    }


    public void withdraw(int withdraw, int pin) throws InvalidPinException, InsufficientBalanceException {
        if (this.pin != pin) {
            throw new InvalidPinException("Invalid pin"); 
        }

        if (currentBalance < withdraw) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        currentBalance -= withdraw;
        System.out.println(withdraw);
    }
}
