# Maze-Runner
## personnel
Matthew Ming, Ray Onishi
## statement of problem
Returns the Boolean value of the statement
```
there exists a path through a given maze beginning at the starting location and ending at the goal. 
```
## recursive abstraction
When I asked to return the boolean value of whether a path exists, beginning at the starting location and ending at the goal.
The recursive abstraction can return the boolean value of whether a path exists for the maze one legal position closer to the goal.
## base case
The starting location is the goal i.e. the goal has been reached.
## English or pseudocode description of algorithm
```
recordMazeSolution():  
	if position on goal  
		record list of directions   
	else   
		for each available path to take   
			move one position on path  
			if legal path  
				invoke the recursive abstraction  
			move back to original position  
```
## class(es), with fields and methods
## version *n* wish list
