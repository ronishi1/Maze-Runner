/**
Represent the set of steps needed for the solution(if any) of a Maze
*/
public class MazeSolver{
  private Maze mazeHolder; /*holds the maze that will be solved*/
  private int path;
  public MazeSolver(Maze maze){
    path=0;
    mazeHolder=maze;
  }
  public boolean solve() {
    if(mazeHolder.explorerIsOnA()==Maze.TREASURE){
      path++;
      return true;
    }
    else if(mazeHolder.explorerIsOnA()==Maze.WALL){
      return false;
    }
    else{
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
  @return a string representation of this board
  */
  public String toString(){
    if(path>0) {
      return"There is a path for this maze.";
    }
    return "There is not a path for this maze.";
  }
}
