class BulbCompany {

    // Instance variables for each bulb
    int bulbWatt;
    float bulbPrice;
    String bulbColor;
    boolean bulbState;
    
    // Static variables shared among all instances
    static int bulbQuantity;          // Tracks the total number of bulbs created
    static String bulbCompanyName;    // Holds the company name for all bulbs

    // Static initialization block: runs once when the class is first loaded
    static {
        bulbQuantity = 0;            // Initialize the static variable
        bulbCompanyName = "Orient";  // Set the default company name
        System.out.println("----------------Welcome to " + bulbCompanyName + " Bulb Making Company----------------");
        System.out.println("");
    }

    // Instance initialization block runs every time an instance is created
    {
        bulbQuantity++;  // Increment the bulb quantity for each new object
    }

    // Default constructor
    BulbCompany() {
        // Initialize the bulb properties with default values
        bulbWatt = 100;
        bulbPrice = 25;
        bulbColor = "Red";
        bulbState = true;
    }

    // Parameterized constructor
    BulbCompany(int w, float p, String c, boolean b) {
        // Initialize the bulb properties with specified values
        bulbWatt = w;
        bulbPrice = p;
        bulbColor = c;
        bulbState = b;
    }

    // Method to display details of the bulb
    void showBulbDetails() {
        System.out.println("Watt of Bulb: " + bulbWatt);
        System.out.println("Color of Bulb: " + bulbColor);
        System.out.println("Price of Bulb: " + bulbPrice);
        System.out.println("State of Bulb: " + bulbState);
        System.out.println("Company Name of Bulb: " + bulbCompanyName);
    }

    // Method to toggle the state of the bulb
    void changeBulbState() {
        bulbState = !bulbState;  // Toggle the state (true to false or false to true)
    }

    // Static method to display the total quantity of bulbs
    static void countBulb() {
        System.out.println("Total Quantity Of Bulbs Is: " + bulbQuantity);
    }

    // Method to change the company name for all bulbs
    void changeCompanyName(String cName) {
        bulbCompanyName = cName;  // Update the static variable
    }

    public static void main(String args[]) {
        // Display the initial bulb quantity
        BulbCompany.countBulb();
        System.out.println("");

        
        System.out.println("-------------Creating Same Type Of Bulb----------");
        System.out.println("");
        
        BulbCompany b1 = new BulbCompany();  // Create a new bulb with default values
        System.out.println("Details of Bulb 1");
        b1.showBulbDetails();
        System.out.println("---------------");

        BulbCompany b2 = new BulbCompany();  // Create another new bulb with default values
        System.out.println("Details of Bulb 2");
        b2.showBulbDetails();
        System.out.println("---------------");

        BulbCompany b3 = new BulbCompany();  // Create yet another new bulb with default values
        System.out.println("Details of Bulb 3");
        b3.showBulbDetails();
        System.out.println("---------------");

        // Display the updated bulb quantity
        countBulb();
        System.out.println("");

        // Create and display details of bulbs with different properties
        System.out.println("-------Creating Different Type Of Bulb----------");
        System.out.println("");
        
        BulbCompany b4 = new BulbCompany(250, 56, "yellow", true);  // Create a bulb with custom values
        System.out.println("Details of Bulb 4");
        b4.showBulbDetails();
        System.out.println("");

        BulbCompany b5 = new BulbCompany(20, 16, "Blue", true);  // Create another bulb with custom values
        System.out.println("Details of Bulb 5");
        b5.showBulbDetails();
        System.out.println("");

        BulbCompany b6 = new BulbCompany(78, 500, "Green", false);  // Create a third bulb with custom values
        System.out.println("Details of Bulb 6");
        b6.showBulbDetails();
        countBulb();
        System.out.println("");

        // Change the state of a bulb and display updated details
        b6.changeBulbState();
        System.out.println("----------Details Of Bulb 6 After State Change--------");
        b6.showBulbDetails();

        // Change the company name and display updated details
        b5.changeCompanyName("Samsung");
        System.out.println("----------Details Of Bulb 5 After Company Name Change--------");
        b5.showBulbDetails();
    }
}
