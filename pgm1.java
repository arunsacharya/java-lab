/*1. Assume that a bank offers different types of user accounts like saving and loan account for its customers. For all customers basic details are common like name, address, phone, PAN and Aadhar no., but the way this accounts operates is different. Some account pays interest like SB A/C, some collect interest for the credit given. Demonstrate how above mentioned requirements can be developed in Java program. (hint: USE CLASS INHERITANCE, POLYMORPHISM, CONSTRUCTORS)
a. Identify various classes to implement this scenario
b. Specify how to store common details of the customers and separate different functionality of the accounts.
c. Display the details of the customer with the type of account and its details.
d. Calculate ROI for SB Account or Loan Interest for at least 2 users. */

package lab_programs;

class Bank{
	String name;
	String address;
	String phone;
	String pan;
	String aadhar;
	public Bank() {
	}
public Bank(String name, String address, String phone, String pan, String aadhar) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pan = pan;
		this.aadhar = aadhar;
	}
	
	void calcInt(){}
	void displayDetails(){
	System.out.println("Name : "+name+"\n"+"Address : "+address+"\n"+"Phone No : "+phone+"\n"+"PAN : "+pan+"\n"+"Aadhar : "+aadhar+"\n");
	}
	
}
class SBAccount extends Bank{
	String accNum;
	double accBal;
	double interest;
	public SBAccount(String name, String address, String phone, String pan, String aadhar,String num) {
	super(name, address, phone, pan, aadhar);
	accNum=num;
	accBal=1000;
	}
public SBAccount(String name, String address, String phone, String pan, String aadhar,String num,double bal) {
	super(name, address, phone, pan, aadhar);
	accNum=num;
	accBal=bal;
	}
	
void calcInt(){
	interest=accBal*0.04;
	}
void displayDetails(){
	super.displayDetails();
	System.out.println("Account Type : S/B Account\n"+"Account No : "+accNum+"\n"+"Interest paid per year : "+interest+"\nfor Amount : "+accBal);
	}	
}

class LoanAccount extends Bank{
	String accNum;
	double loanAmt;
	double interest;
	public LoanAccount(String name, String address, String phone, String pan, String aadhar,String num,double loan) {
		super(name, address, phone, pan, aadhar);
		accNum=num;
		loanAmt=loan;
	}
void calcInt(){
		interest=loanAmt*0.10;
	}
void displayDetails(){
	super.displayDetails();
	System.out.println("Account Type : Loan Account\n"+"Account No : "+accNum+"\n"+"Interest demand for 1st year : "+interest+"\nfor Amount : "+loanAmt);
	}	
}

public class pgm1 {
public static void main(String[] args) {
Bank bankAcc=new Bank();
bankAcc=new SBAccount("manu", "Bangalore", "9156395620", "ASTPM1000", "33334444", "111");
bankAcc.calcInt();
bankAcc.displayDetails();
System.out.println("\n");
bankAcc=new LoanAccount("jaswanth", "Mysore", "9135683465", "BSTPM1000", "55556666", "222",20000);
bankAcc.calcInt();
bankAcc.displayDetails();
}
}
