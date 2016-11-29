package stuff.model;

public class ThirdThing extends SubThing implements OtherInterface, DoesStuff
{
	public int [] stackOfNumbers()
	{
		return null;
	}
	
	public void uselessMethod()
	{
		
	}
	
	public void otherUselessMethod(double someThingElse)
	{
		
	}
	
	public void doesOtherNada()
	{
		
	}
	
	public int countsNada(int numbers)
	{
		return numbers;
	}
	
	public void doesNada()
	{
		System.out.println("the subclass version-didnt get the rest of the writing");
		super.doesNada();
	}
}
