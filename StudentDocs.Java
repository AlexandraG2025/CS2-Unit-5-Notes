/** 
 * StudentDocs.Java
 * @author Alex Greenholtz
 * @since 6 Jan 25
 * @version 1.0
 * This class defines a student object and includes formal documentation comments 
 */
public class StudentDocs {
    private String firstName; 
    private String lastName;
    private int gradYear; 
    private String email;

    /**
     * Constructor that sets default values for each of the instance variables defined above
     */
    public StudentDocs() {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037; 
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    /** 
     * Constructors that assigns provided values to the object's instance variables, and creates an email address based on those values
     * @param initFirstName a String representing the Student's first name
     * @param initLastName a String representing the Student's last name
     * @param initGradYear an int representing the Student's graduation year
     */
    public StudentDocs(String initFirstName, String initLastName, int initGradYear) {
        firstName = initFirstName; 
        lastName = initLastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    public String toString() {
        return ("Student[" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }

    
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

    
    public void complain(){
        System.out.println("I don't want to be at school!");
    }

    
    public void do homework(int numAssignments){
        for (int i = numAssignments; i > 0; i ---) {
            System.out.println(Working,wokring,working...);
        }
        System.out.println("Done with homework!");
    }







}