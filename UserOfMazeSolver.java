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

        MazeSolver solver;
	Maze mazeSample = new Maze( "mazes\\intersection_treasureNorth.txt"
                            ,1
                            ,1
                            );
	solver=new MazeSolver(mazeSample);
        System.out.println( solver + System.lineSeparator());
    }
 }
