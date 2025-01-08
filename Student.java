/* Example CLASS that defines an OBJECT
Class names like Student are always capitalized!
Object-Oriented Classes are like BLUEPRINTS
(in another Java class, you create instances from this blueprint)
*/
public class Student {
    // 1. INSTANCE VARIABLES (attributes/data/fields)
    // think of what this object "needs to know"
    // must be PRIVATE ("encapsulation")
    private String firstName; // "a Student has a first name"
    private String lastName;
    private int gradYear; 
    private String email;
    // STATIC variables for data that should only have ONE COPY for an entire class 
    private static int currentYear = 2025; 
    private static String schoolName = "BWL";
    private static int studentCount = 0; // COUNTER!!
    // static does NOT mean unchanging/constant here: instead, the keyword FINAL would be used

    // 2. CONSTRUCTORS (manuals for setting up an object)

    // DEFAULT constructor (user did not provide data)
    // "no-argument" constructor
    // Job: initialize instance variables to DEFAULT values
    public Student() {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037; 
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
        // increment the student object counter static variable
        studentCount++;
    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    // ORDER OF PARAMETERS IS IMPORTANT!!! (the data types)
    // "initFirstName", etc. are like PLACEHOLDERS for real values
    public Student(String initFirstName, String initLastName, int initGradYear) {
        firstName = initFirstName; 
        lastName = initLastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
        studentCount++; 
    }

    // 3. METHODS (behaviors associated w/the object type)

    // toString method provides a "String Representation"
    // of an object instance with all its data!
    public String toString() {
        return ("Student[" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }

    // ACCESSOR METHODS ("Getters") return copies of the private data
    // write one for each of your instance variables!
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getGradYear() {
        return gradYear;
    }
    public String getEmail() {
        return email;
    }

    //MUTATOR METHODS ("Stetters") accept a new value and change the instance variable to it 
    // Stters are VOID meaning NO RETURN (output)
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setlastName(String newlastName) {
        lastName = newlastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    //OTHER METHODS (behavoirs/actions associated with the object)
    // Example: VOID method, no parameters
    public void complain(){
        //Method BODY is the steps for this process
        System.out.println("I don't want to be at school!");
    }

    //Example; VOID method, need a parameter

    public void doHomework(int numAssignments){
        // print a message fpr each assignment completed
        for (int i = numAssignments; i > 0; i--) {
            System.out.println("Working,wokring,working...");
        }
        System.out.println("Done with homework!");
    }

    // Example: interact with a static variable
    // METHODS can also be STATIC - meaning that the behavior/action is associate with the eniter CLASS rather that one object
    public static void printObjectCount() {
        System.out.println(studentCount);
    }







}