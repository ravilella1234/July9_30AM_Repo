package cakeProgram;

import java.util.Scanner;

public class CakeTest 
{
	public static Cake cake = null;

	public static void main(String[] args) 
	{
		//Cake cake = null;

		System.out.println("Which Cake you would like to eat BlackForest/BlueBerry/Pineapple : ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		scanner.close();

		CakeFactory cakeFactory=new CakeFactory();
		cake=cakeFactory.createCake(choice);

		cake.aboutCake();
		
		
		
		
		
		
		
		/*Cake cake = null;

		System.out.println("Which Cake you would like to eat ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		scanner.close();

		if (choice.equals("BlackForest")) {
			cake = new BlackForest();
		} 
		else if (choice.equals("BlueBerry")) {
			cake = new BlueBerry();
		} 
		else if(choice.equals("PineApple")){
			cake=new Pineapple();
		}

		cake.aboutCake();
		cake.recipe();*/

	}

}
