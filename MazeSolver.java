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
    public boolean solver(Maze maze){
	if(maze.explorerIsOnA()==Maze.TREASURE){
	    path++;
	    return true;
	}
	else if(maze.explorerIsOnA()==Maze.WALL){
	    return false;
	}
	else{
	for(int direction=1;direction<=8;direction*=2){
	    Maze snapshot=new Maze(maze);
	    maze.go(direction);
	    System.out.println(maze);
	    solver(maze);
	    maze=snapshot;
	}
	if(path>0)return true;
	return false;
	}
    }
    /**
      @return a string representation of this board
     */
    public String toString(){
	if(path>0)return"There is a path for this maze.";
	return "There is not  a path for this maze.";
    }
}
