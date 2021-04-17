/*
cell00   cell01   cell02   cell03   cell04   cell05

cell10   cell11   cell12   cell13   cell14   cell15

cell20   cell21   cell22   cell23   cell24   cell25

cell30   cell31   cell32   cell33   cell34   cell35

cell40   cell41   cell42   cell43   cell44   cell45

cell50   cell51   cell52   cell53   cell54   cell55

*/
public class Maze
{
  public static void functionMaze()
  {
    //creation of the array representing the maze:
    int[][] arrayRepresentingMaze = new int [6][6];//can store 36 elements

    //put the coresponding subclasses in the correct cell:
    arrayRepresentingMaze [0][0] = cell00;
    arrayRepresentingMaze [0][1] = cell01;
    arrayRepresentingMaze [0][2] = cell02;
    arrayRepresentingMaze [0][3] = cell03;
    arrayRepresentingMaze [0][4] = cell04;
    arrayRepresentingMaze [0][5] = cell05;

    arrayRepresentingMaze [1][0] = cell00;
    arrayRepresentingMaze [1][1] = cell01;
    arrayRepresentingMaze [1][2] = cell02;
    arrayRepresentingMaze [1][3] = cell03;
    arrayRepresentingMaze [1][4] = cell04;
    arrayRepresentingMaze [1][5] = cell05;

    arrayRepresentingMaze [2][0] = cell00;
    arrayRepresentingMaze [2][1] = cell01;
    arrayRepresentingMaze [2][2] = cell02;
    arrayRepresentingMaze [2][3] = cell03;
    arrayRepresentingMaze [2][4] = cell04;
    arrayRepresentingMaze [2][5] = cell05;

    arrayRepresentingMaze [3][0] = cell00;
    arrayRepresentingMaze [3][1] = cell01;
    arrayRepresentingMaze [3][2] = cell02;
    arrayRepresentingMaze [3][3] = cell03;
    arrayRepresentingMaze [3][4] = cell04;
    arrayRepresentingMaze [3][5] = cell05;

    arrayRepresentingMaze [4][0] = cell00;
    arrayRepresentingMaze [4][1] = cell01;
    arrayRepresentingMaze [4][2] = cell02;
    arrayRepresentingMaze [4][3] = cell03;
    arrayRepresentingMaze [4][4] = cell04;
    arrayRepresentingMaze [4][5] = cell05;

    arrayRepresentingMaze [5][0] = cell00;
    arrayRepresentingMaze [5][1] = cell01;
    arrayRepresentingMaze [5][2] = cell02;
    arrayRepresentingMaze [5][3] = cell03;
    arrayRepresentingMaze [5][4] = cell04;
    arrayRepresentingMaze [5][5] = cell05;

  }
}

//QUESTIONS:

//  faut-il autre chose dans cette fct?
//  faut-il faire un package?
//  que mettre en argument?
