import java.util.Scanner;

public class instrument {
  public String FamilyIntrument;
  public String TypeIntrument;
  private String NameIntrument;
  public String MaterialIntrument;
  private String InstrumentColor;
  protected double PriceIntrument;

  Scanner scanner = new Scanner(System.in);

  public void setInstrumentfeatures(){
    int FamilyIntrumentvalue;
    System.out.println("These are the instrument families we have: 0 : woodwind family, 1: string family, 2: Percussion family, 3: keyboard instruments, 4: Synthesizers");
    System.out.println("Select the family number that corresponds to you :");


    FamilyIntrumentvalue = scanner.nextInt();

    switch(FamilyIntrumentvalue){
      case 0: FamilyIntrument = "woodwind family"; break;

      case 1: FamilyIntrument = "string family"; break; 

      case 2: FamilyIntrument = "Percussion family"; break;

      case 3: FamilyIntrument = "keyboard family"; break;

      case 4: FamilyIntrument = "Synthesizers"; break;
    }
    
    if (FamilyIntrumentvalue == 0){
      int TypeIntrumentValue;

      System.out.println("At this time we have these instruments: 0: Recorder, 1: transverse flute , 2: Clarinet, 3: Ocarina, 4: Trombone, 5: Saxophone, 6: Horn, 7: Trumpet, 8: Bassoon");
      System.out.println("Select the type number that corresponds to you :");   

      TypeIntrumentValue = scanner.nextInt();

      switch(TypeIntrumentValue){
        case 0: TypeIntrument = "Recorder"; MaterialIntrument = "Plastic"; break;
  
        case 1: TypeIntrument = "Transverse flute"; MaterialIntrument = "Wood" ; break; 
  
        case 2: TypeIntrument = "Clarinet"; MaterialIntrument = "Wood" ; break;
  
        case 3: TypeIntrument = "Ocarina"; MaterialIntrument = "ceramics" ; break;
  
        case 4: TypeIntrument = "Trombone"; MaterialIntrument = "brass" ; break;

        case 5: TypeIntrument = "Saxophone"; MaterialIntrument = "brass" ; break;

        case 6: TypeIntrument = "Horn"; MaterialIntrument = "brass" ; break;

        case 7: TypeIntrument = "Trumpet"; MaterialIntrument = "brass" ;break;

        case 8: TypeIntrument = "Bassoon"; MaterialIntrument = "Wood" ; break;
      }
      
    }
    

  }














}
