import java.util.Scanner;

public class NewGraphicInterface
{
  //créer objet scanner
  public static void WelcomeMessage()
  {
    System.out.print ("Hi player, what's your name?");

    Scanner scanner = new Scanner (System.in);
    String name = scanner.nextLine();

    //VERIFIER QUE TOUTES LES COMMANDES SOIENT DANS LE MSG (SANS DROP) + help
    System.out.println ("Welcome to the Maze"+name+"Your goal is to exit without being killed, keys and swords are there to help you. Here are the actions your can do: turn right\n turn left\n move foward\ngo backtake the keytake the boxopen the door with key open the box with key4 take the sword");
  }

   public static String PlayerAction()
   {
     System.out.print ("What's your move?");
     Scanner scanner = new Scanner (System.in);
     String move = scanner.nextLine();

     return move;
   }
}
