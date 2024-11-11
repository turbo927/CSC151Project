public class Policy {

    private String policyNum;
    private String providerName;
    private String fn;
    private String ln;
    private int age;
    private String smokingStatus;
    private double height; 
    private double weight;

    /**
     *initializes all fields to default
     */
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

    /**
     * Policy object
     *
     * @param policyNum is the policy number
     * @param providerName is the provider name
     * @param fn is the policyholders first name
     * @param ln is the policyholders last name
     * @param age is the policyholders age
     * @param smokingStatus is the policyholders smoking status
     * @param height is the policyholders height in inches
     * @param weight is the policyholders weight in pounds
     */
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

    /**
     * get the policy number
     *
     * @return the policy number
     */
    public String getPolicyNumber() {
        return policyNum;
    }

    /**
     * sets the policy number
     *
     * @param policyNum the policy number to set
     */
    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    /**
     * get the provider name
     *
     * @return the provider name
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * set the provider name
     *
     * @param providerName the provider name to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * getthe policyholders first name
     *
     * @return the policyholders first name
     */
    public String getFN() {
        return fn;
    }

    /**
     * sets the policyholders first name
     *
     * @param fn the first name to set
     */
    public void setFN(String fn) {
        this.fn = fn;
    }

    /**
     * gets the policyholders last name
     *
     * @return the policyholders last name
     */
    public String getLN() {
        return ln;
    }

    /**
     * ets the policyholders last name
     *
     * @param ln the last name to set
     */
    public void setLN(String ln) {
        this.ln = ln;
    }

    /**
     * gets the policyholders age
     *
     * @return the policyholder's age
     */
    public int getAge() {
        return age;
    }

    /**
     * sets the policyholders age
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * gets the policyholders smoking status.
     *
     * @return the policyholders smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * sets the policyholders smoking status
     *
     * @param smokingStatus the smoking status to set
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * gets the policyholders height in inches
     *
     * @return the policyholders height
     */
    public double getHeight() {
        return height;
    }

    /**
     * sets the policyholders height in inches
     *
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * get the policyholders weight in pounds.
     *
     * @return the policyholder's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * set the policyholders weight in pounds
     *
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * calculate the BMI of the policyholder
     *
     * @return the calculated BMI
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * calculates the price of the policy
     *
     * @return the calculated policy price
     */
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

    /**
     * displays the details of the policy
     */
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
