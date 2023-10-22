import java.io.*; 
public class atmInterface
{
       
        // Display current balance in account 
        public static void displayBalance(int balance) 
        { 
            System.out.println("Current Balance is " + balance); 
            System.out.println(); 
        } 
      
        // Withdraw amount and update the balance 
        public static int Withdrawing(int balance, int withdrawAmount) 
        { 
            System.out.println("Withdrawn Operation:"); 
            System.out.println("Withdrawing Amount is "+ withdrawAmount); 


            if (balance >= withdrawAmount) 
            { 
                balance = balance - withdrawAmount; 
                System.out.println( "Please collect your money and card"); 
                displayBalance(balance); 
            } 
            else 
            { 
                System.out.println("Insufficient Funds"); 
                System.out.println(); 
            } 
            return balance; 
        } 
      

        // Deposit amount and update the balance 
        public static int Depositing(int balance,  int depositAmount) 
        { 
            System.out.println("Deposit Operation:"); 
            System.out.println("Depositing Amount : " + depositAmount); 
            balance = balance + depositAmount; 
            System.out.println(  "Your Money has been successfully deposited"); 
            displayBalance(balance); 
            return balance; 
        } 
      

        public static void main(String args[]) 
        { 
            int balance = 500; 
            int withdrawAmount = 3000; 
            int depositAmount = 5000; 
      
            // calling display balance 
            displayBalance(balance); 
            // withdrawing amount 
            balance  = Withdrawing(balance, withdrawAmount); 
            // depositing amount 
            balance = Depositing(balance, depositAmount); 
        } 
    }
    

