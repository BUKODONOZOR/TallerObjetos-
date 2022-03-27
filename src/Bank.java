import java.util.Scanner;
/**
 * Representa una cuenta de banco simple.
 * @author Jafet David Ibarguen Lozano.
 */
public class Bank {

    /**
    * Representa el numero de cuenta de banco 
    */
    private int accountnumber;
 
    /**
    * Representa el estado de la cuenta bancaria
    */
    protected boolean isActive;
   

    Scanner scanner = new Scanner(System.in);

    /**
    * Genera un numero aleatorio de cuenta.
    * @param accountnumber es un numero aleatorio.
    */
    private void setAccountNumber() {
        accountnumber = (int) (Math.random() *1564856282 );
    }

    /**
    * Muestra en consola el numero aleatorio.
    */
    private void getAccountNumber() {
        System.out.println("The account number is " + accountnumber);
    }

    /**
     * Genera el estado de la cuenta 
     * @param stateaccount Es el valor que ingresa al switch 
     * @param isActive Es el valor que define si la cuenta está activa o no
     */
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

    /**
     * Muestra en consola el estado de la cuenta
     */
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
