import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


class InvalidException extends Exception
{
	public InvalidException(String message)
	{
		super (message);
	}
	
}

class Information1
	{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	public Information1(String name, int age, String fatherName, String city)
	{
	
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getCity() {
		return city;
	}
	@Override 
	public String toString() {
		return name +" "+ age +" "+fatherName +" "+city;
	}
	
}
class method
{
	
	public void method1() throws InvalidException
	{
	Information1 info1 = new Information1("jhon",34,"smith","america");
	Information1 info2 = new Information1("Will",12,"qmith","canada");
	Information1 info3 = new Information1("rocky",33,"shimith","russia");
	Information1 info4 = new Information1("villany",24,"sdijmith","turkey");
	
	HashMap hs = new HashMap();
	hs.put(3423, info1);
	hs.put(5434, info2);
	hs.put(5681, info3);
	hs.put(6456, info4);
	
	//System.out.println(hs);
	Set s1=hs.entrySet();
	
	Iterator i1= s1.iterator();
	Scanner scan =new Scanner (System.in);
	System.out.println("Please enter the passport number ");
	int p1= scan.nextInt();
	Boolean flag=false;

	while(i1.hasNext()) 
	{
		Map.Entry passport = (Entry) i1.next();
		Integer key= (Integer) passport.getKey();
		
		if(p1==key) 
		{
			System.out.println("Info =  "+ passport.getValue());
			flag=true;
		}
	}
	if (flag==false)
	{
		InvalidException ie=new InvalidException("Are you sure? try again bcz wrong input occuring");
		System.out.println(ie.getMessage());
//		System.out.println(ie);
//		System.out.println("you enter wrong input");
		throw ie;
		//System.out.println("Passport No.not found");
	}
	
	}
}

class initiate
{	
	public void initial()
	{
	method m= new method();
	try 
	{
		m.method1();
	}
	catch(InvalidException e)
	{
		try 
		{
			m.method1();
		}
		catch(InvalidException e1) 
		{
			System.out.println("Not match found");
		}
	}
	}
}

public class PassportApp_1 {

	public static void main(String[] args) {
		
		initiate i= new initiate ();
		i.initial();

	}

	}
