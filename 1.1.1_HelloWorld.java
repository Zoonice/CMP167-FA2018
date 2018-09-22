//TESFA GREAVES - CMP 167 - PROFESSOR YANILDA PERALTA RAMOS - M/W 1PM-2:40PM - FA2018

//Write a Java program to print Hello World//

public class HelloWorld
{
	//Start to main function//
	public static void main(String args[])
			
	{
		
		//Use lnbuilt function to print//
		System.out.println("Hello,
							World");

//ERROR: HelloWorld.java:11: error: unclosed string literal
                //System.out.println("Hello,
                                   //^
//ERROR: HelloWorld.java:12: error: unclosed string literal
                //World");
                     //^
//ERROR: HelloWorld.java:12: error: not a statement
                //World");
                //^
//3 errors

//These (3) errors are created because their needs to be a closing of the system.out on line "_System.out.println("Hello,_" and...//
//...also at the opening of the string "_World");_".
//An example of this correction would be my file "HelloWorldfix.java"				   


	}//End main//
}//Close Class//
