public class GameManager
{
  //STATES OF THE CELLS:
  //state of the keys of the cells
 public static updateKeyCell ()
 {
   Map <String, int> keyCellDictionary = new HashMap <String, int>();

    keyCellDictionary.put ("cell00", 0);
    keyCellDictionary.put ("cell01", 0);
    keyCellDictionary.put ("cell02", 0);
    keyCellDictionary.put ("cell03", 0);
    keyCellDictionary.put ("cell04", 0);
    keyCellDictionary.put ("cell05", 0);

    keyCellDictionary.put ("cell10", 0);
    keyCellDictionary.put ("cell11", 0);
    keyCellDictionary.put ("cell12", 0);
    keyCellDictionary.put ("cell13", 0);
    keyCellDictionary.put ("cell14", 0);
    keyCellDictionary.put ("cell15", 0);

    keyCellDictionary.put ("cell20", 0);
    keyCellDictionary.put ("cell21", 0);
    keyCellDictionary.put ("cell22", 0);
    keyCellDictionary.put ("cell23", 0);
    keyCellDictionary.put ("cell24", 0);
    keyCellDictionary.put ("cell25", 0);

    keyCellDictionary.put ("cell30", 0);
    keyCellDictionary.put ("cell31", 0);
    keyCellDictionary.put ("cell32", 0);
    keyCellDictionary.put ("cell33", 0);
    keyCellDictionary.put ("cell34", 0);
    keyCellDictionary.put ("cell35", 0);

    keyCellDictionary.put ("cell40", 0);
    keyCellDictionary.put ("cell41", 0);
    keyCellDictionary.put ("cell42", 0);
    keyCellDictionary.put ("cell43", 0);
    keyCellDictionary.put ("cell44", 0);
    keyCellDictionary.put ("cell45", 0);

    keyCellDictionary.put ("cell50", 0);
    keyCellDictionary.put ("cell51", 0);
    keyCellDictionary.put ("cell52", 0);
    keyCellDictionary.put ("cell53", 0);
    keyCellDictionary.put ("cell54", 0);
    keyCellDictionary.put ("cell55", 0);
    //if nbr == 1, there's a key in this cell
    //if nbr == 0, there's no key in this cell
 }

 //state of the boxes of the cells
 public static updateBoxCell ()
 {
   Map <String, int> boxCellDictionary = new HashMap <String, int>();
   boxCellDictionary.put ("cell00", 0);
   boxCellDictionary.put ("cell01", 0);
   //etc
 }


//STATE OF THE PLAYER:
//state of the keys of the player
 public static updateKeyPlayer ()
 {
    Map <String, int> keyPlayerDictionary = new HashMap <String, int>();
    keyPlayerDictionary.put ("cell00", 0);
    keyPlayerDictionary.put ("cell01", 0);
    //etc
 }
 //state of the boxes of the player
  public static updateBoxPlayer ()
  {
     Map <String, int> boxPlayerDictionary = new HashMap <String, int>();
     boxPlayerDictionary.put ("cell00", 0);
     boxPlayerDictionary.put ("cell01", 0);
     //etc
  }
//if there's a new objet in the maze, we need to add it on the player + in the cell

//CHANGE OF DIRECTION:
public static ChangeDirection ()
{
  int north;
  int south;
  int west;
  int east;

  int front;
  int back;
  int left;
  int right;

  //if the player is in this position: ->
    if (/* -> */)
    {
      north = left;
      south = right;
      west = back;
      east = front;
    }
    //if the player is in this position: <-
      else if (/* <- */)
      {
        north = right;
        south = left;
        west = front;
        east = back;
      }
    //if the player is in this position: ^
      else if (/* ^ */)
      {
        north = front;
        south = back;
        west = left;
        east = right;
      }
    //if the player is in this direction: \/
      else if (/* \/ */)
      {
        north = back;
        south = front;
        west = right;
        east = left;
      }
  }
}

//QUESTIONS:
//  faut-il faire un package?
//  faut-il faire un dictionnaire pour chaque objet?
//  comment traduire la condition en code?
//  je ne sais jamais quoi mettre comme arguments/paramètre à une fct
//  je ne sais jamais si la fct doit etre static, public...
