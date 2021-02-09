import java.util.*;

public class Task//models each type of task
{
	//instance variables
	private String activity;//description of task
	private int taskTime;//time to complete each task
	private int taskType;//type of tasks different robot types can perform
	
	//list of each task and its corresponding number
	public static final HashMap<Integer, Task> taskMap = new HashMap<>();
	
	//static block to initialize the map
	static
	{
		int count = 0;
		for(Task x: values())
		{
			taskMap.put(count, x);
			count++;
		}
	}
	
	public Task(String activity, int taskTime, int taskType)//constructor 
	{
		this.activity = activity;
		this.taskTime = taskTime;
		this.taskType = taskType;
	}
	
	
	//general tasks
	DISHES("do the dishes", 1000, 0), SWEEP("sweep the house", 3000, 0), 
	LAUNDRY("do the laundry", 10000, 0), RECYCLING("take out the recycling", 4000, 0), 
	SANDWHICH("make a sammich", 7000, 0), LAWN("mow the lawn", 20000, 0), 
	LEAVES("rake the leaves", 18000, 0), DOG("give the dog a bath", 14500, 0), 
	COOKIES("bake some cookies", 8000, 0), CAR("wash the car", 20000, 0),
	
	//type-specific tasks
	FEED("feed the dog", 100, 1), WATER("water the flowers", 200, 2),
	PLANT("plant some pumpkins", 300, 3), CARVE("carve some pumpkins", 400, 4), 
	BUGS("catch some bugs", 500, 5), SURF("surf the web", 600, 6);
	
	
	public String getActivity()
	{
		return activity;
	}
	public int getTaskTime()
	{
		return taskTime;
	}
	public int getTaskType()
	{
		return TaskType;
	}
}
