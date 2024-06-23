import java.util.Scanner;
class Armstrong {
  public static void main(String[] args) {
    int num = 0;
    System.out.println("Enter number:");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    int n = num;
    int noOfDigit = (int)Math.log10(n) + 1;
    int sum = 0;
    while (n > 0) {
 	int lastDig = n % 10;
	sum = sum + (int)Math.pow(lastDig, noOfDigit);
	n = n / 10;
    } 
    if (sum == num) {
 	System.out.println("Number is Armstrong");
    } else {

 	System.out.println("Number is NOT Armstrong");
    }
  }
}
