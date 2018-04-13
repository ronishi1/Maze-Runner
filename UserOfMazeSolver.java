/**
Tests MazeSolver.
Requires command line arguments:(maybe later)
o  the name of a file containing a maze.
o  the rank and file where an explorer is starting

For example,
java UserOfMaze mazes/4cell_treasureWest.txt -1 -1  # no explorer
*/
public class UserOfMazeSolver{
  public static void main(String[] commandLine)
  throws java.io.FileNotFoundException {
    System.out.println();

    // Expecting there to be a path
    MazeSolver solver1;
    Maze maze1 = new Maze( "mazes/intersection_treasureNorth.txt",1,1);
    solver1 = new MazeSolver(maze1);
    solver1.solve();
    System.out.println( solver1 + System.lineSeparator() + maze1);

    // Expecting there to be a path
    Maze maze2 = new Maze( "mazes/4cell_treasureWest.txt",0,1);
    MazeSolver solver2 = new MazeSolver(maze2);
    solver2.solve();
    System.out.println(solver2 + System.lineSeparator() + maze2);

    // Expecting there to not be a path
    Maze maze3 = new Maze("mazes/intersection_noTreasure.txt",1,1);
    MazeSolver solver3 = new MazeSolver(maze3);
    solver3.solve();
    System.out.println(solver3 + System.lineSeparator() + maze3);

    // Expecting there to be a path
    Maze maze4 = new Maze("mazes/loop_withTreasure.txt",1,1);
    MazeSolver solver4 = new MazeSolver(maze4);
    solver4.solve();
    System.out.println(solver4 + System.lineSeparator() + maze4);
  }
}
