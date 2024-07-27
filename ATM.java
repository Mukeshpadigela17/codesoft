import java.util.Scanner;
class BankAccount
{
private double balance;
public BankAccount(double initialBalance) 
{
this.balance=initialBalance;
}
public void deposit(double amount) 
{
if(amount>0) 
{
balance=balance+amount;
System.out.println("Deposited Rs"+amount+". New balance: Rs"+balance);
} 
else 
{
System.out.println("Invalid deposit amount. Please enter a positive value.");
}
}
public void withdraw(double amount) 
{
if(amount>0&&amount<=balance) 
{
balance=balance-amount;
System.out.println("Withdrew Rs"+amount+". New balance: Rs"+balance);
} 
else 
{
System.out.println("Insufficient amount.");
}
}
public double getBalance() 
{
return balance;
}
}
public class ATM 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter initial account balance: ");
double initialBalance=sc.nextDouble();
BankAccount account=new BankAccount(initialBalance);
while (true) 
{
System.out.println("\nATM Menu:");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
System.out.print("Enter your choice (1/2/3/4): ");
int choice=sc.nextInt();
switch (choice) 
{
case 1:
System.out.print("Enter deposit amount: ");
double depositAmount=sc.nextDouble();
account.deposit(depositAmount);
break;
case 2:
System.out.print("Enter withdrawal amount: ");
double withdrawalAmount=sc.nextDouble();
account.withdraw(withdrawalAmount);
break;
case 3:
System.out.println("Current balance: Rs"+account.getBalance());
break;
case 4:
System.out.println("Thank you for visiting the ATM");
sc.close();
System.exit(0);
default:
System.out.println("Invalid choice.");
}
}
}
}
