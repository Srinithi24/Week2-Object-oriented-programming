import java.util.Scanner;
public class PalindromeChecker {
	String text;
	
	public PalindromeChecker(String text) {
        this.text = text;
		
    }
	public boolean isPalindrome(){
		String rev = new StringBuilder(text).reverse().toString();
		return text.equalsIgnoreCase(rev);
		
	}
	public void displayDetails() {
		System.out.println("Text: "+text);
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = scan.nextLine();
		PalindromeChecker t = new PalindromeChecker(text);
		t.displayDetails();
		if(t.isPalindrome()){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	scan.close();
	}

}