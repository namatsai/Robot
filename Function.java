import java.util.*;

class Function
{
	//collects user input
	private static Scanner input = new Scanner(System.in); 
	
	//function to create a robot and assign it differnet tasks
	public static void createRobot()
	{
		//user enters robot name
		System.out.print("Enter a name for your new robot friend: ");
		String Name = input.next();
		
		//list of available robot types
		String availTypes = "";
		for(int i = 1; i <= 6; i++)
		{
			availTypes = availTypes + i + ")" + robotTYPES.get(i) + "\n";
		}
		
		//user enters int to select desired robot type
		System.out.println("Enter the number next to your desired robot type:\n" + availTypes);
		int robotNumber = input.nextInt();
		if(robotNumber <= 0 || robotNumber > 7)
		{
			System.out.println("Error! Please enter a number between 1-6: ");
			robotNumber = input.nextInt();
		}
		
		//create new robot object according to user specifications
		Robot robot = new Robot(Name, Type.valueOf(robotTYPES.get(robotNumber)));
		robot.assignTask();
	}
	
	//main method to run game
	public static void main(String[] args)
	{
		//call functions to play game
		String playAgain = "yes";
		if(playAgain = "yes")
		{
			createRobot();
			System.out.println("Would you like to play again? [Enter yes or no]");
			playAgain = input.next();
		}
		else
		{
			System.out.println("Thanks for playing. Goodbye friend :)");
			break;
		}	
	}
}