import java.util.*;

public class Type//models different types of robots and the tasks they perform
{
	private String robotType;//type of robot
	private int taskType;/*corresponding number for each type of robot
						   that determines which tasks the robot can perform*/
	
	private Type(String robotType, int taskType)//constructor
	{
		this.robotType = robotType;
		this.taskType = taskType;
	}
	
	//robot types
	/*UNIPEDAL("Unipedal",1), 
	BIPEDAL("Bipedal",2), 
	QUADRUPEDAL("Quadrupedal",3), 
	ARACHNID("Arachnid",4), 
	RADIAL("Radial",5), 
	AERONAUTICAL("Aeronautical",6);*/
	
	
	public String getRobotType()
	{
		return robotType;
	}
	public int getTaskType()
	{
		return taskType;
	}
}