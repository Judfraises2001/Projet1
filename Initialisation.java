package initialisation;

public class Initialisation {

  private static void initialisationPersonnage(){
    Objects.nbObjectsInventory.key = 0;
    Objects.nbObjectsInventory.box = 0;
    Objects.nbObjectsInventory.sword = 0;
    GameManager.ChangeDirection.north = front;
    GameManager.ChangeDirection.south = back;
    GameManager.ChangeDirection.east = right;
    GameManager.ChangeDirection.west = left;
  }

  /*QUESTIONS:
  - Comment initialiser les cases?
  */
