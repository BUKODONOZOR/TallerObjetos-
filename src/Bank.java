import java.util.Scanner;

public class Bank {

    
    private int accountnumber;
    protected boolean isActive;
   

    Scanner scanner = new Scanner(System.in);

    private void setAccountNumber() {
        accountnumber = (int) (Math.random() *1564856282 );
    }

    private void getAccountNumber() {
        System.out.println("The account number is " + accountnumber);
    }

    public void setActived(){

        int stateaccount;
        
        System.out.println("Press 0 to activate the account or press 1 to deactivate the account");
        stateaccount = scanner.nextInt();

        switch (stateaccount) {
            case 0: isActive = true;
            break;

            case 1: isActive = false;
            break;
        }

    }

    public void getState(){
        System.out.println("The account state is Active"  + isActive);
    }

    public static void main(String[] args){

       Bank bank = new Bank();

       bank.setAccountNumber();
       bank.getAccountNumber();
       bank.setActived();
       bank.getState();

       
    }

}
