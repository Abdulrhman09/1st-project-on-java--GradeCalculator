import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		System.out.println("It is recommended that you check your ideal weight before your score ");
		
		
		Scanner reader = new Scanner(System.in);
		System.out.print("ENTER YOUR NAME: " );
		String name = reader.nextLine();
		System.out.print("ENTER YOUR height: " );
    double height = reader.nextDouble();
    int ratio =22;
    double ibw = Math.pow(height/100, 2) * ratio;
    
    System.out.println("The ideal Weight For " + name + " is " + ibw + " kg. " );
	//double weight = redaer.nextDouble();
		
		
		
		
		
		//Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter Your Grade: ");
	
		double grade = reader.nextDouble();
		
		
		
		
		if (grade > 100)
		{
			System.out.println("SORRY YOU ENTERED A WRONG NUMBER!! ");
		}
		else if (grade < 0)
		{
			System.out.println("SORRY YOU ENTERED A WRONG NUMBER!! ");
		}
		else if (grade >=90)	
		{
			System.out.println("Your Grade Is " + grade + "." );
		System.out.println("YOU GOT AN (A). ");
	}
	else if (grade >=80)
		
	{
		System.out.println("YOU GOT AN (B). ");
	}
	else if (grade >=70)
	{
		System.out.println("YOU GOT AN (C). ");
	}
	else if (grade >=60)
	{
		System.out.println("YOU GOT AN (D). ");
	}

	else
	{
		System.out.println("YOU(DID NOT) PASSED THE CLASS. ");
		
	double grades[] = new double[60];
		
		System.out.println("FAILURE GRADES" );
for(int i=0; i<60; i++)
				System.out.println(i);
	System.out.println("SEE U NEXT CLASS");
	}
		
		// HERE HOW TO CHECK  FAILURE GRADES
	//double grades[] = new double[60];
		
		//System.out.println("FAILURE GRADES" );
//for(int i=0; i<60; i++)
			//	System.out.println(i);
	//System.out.println("ELSE YOU ARE SUCCESS");
	}

}