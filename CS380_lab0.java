package packagetest;

public class CS380_lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Lab CS 380");	
		
		int num = 12345; //given number
		int rev = 0;	//reversed number
		
		System.out.println("Given Number: " + num);
		
		//iterate through num to reverse
		while(num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			
		}
			
		System.out.println("Reversed Number: " + rev);	
	}

}
