import java.util.*;

public class TestDemo {
	
	public void Numbers(int a)
	{
		if(a<0)
		{
			System.out.println("You Have Entered Negative Value");
		}
		else if(a>0)
		{
			System.out.println("You Have Entered Positive Value");
		}
		else
		{
			System.out.println("You Have Entered Zero");
		}
	}

	public void Grades()
	{
		System.out.println("Enter the marks");
		int physics, chemistry,maths;
		Scanner digi= new Scanner(System.in);
		physics=digi.nextInt();
		chemistry=digi.nextInt();
		maths=digi.nextInt();
		int average=(physics+chemistry+maths)/3;
		
		if (average<61)
		{
			System.out.println("The grade is C");
		}
		else if (average>70)
		{
			System.out.println("The grade is A");
		}
		else
		{
			System.out.println("The grade is B");
		}
	}
	public static void main(String[] args) 
	{
		TestDemo obj=new TestDemo();
	//	obj.Numbers(-1);
		obj.Grades();

	}

}
