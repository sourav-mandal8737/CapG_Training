package Encapsulation;

public class NetBankDriver {
	public static void main(String[] args) {
		NetBank b=new NetBank();
		//System.out.println(b.currentBalance);
	    //System.out.println(b.getBalance());
	    b.getBalance(1234);
	    b.setBalance(5000, 1234);
	    b.getBalance(1234);
	    b.withdraw(10000, 1234);
	    b.getBalance(1234);
	}

}


//design a student management system just update and fetching the students. students must have email id and password, name, age , gender,branch. you have to perfroem encapsulation where u will make all these privte. u will create getters and setter for updation, i want u to perform update operation and for this u need email id and password to be correct. u need to create a method to fetch students all the details at once. just update and fetching the data. just one more thing there should be a password update option. the person has to give old password, type new password and retype password then only hw will be able to update password. use only encupsulation for this and write code in java