public class Policy {

    private String policyNum;
    private String providerName;
    private String fn;
    private String ln;
    private int age;
    private String smokingStatus;
    private double height; 
    private double weight;
    
    public Policy() {
        this.policyNum = "";
        this.providerName = "";
        this.fn = "";
        this.ln = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Policy(String policyNum, String providerName, String fn, String ln, int age, String smokingStatus, double height, double weight) {
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.fn = fn;
        this.ln = ln;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    public String getPolicyNumber() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getFN() {
        return fn;
    }

    public void setFN(String fn) {
        this.fn = fn;
    }

    public String getLN() {
        return ln;
    }

    public void setLN(String ln) {
        this.ln = ln;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    public double calculatePolicyPrice() {
        double baseFee = 600;
        double additionalFee = 0;

        if (age > 50) {
            additionalFee += 75;
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            additionalFee += 100;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }
    
    public void displayPolicyDetails() {
        System.out.printf("Policy Number: %s\n", policyNum);
        System.out.printf("Provider Name: %s\n", providerName);
        System.out.printf("Policyholder's First Name: %s\n", fn);
        System.out.printf("Policyholder's Last Name: %s\n", ln);
        System.out.printf("Policyholder's Age: %d\n", age);
        System.out.printf("Policyholder's Smoking Status: %s\n", smokingStatus);
        System.out.printf("Policyholder's Height: %.1f inches\n", height);
        System.out.printf("Policyholder's Weight: %.1f pounds\n", weight);
        System.out.printf("Policyholder's BMI: %.2f\n", calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", calculatePolicyPrice());
    }
}