//TESFA GREAVES - CMP 167 - PROFESSOR YANILDA PERALTA RAMOS - M/W 1PM-2:40PM - FA2018

//Write a Java program UseThree to print three names in reverse order as they are given//

public class UseThree
{
	//Start main function.
	public static void main(String ar[])
	
	{
		//Check the condition for three names.
		if(ar.length>=3)
		
			{
			
				System.out.print("Hi ");
				//Reverse the order by reversing arguments.
				System.out.print(ar[2]+", "+ar[1]+", and "+ar[0]);
				System.out.println(". How are you?");
		
			}
	
		//If arguments are less than 3 prints the message.
		else
		
			{
				System.out.println("less arguments the program cannot continue");
			}

	}//Close main

}//Close class
