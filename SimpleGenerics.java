class Genericss <Data>
{
	Data object ;										
Genericss ( Data object ) 
{
 	this.object = object;
}
public void printObject()
{
	System.out.println(this.object);
}
} // end of Genericss class

class GenericsCodeRunner
{
	public static void main (String[] args)
	{
        Genericss <Integer> obj1 = new Genericss <Integer> (100);	
        obj1.printObject();
        Genericss <String> obj2 = new Genericss <String> ("Aayush");
        obj2.printObject();		
        Genericss <Double> obj3 = new Genericss <Double> (1.90);
        obj3.printObject();
	}
}
