import java.sql.Date;
import java.util.Scanner;

/**
 * Clase que representa a una persona
 * @author Jafet David Ibarguen Lozano
 */
public class Person{

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    public float weight;

    Scanner scanner = new Scanner(System.in);

    ///Set name Method
    public void setName(){
        
        System.out.println("Type the name");
        name = scanner.nextLine();
    }
    
    ///Get name Method
    private void getName(){
        System.out.println("The name is " + name);
    }
    
    ///Set Lastname 1 Method
    public void setLastName1(){
        
        System.out.println("Type the LastName 1");
        lastName1 = scanner.nextLine();
    }

    ///Get Lastname 1 Method
    private void getLastName1(){
        System.out.println("The Lastname 1 is " + lastName1);
    }
    
    ///Set Lastname 2 Method
    public void setLastName2(){
        System.out.println("Type the LastName 2");
        lastName2 = scanner.nextLine();
    }
    ///Get Lastname 2 Method  
    private void getLastName2(){
        System.out.println("The Lastname 2 is  " + lastName2);
    }

    //set Height Method
    public void setHeight(){
        System.out.println("Type the Height");
        height = scanner.nextFloat();
    }

    //Get Height Method
    private void getHeight(){
        System.out.println("The height is  " + height);
    }


    //set Weight Method
    public void setWeight(){
        System.out.println("Type the Weight");
        weight = scanner.nextFloat();
    }

    //Get Height Method
    private void getWeight(){
        System.out.println("The Weight  is  " + weight);
    }    
    

    public static void main(String[] args){
        Person person = new Person();
        person.setName();
        person.setLastName1();
        person.setLastName2();
        person.setHeight();
        person.setHeight();

        person.getName();
        person.getLastName1();
        person.getLastName2();
        person.getHeight();
        person.getWeight();
        
    } 
    
   
}