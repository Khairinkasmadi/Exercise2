package exercise;

public class main {
	
	
     public static void main(String args[]) {
		
		Personal obj1 = new Personal();
		Works    obj2 = new Works();
		Result   obj3 = new Result();
		Cgpa     obj4 = new Cgpa();
		
		
		
	
		
		System.out.println("Resume" + "\n \n" + 
		                   "Name              : " + obj1.name + " " + "\n" + 
				           "Age               : " + obj1.age + " years old" + "\n" + 
		                   "Address           : " + obj1.add + "\n" +
				           "Email             : " + obj1.ema + "\n" +
		                   "Contact           : " + obj1.num);
		
       
		System.out.println("Work Experiences  : " + obj2.experience + "\n" + 
		                   "Work Skills       : " + obj2.skill + "\n" +
		                   "Talents           : " + obj2.talent);
		
		
		System.out.println("Programming result: " + obj3.subject);
		
		
		obj4.printcgpa();
	
}
     
}
