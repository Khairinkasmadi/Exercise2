package exercise;

public class Personal {
	
	String name;
	String add;
	String num;
	String ema;
	int    age;
	
	Personal() {                                            //default constructor
		
		this.name = "Muhammad Khairin Bin Kasmadi";
		this.age  = 22;
		this.add  = "2A Lorong Bukit Minyak 19, Taman Bukit Minyak Indah, 14000 Bukit Mertajam, Penang.";
		this.ema  = "muhdkharin@gmail.com";
		this.num  = "+601137848821";
		
	}
	
	Personal( String n, String b, String c, String e, int a) {       //constructor with parameter
		
		this.name=n;
		this.age=a;
		this.add=b;
		this.num=c;
		this.ema=e;
		
		
	}
	

}
