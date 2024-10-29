import java.util.Scanner;

public class Project_ethan_primak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the Policy Number: ");
        String policyNum = scanner.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String fn = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String ln = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = Double.parseDouble(scanner.nextLine());

        Policy policy = new Policy(policyNum, providerName, fn, ln, age, smokingStatus, height, weight);

        System.out.println();
        policy.displayPolicyDetails();

        scanner.close();
    }
}
