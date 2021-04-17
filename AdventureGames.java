package startGame;

//for the scanf:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public static class StartGame
{
  //the program starts here
  public static void main (String[] args)
  {
    startFunction;
  }

   private static void startFunction ()
   {
    //appel à la fct initialisation;

    //say welcome:
    System.out.println("What's your name?");
    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    String nameOfPlayer = bufferRead.readLine();

    System.out.println("Welcome to the maze" + nameOfPlayer);

    //start the game:
    //appelle GraphicInterface:
    GraphicInterface(); //?
   }
}

//QUESTIONS:

//comment est ce qu'on lance le jeu?
//le "scanf" ne fonctionne tjr pas...
