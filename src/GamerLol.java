import java.util.Scanner;

public class GamerLol {

    private String nameaccount;
    public int levelaccount;
    public int elo;
    public double kda;
    protected int numberofgames;
    public int points = 0;

    String EloValue;
    Scanner scanner = new Scanner(System.in);

    private void setNameaccount(){

      System.out.println("Type account name");
      nameaccount = scanner.nextLine();
        
    }

    public void getNameaccount(){
        System.out.println("The name account is: " + nameaccount);
    }

    private void setlevelaccount(){

        System.out.println("Type account Level");
        levelaccount = scanner.nextInt();  
    }

    public void getLevelaccount(){
        System.out.println("The level account is: " + levelaccount);
    }

    public void setKda(){

        System.out.println("Type account KDA");
        kda = scanner.nextDouble();

    }

    public void getKda(){
        System.out.println("The KDA account is: " + kda);
    }

    public void setnumberofgames(){

        System.out.println("Type the number of games in the  past seanson ");
        numberofgames = scanner.nextInt();

    }

    public void getnumberofgames(){
        System.out.println("The number games in the past seanson is " + numberofgames );
       
    }

    public void setElo(){

        
        System.out.println("From 0 to 8 being 0 unchlassifield and 8 Challenger , in what elo are you?");
        elo = scanner.nextInt();

        switch (elo) {
            case 0: EloValue = "unchlassifield";
            break; 
            
            case 1: EloValue = "Iron";
            break;

            case 2: EloValue = "Bronze";
            break;

            case 3: EloValue = "Silver";
            break;

            case 4: EloValue = "Gold";
            break;

            case 5: EloValue = "Platinum";
            break;

            case 6: EloValue = "Diamond";
            break;

            case 7: EloValue = "Master";
            break;

            case 8: EloValue = "Challenger";
            break;
        }

    }

    public void getElo(){
        System.out.println("The Elo account is: "+ EloValue );
    }

    
    protected void compareGamer() {
        if (levelaccount >= 100){
            points = points + 20;
        }

        if (elo >= 4){
            points = points + 50;
        }

        if (kda >= 2.9){
            points = points + 10;
        }

        if (numberofgames >= 500){
            points = points + 40;
        }


    }

    protected void result(){

        if(points <60){
            System.out.println("Lack of hands");
        }

        if(points >60){
            System.out.println("Is an average player"); 
        }

        if (points >100){
            System.out.println("This good player, the points are " + points  );
        }
    }



    public static void main(String[] args){

        GamerLol gamer = new GamerLol();

        gamer.setNameaccount();
        gamer.setlevelaccount();
        gamer.setKda();
        gamer.setElo();
        gamer.setnumberofgames();

        gamer.getNameaccount();
        gamer.getLevelaccount();
        gamer.getKda();
        gamer.getElo();
        gamer.getnumberofgames();
        gamer.compareGamer();
        gamer.result();


    
 
        
    }
    
}
