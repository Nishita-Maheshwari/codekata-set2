import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		
		int rev = 0, rem,actual_num,temp_num;

		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter any number :");

		
		actual_num = sc.nextInt();
		temp_num = actual_num;

		while(temp_num > 0){
			
			rem = temp_num % 10;
			
			rev = rev*10+rem;
			
			temp_num = temp_num/10;
		}
		if(rev == actual_num)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}
}
