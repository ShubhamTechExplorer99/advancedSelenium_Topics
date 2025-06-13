package accessModifierCheck;
public class InfosysInterviw {
    // Global (instance) variable
    int instanceVariable = 10;

    // Static variable
    static int staticVariable = 20;

    public void demonstrateVariables() {
        // Local variable
        int localVariable = 30;

        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        // Creating an object to access instance variables
    	InfosysInterviw example = new InfosysInterviw();

        // Accessing global (instance) and local variables through the method
        example.demonstrateVariables();

        // Accessing the static variable directly using the class name
        System.out.println("Accessing Static Variable without object: " + InfosysInterviw.staticVariable);
    }
}
