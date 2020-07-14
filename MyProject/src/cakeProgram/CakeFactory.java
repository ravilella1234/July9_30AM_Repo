package cakeProgram;

public class CakeFactory extends CakeTest implements Factory 
{

	@Override
	public Cake createCake(String cakeName) 
	{
		
		//Cake cake=null;

		if (cakeName.equals("BlackForest")) {
			cake = new BlackForest();
		} 
		else if (cakeName.equals("BlueBerry")) {
			cake = new BlueBerry();
		} 
		else if(cakeName.equals("Pineapple")){
			cake=new Pineapple();
		}
		return cake;
		
	}

}
