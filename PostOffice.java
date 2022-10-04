import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class PostOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data: ");
		String line = scan.nextLine();
		
		Scanner lineScan = new Scanner(line).useDelimiter(", ");
		
		double length1 = lineScan.nextDouble();
		double width1 = lineScan.nextDouble();
		double thickness1 = lineScan.nextDouble();
		double weight1 = lineScan.nextDouble();

		BoxSize package1 = new BoxSize(length1, width1, thickness1, weight1);
		NumberFormat formatter = new DecimalFormat("#0.00");
		System.out.print(package1.findBoxSize() + " " + formatter.format(package1.mailingCosts(package1.findBoxSize())));
	}

}
