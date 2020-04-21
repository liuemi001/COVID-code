import java.util.Scanner;

public class quiz {
	
	Scanner reader = new Scanner(System.in);
	public int riskvalue = 0;
	
	public void interrogate() {
		
		//contact with patients
		System.out.println("Have you been in contact with anyone with the virus in the past two weeks?");
		String x = reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+=10;
		
		//location
		System.out.println("Have you been in an area where the virus is prevalent in the past 2 weeks?");
		x=reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+=10;
		
		//serious symptoms
		//trouble breathing
		System.out.println("Are you experiencing trouble breathing?");
		x=reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+=10;
		
		//fever
		System.out.println("Do you have a fever over 100.4 degrees?");
		x=reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+= 8;
		
		//cough
		System.out.println("Do you have a dry persistent cough?");
		x=reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+=6;
		
		//peak flow meter
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
