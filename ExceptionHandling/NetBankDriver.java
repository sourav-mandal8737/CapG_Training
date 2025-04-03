package ExceptionHandling;

public class NetBankDriver {
    public static void main(String[] args) throws NetBank.InvalidPinException, NetBank.InsufficientBalanceException {
        NetBank b = new NetBank();

        b.getBalance(1235);
        b.setBalance(5000, 1234);
        b.getBalance(1234);
        
        b.withdraw(60000, 1234);
        b.getBalance(1234);
        
        b.withdraw(1000, 1111);  
    }
}
