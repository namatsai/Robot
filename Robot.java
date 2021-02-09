import java.util.*;

class Robot//models each robot object
{
	//instance variables
	private String Name;//name of robot
	private Type RobotType;//type of robot
	private int totalTime;//time to complete all tasks
	
	public Robot(String Name, Type RobotType)//constructor
	{
		this.Name = Name;
		this.RobotType = RobotType;
		this.totalTime = 0;
	}
	
	//list of the different types of robots
	private static HashMap<Integer, String> robotTYPES = new HashMap<>();
	
	//static block to initialize the map
	//adds robot Types to the list
	static
	{
		robotTYPES.put(1,"UNIPEDAL");
		robotTYPES.put(2,"BIPEDAL");
		robotTYPES.put(3,"QUADRUPEDAL");
		robotTYPES.put(4,"ARACHNID");
		robotTYPES.put(5,"RADIAL");
		robotTYPES.put(6,"AERONAUTICAL");
	}
	
	//tasks completed by robot
	private HashMap<Integer, Task> completeTask;
	
	//static block to initialize map
	/*static
	{
	}*/
	
	
	//function to complete assigned tasks
	//adds completed tasks to list of robo accomplishments
	private void completeTask(int j, int taskNumber, Task robotTask)
	{
		Thread.sleep(robotTask.getTaskTime());//such suspense! such drama!
		
		/*robot can only recieve credit for general tasks (type 0)
		  and tasks specific to its robot type*/
		if(Task.taskMap.get(taskNumber).getTaskType() == 0 
		   || (Task.taskMap.get(taskNumber).getTaskType() == RobotType.getTaskType()))
		{
			totalTime = totalTime + robotTask.getTaskTime();
		}
		System.out.println("Task " + robotTask.getActivity() + " completed! \nTotal time elapsed: " + totalTime);
		completeTask.put(j, Task.taskMap.get(taskNumber));
	}
	
	
	//function to assign random tasks to robot
	public void assignTask()
	{
		completeTask = new HashMap<>();
		Random rand = new Random();
		for(int i = 0; i < 8; i++)
		{
			int taskNumber = rand.nextInt(16);
			completeTask(i, taskNumber, Task.taskMap.get(taskNumber));
		}
	}
	
	
	public String getName()
	{
		return Name;
	}
	public Type getRobotType()
	{
		return RobotType;
	}
	public int getTotalTime()
	{
		return totalTime;
	}
	
	public String toString()
	{
		//info about current robot object
		return "Robot Name: " + Name + "\nRobot Type: " + RobotType + "\nTotal Time: " + totalTime 
				+ "\nTask Completed: \n" + getCompleteTask();
	}
}