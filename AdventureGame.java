import java.util.Scanner;

public class AdventureGame
{
  public static void main (String[] args)
  {
    NewGraphicInterface graph_int = new NewGraphicInterface(
    graph_int.WelcomeMessage();

    NewGameManager game_manager = new NewGameManager();
    game_manager.Initialisation();

    boolean is_game_finished = false;//la boucle n'est pas terminée

    while(!is_game_finished)
     {
       Personnage player = new Personnage;
       String action = graph_int.PlayerAction();
       if (action == "turn left")
       {
         game_manager.ChangeDirection(left);
       }
       elseif (action == "move forward")
       {
          game_manager.ChangeDirection(forward);
       }
       elseif (action == "go back")
       {
          game_manager.ChangeDirection(back);
       }

       //OBJECTS:
       elseif(action == "take the key")
       {
         player.take(key);
       }

       elseif (action == "take the box")
       {
         player.take(box);
       }
       elseif (action == "open the box with the key")
       {
         player.open(box, key);
       }

       //HELP:
       elseif(action == "help")
       {
         game_manager.help(/*mot clé qui doit être détaillé*/);
       }

       else
       {
         System.out.println("You entered a wrong command, try ...");
       }

       is_game_finished = game_manager.update();

     }

  }

}
