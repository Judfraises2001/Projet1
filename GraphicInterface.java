//for the scanf:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphicInterface
{
  //responds to the player:
  public static MsgToSay (String message)
  {
    System.out.println("message");
  }

  //reads the message of the player
  public static MsgToTake ()
  {
      BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
      String msgToTake = bufferRead.readLine();
  }

  //intermediary between the game and the player:
  public static Intermediary ()
  {
    //MOVING:
    if(msgToTake == "turn right")
    {
      //appeler le game manager, qui va appeler la cell, pour savoir si la porte de droite est ouverte?
      if (/* the door to the right is open*/)
      {
        //updater dans une fct que le personage a bougé
        MsgToSay("The door was open so you just turned right.")
      }
    }

    if (msgToTake == "turn left")
    {

    }
    if (msgToTake == "move foward")
    {

    }
    if (msgToTake == "go back")
    {

    }

    //OBJECTS:
    if(msgToTake == "take the key")
    {

    }

    if (msgToTake == "take the box")
    {

    }
    if (msgToTake == "open the box with the key")
    {

    }
    if (msgToTake == "drop the box")
    {

    }
    if (msgToTake == "drop the key")
    {

    }

    //HELP:
    if(msgToTake == "help")
    {
      string ubp = updateBoxPlayer(/* cell ds laquelle le player se trouve */);
      string ukp = updateKeyPlayer(/* cell ds laquelle le player se trouve */);

      System.out.println( ubp + ukp );
    }
  }
}

//QUESTIONS:
//  que faire une fois qu'on a identifié le msg?
