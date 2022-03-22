import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruit {

    public String name;
    private float averageWeight;
    public List<String> Colors = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);

    ///Set name Method
    public void setName(){
        
        System.out.println("Type the fruit name");
        name = scanner.nextLine();
    }
    
    ///Get name Method
    private void getName(){
        System.out.println("The fruit name is " + name);
    }
    
    ///Set AverageWeight Method
    public void setAverageWeight(){
        
        System.out.println("Type the fruit AverageWeight");
        averageWeight = scanner.nextFloat();
    }
    
    ///Get AverageWeight Method
    private void getAverageWeight(){
        System.out.println("The fruit AverageWeight is " + averageWeight);
    }

    String CurrentColor;

    public void setListColors(){
       
        do{
            System.out.println("Type the fruit colors, (Top stop adding colors, leave the space empty and press enter)");
            CurrentColor = scanner.nextLine();
            Colors.add(CurrentColor);
            
        }while(CurrentColor.length() > 0);
        
    }

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
