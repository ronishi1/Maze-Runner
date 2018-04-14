/**
Represent the set of steps needed for the solution(if any) of a Maze
*/
public class MazeSolver{
    private Maze mazeHolder; //holds the maze that will be solved
  private int path;
    /**
      Construct an instance of a solver for a given @maze.
     */
  public MazeSolver(Maze maze){
    path=0;
    mazeHolder=maze;//refer to the maze that needs to be solved
  }
  public boolean solve() {
    if(mazeHolder.explorerIsOnA()==Maze.TREASURE){
	path++;//record successful path
      return true;
    }
    else if(mazeHolder.explorerIsOnA()==Maze.WALL){
      return false;
    }
    else{//recursive case
	//for each direction in the path we're working on...
      for(int direction=1;direction<=8;direction*=2){
        Maze snapshot = new Maze(mazeHolder);
        mazeHolder.dropA(Maze.WALL);
        mazeHolder.go(direction);
        solve();
        mazeHolder=snapshot;
      }
      if(path>0) {
        return true;
      }
      return false;
    }
  }
  /**
  @return a string representation of this maze
  */
  public String toString(){
    if(path>0) {
      return"There is "+ path+ " paths for this maze.";
    }
    return "There are no  path for this maze.";
  }
}
