import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_ethan_primak {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            File file = new File("PolicyInformation.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String policyNum = fileScanner.nextLine();
                String providerName = fileScanner.nextLine();
                String firstName = fileScanner.nextLine();
                String lastName = fileScanner.nextLine();
                int age = Integer.parseInt(fileScanner.nextLine());
                String smokingStatus = fileScanner.nextLine();
                double height = Double.parseDouble(fileScanner.nextLine());
                double weight = Double.parseDouble(fileScanner.nextLine());

                Policy policy = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else if (smokingStatus.equalsIgnoreCase("non-smoker")) {
                    nonSmokerCount++;
                }

                if (fileScanner.hasNextLine()) { 
                    fileScanner.nextLine();                 
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("policyinformation.txt not found");
            return;
        }
        for (Policy policy : policies) {
            System.out.println();
            policy.displayPolicyDetails();
        }

        System.out.println();
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
