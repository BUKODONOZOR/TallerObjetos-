import java.util.Scanner;

public class keyboard{

    private double size;
    private double weight;
    private int type;
    public boolean rgb;
    public String brand;
    protected String model;
    String typeValue;

     
    Scanner scanner = new Scanner(System.in);

    private void setbrand(){
        System.out.println("Type keyboard brand");
        brand = scanner.nextLine();
    } 

    public void getbrand(){
        System.out.println("The keyboard brand is : " + brand);
    }

    private void setmodel(){
        System.out.println("Type keyboard model");
        model = scanner.nextLine();

        System.out.println("Type keyboard size in cm");
        size = scanner.nextDouble();

        System.out.println("Type keyboard model");
        weight = scanner.nextDouble();
        
    } 

    public void getmodel(){
        System.out.println("The keyboard model is : " + model + "which has a weight of :" + weight + "and a size of : " + size +"cm");
    }

    private void settype(){

        System.out.println("Type 0 : ergonomic");
        System.out.println("Type 1 : multimedia");
        System.out.println("Type 2 : flexible");
        System.out.println("Type 3 : onscreen");
        System.out.println("Type 4 : projection");
        System.out.println("Type 5 : membrane");
        System.out.println("Type 6 : capacitive");
        System.out.println("Type 7 : metallic contact");
        System.out.println("Type 8 : mechanics");

        System.out.println("Type the number that corresponds to your keyboard");
        type = scanner.nextInt();

        

        switch (type) {
            case 0: typeValue = "ergonomic";
            break;

            case 1: typeValue = "multimedia";
            break;

            case 2: typeValue = "flexible";
            break;

            case 3: typeValue = "onscreen";
            break;

            case 4: typeValue = "projection";
            break;

            case 5: typeValue = "membrane";
            break;

            case 6: typeValue = "capacitive";
            break;

            case 7: typeValue = "metallic contact";
            break;

            case 8: typeValue = "mechanics";
            break;
        }

    }

    public void gettype(){
        System.out.println("Type the type for keyboard :" + typeValue);
    }

    private void getkeyboar(){
        
        System.out.println("Type keyboard brand" + brand);
        System.out.println("Type keyboard model" + model);
        System.out.println("Type the type for keyboard :" + typeValue);

        System.out.println("");
        
    }

    public static void main(String[] args){

        keyboard keyboard = new keyboard();

        keyboard.setbrand();
        keyboard.setmodel();
        keyboard.settype();


        keyboard.getbrand();
        keyboard.getmodel();
        keyboard.gettype();

        keyboard.getkeyboar();

 
        
    }


    

 

    
    
}
