package objects;

public class Objects {

  private static void nbObjectsInventory(){
    Map <String, int> objectsDictionary = new HashMap <String, int>();
    objectsDictionary.put ("box", 0);
    objectsDictionary.put ("key", 0);
    objectsDictionary.put ("sword", 0);
    objectsDictionary.put ("door", 0);
  }//dico contenant les objets et étant updaté par le gameManager pour savoir le nb d'objet qu'il y a

  private static void possessedObjectsInventory(){
    Map <String, int> objectsDictionary = new HashMap <String, boolean>();
    objectsDictionary.put ("box", 0);
    objectsDictionary.put ("key", 0);
    objectsDictionary.put ("sword", 0);
  }//dico contenant les objets et étant updaté par le gameManager si ils sont possédés par le personnage


  /*QUESTIONS:
  - Pas trop compris le pricipe de une méthode par objet? */
