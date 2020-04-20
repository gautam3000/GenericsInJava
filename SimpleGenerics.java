class DataStore <Data>
{
	Data object ;										
DataStore ( Data object ) 
{
 	this.object = object;
}
public void getObject()
{
	System.out.println(this.object);
}
} 

class CodeRunner
{
	public static void main (String[] args)
	{
        DataStore <Integer> obj1 = new DataStore <Integer> (100);	
        obj1.getObject();	
        DataStore <Double> obj = new DataStore <Double> (1.90);
        obj.getObject();
	}
}
