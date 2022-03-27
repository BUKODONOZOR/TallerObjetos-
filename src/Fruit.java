import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * representa una fruta
 * @author Jafet David Ibarguen Lozano 
*/
public class Fruit {

    /**
     * Una cadena de texto  con el nombre de la fruta 
    */
    public String name;

    /**
     * Es un valor flotante que representa el promedio que pude pesar la fruta
    */    
    private float averageWeight;

    /**
     * Es una lista con los colores de la fruta
    */    
    public List<String> Colors = new ArrayList<String>();


    Scanner scanner = new Scanner(System.in);

    /**
     * Es el metodo que se encarga de asignar un valor a la variable "name"
     * @param name es el nombre de la fruta (el usuario lo ingresa por consola)
    */
    public void setName(){
        
        System.out.println("Type the fruit name");
        name = scanner.nextLine();
    }
    
    /**
     * Es el metodo que se encarga de mostrar en consola el nombre de la fruta
     * @param name es el nombre de la fruta (el usuario lo ingresa por consola)
    */
    private void getName(){
        System.out.println("The fruit name is " + name);
    }
    
    /**
     * Es el metodo que se encarga de asignar un valor a la variable "averageWeight"
     * @param averageWeight Es un valor flotante que representa el promedio que pude pesar la fruta(el usuario lo ingresa por consola)
     */
    public void setAverageWeight(){
        
        System.out.println("Type the fruit AverageWeight");
        averageWeight = scanner.nextFloat();
    }
    
    /**
     * Es el motodo que se encarga de mostrar en consola en el promedio de peso de la fruta
    */
    private void getAverageWeight(){
        System.out.println("The fruit AverageWeight is " + averageWeight);
    }

    /**
      varible que representa el color de la fruta actual
    */
    String CurrentColor;

    /**
      El metodo que se encarga de general la lista de colores que tiene la fruta
    */
    public void setListColors(){
       
        do{
            System.out.println("Type the fruit colors, (Top stop adding colors, leave the space empty and press enter)");
            CurrentColor = scanner.nextLine();
            Colors.add(CurrentColor);
            
        }while(CurrentColor.length() > 0);
        
    }

    /** El metodo que se encarga de mostrar los coleres de la fruta  */
    private void getListColors(){
        System.out.println("The fruit Colors are" +Colors);
    }

    
    public static void main(String[] args){

        Fruit fruit = new Fruit();
        
        

        fruit.setName();
        fruit.setAverageWeight();

        fruit.getName();
        fruit.getAverageWeight();
        
        fruit.setListColors();
        fruit.getListColors();
       
    }
    

}
