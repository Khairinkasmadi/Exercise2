package exercise;

import java.text.DecimalFormat;

public class Cgpa {
	
	int sem;
	double[] gpa = new double[5];
	double sum, finalcgpa;
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	Cgpa() {
		
		this.gpa = new double[] {3.0, 3.2, 3.4, 3.9};
			
	
	}
	
	Cgpa(double[] a) {
		
		this.gpa = a;
		
	}
	
	public void printcgpa() {
		
		Cgpa obj4 = new Cgpa();
		System.out.println("Gpa               :");
		
		
		for(int i=0; i<obj4.gpa.length; i++) {
			
			System.out.println("                  : Sem " +(i+1) +"\t" + obj4.gpa[i]);
			
			sum+=obj4.gpa[i];
			
		}
		finalcgpa=sum/5;
		System.out.println("Cgpa              : "+df.format(finalcgpa));
	}


}
