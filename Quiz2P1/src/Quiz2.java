import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the rate of the University tuition fee: ");
		int r=input.nextInt();
		int fee = 12342;
		double Total;
		Total = fee + fee*(1+r/100) + fee*(1+r/100)*(1+r/100)+fee*(1+r/100)*(1+r/100)*(1+r/100);
		System.out.println("The total fee to graduate would be: "+ Total);
	}

}
