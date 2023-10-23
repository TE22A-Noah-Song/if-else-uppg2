import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int litetTal=10;
        // int stortTal=1000;

        // if(litetTal<1000)
        // {
        // System.out.println(litetTal +"är mindre än"+stortTal);
        // }
        // else
        // {
        // System.out.println(litetTal +"är mindre än"+stortTal);
        // }
        // System.out.println("litetTal="+litetTal+", stortTal="+stortTal);

        //Man kan inte sätta en variabel inuti en if sats
       
        // int tal1=10;
        // int tal2=5;
        // if(tal2>tal1)
        // {
        // System.out.println(tal2+" är större än "+tal1);
        // }
        // else
        // {
        //     System.out.println(tal2+" är mindre än "+tal1);
        // }
        
        // Scanner t=new Scanner(System.in);
        // System.out.println("Säg ett heltal 1-24");
        // int tid=t.nextInt();
        // if(tid>=23)
        // {
        // System.out.println("dags att gå och lägga sig.");
        // }

        // else if(tid>=12)
        // {
        // System.out.println("dags att äta");
        // }

        // else if(tid>=7)
        // {
        // System.out.println("dags att gå upp.");
        // }
        // else if(tid<7)
        // {
        // System.out.println("dags att gå upp.");
        // }
        
        // Scanner t=new Scanner(System.in);
        // System.out.println("Är du medlem i klubben? Ja/Nej");
        // String medlem=t.nextLine();
        // System.out.println("Är du över 18? Ja/Nej");
        // String ålder=t.nextLine();
        // if(ålder.equalsIgnoreCase("Ja")||medlem.equalsIgnoreCase("Ja"))
        // {
        // System.out.println("Du får komma in!");
        // }
        // else
        // {
        // System.out.println("Du får inte komma in!");
        // }

    //   Scanner t=new Scanner(System.in);
    //     System.out.println("Ange Användarnamn:");
    //     String anv=t.nextLine();
    //     System.out.println("Ange Lösenord");
    //     String lös=t.nextLine();
    //     if(anv.equals("root") && lös.equals("passwd"))   
    //     {
    //     System.out.println("Inloggningen lyckades!");
    //     }
    //     else
    //     {
    //     System.out.println("Fel Användarnamn/Lösenord");
    //     }

    Scanner t=new Scanner(System.in);
    System.out.println("Meny Väderprogram");
    System.out.println("1. Skriv ut temperatur");
    System.out.println("2. Skriv ut Vind");
    System.out.println("3. Skriv ut luftfuktighet");
    System.out.print("Ange val:");    
    int val=t.nextInt();
    switch(val)
    {
    case 1:
    System.out.println("Det är 18 grader"); 
    break;
    case 2:
    System.out.println("Vinden är 10 sekund-meter");
    break;
    case 3:
    System.out.println("Det är 100% luftfuktighet");
    break;
    default:
    System.out.println("Fel val! Välj mellan 1-3");
    break;

        
    }

    }
}

