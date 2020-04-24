import java.io.*;
import java.util.*;

public class DataCrunch {
	Scanner reader = new Scanner(System.in);
	BufferedReader br;
	StringTokenizer st;
	
	Scanner reader = new Scanner(System.in);
	public int riskvalue = 0;
	
	public void GetRisk() {
		
	
		
	}
	public void interrogate() {
		
		//peak flow meter
		System.out.println();
		
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
		
		//life threatening symptoms
		System.out.println("How many (if any) of the following life threatening symptoms are you experiencing?");
		System.out.println("Blue colored lips or face, severe and constant pain or pressure in the chest,");
		System.out.println("severe and constant dizziness or lightheadedness, acting confused, unconscious or very difficult to wake up,");
		System.out.println("slurred speech, new seizures or seizures that won't stop");
		int y = reader.nextInt();
		riskvalue+=y*100;
	
		//serious symptoms
		System.out.println("How many (if any) of the following symptoms are you experiencing?");
		System.out.println("Moderate to severe difficulty breathing (unable to speak full sentences)");
		System.out.println("Coughing up blood (more than about 1 teaspoon)");
		System.out.println("Signs of low blood pressure (feeling cold, pale, clammy skin, light-headed, too weak to stand)");
		y = reader.nextInt();
		riskvalue+=y*30

		//risky symptoms
		//trouble breathing
		System.out.println("Are you experiencing trouble breathing?");
		x=reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+=25;
		
		//fever
		System.out.println("Do you have a fever over 100.4 degrees?");
		x=reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+= 23;
		
		//cough
		System.out.println("Do you have a dry persistent cough?");
		x=reader.nextLine();
		if (x.equals("yes")) 
			riskvalue+=21;
		
		//sus symptoms
		System.out.println("How many (if any) of the following symptoms are you experiencing?");
		System.out.println("Runny or stuffy nose; Sore throat; Muscle aches, body aches, or headache;");
		System.out.println("Tiredness or fatigue; Nausea, vomiting, or diarrhea");
		y= reader.nextInt();
		riskvalue +=y*2
			
		//nursing home location
		System.out.println("Do you live in a nursing home or long term care facility?");
		x = reader.nextLine();
		if (x.equalsIgnoreCase("yes"))
			riskvalue+=10;
		
		//underlying conditions
		System.out.println("How many (if any) of these conditions do you have?");
		System.out.println("Chronic lung disease, moderate to severe asthma, or smoking; Serious heart conditions");
		System.out.println("Weakened immune system, (cancer treatment, prolonged use of steroids, transplant, or HIV/AIDS)");
		System.out.println("Pregnancy; Severe obesity (BMI >=40); Underlying conditions (diabetes, renal failure, or liver disease)");
		y=reader.nextInt();
		riskvalue+=y*2
	}
	
	public int getPeak() throws IOException{
		System.out.println("What is your sex?\n1. Male\n2. Female\n3. Other");
		int sex = reader.nextInt();
		if (sex == 2) {
			br = new BufferedReader(new FileReader("female.in"));
		}
		else {
			br = new BufferedReader(new FileReader("male.in"));
		}
		st = new StringTokenizer(br.readLine());
		double[] hm = new double[5];
		for (int i = 0; i < 5; i++) {
			hm[i] = Double.parseDouble(st.nextToken());
		}
		System.out.println("Please enter your height in meters.");
		double height = reader.nextDouble();
		int hc = 0;
		if (height > hm[4]) {
			hc = 4;
		}
		else {
			for (int i = 0; i < 5; i++) {
				if (height <= hm[i]) {
					hc = i;
					break;
				}
			}
		}
		int[] age = {15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};
		double[][] vals = new double[15][5];
		for (int i = 0; i < 15; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			for (int j = 0; j < 5; j++) {
				vals[i][j] = Double.parseDouble(st.nextToken());
			}
		}
		System.out.println("Please enter your age.");
		int entAge = reader.nextInt();
		int ac = 0;
		if (entAge < 40) {
			for (int i = 0; i < 6; i++) {
				if (entAge < age[i]) {
					ac = i;
					break;
				}
			}
		}
		else {
			for (int i = 6; i < 15; i++) {
				if (entAge >= age[i]) {
					ac = i;
					break;
				}
			}
		}
		return (int) vals[hc][ac];
	}
}
