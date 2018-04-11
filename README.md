# Maze-Runner
## personnel
Matthew Ming, Ray Onishi
## statement of problem
Returns the Boolean value of the statement
```
there exists a path through a given maze beginning at the starting location and ending at the goal. 
```
## recursive abstraction
When I am asked to return the boolean value of whether a path exists, beginning at the starting location and ending at the goal,
the recursive abstraction can return the boolean value of whether a path exists for the maze beginning one legal position closer to the goal.
## base cases
The starting location is the goal i.e. the goal has been reached.  
The starting location is not in a valid location in the maze.
## English or pseudocode description of algorithm
```
recordMazeSolution(maze):  
	if position on goal  
		return true 
	else if position not valid
		return false
	else   
		for each available path to take
			record snapshot of maze
			move one position on path  
			if legal path  
				invoke the recursive abstraction  
			move back to original position using snapshot  
```
## class(es), with fields and methods
## version *n* wish list
