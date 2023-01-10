import java.util.Scanner;

/** PartTime.java
*
* This is a simple PartTime class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The PartTime class is used to represent the simple concept of a
 * part-time member of a university.
 * The PartTime class consists of basic methods for creating a part-time member.
 */

public class PartTime extends Staff{

  /** The hourly salary of the part-time member. */
  protected double hourlySalary;

  /** The default constructor - calls the constructor of the super class
          * (Staff) and sets the member variable to 0.0.
  */
  public PartTime(){
    super();
    hourlySalary = 0.0;
  }

  /** The overloaded constructor - creates a part-time member of given address,
          * age, id #, name, phone number, starting year, title, building,
          * hourly salary.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param b String representing the staff's building
          * @param t String representing the staff's title
          * @param hS double representing the part-time's hourly salary
  */
  public PartTime(String ad, int ag, int i, String n, String pN, int sY, String b, String t, double hS){
    super(ad, ag, i, n, pN, sY, b, t);
    hourlySalary = hS;
  }

  /** Returns the hourly salary.
  * @return A double representing the hourly salary of the part-time
  */
  public double getHourlySalary(){
    return hourlySalary;
  }

  /** Sets the hourly salary.
  * @param hS The hourly salary to use for the part-time
  */
  public void setHourlySalary(double hS){
    hourlySalary = hS;
  }

  /** Returns a printed string representation of the part-time.
  * @return A string representation of the PartTime object
  */
  public String toString(){
    return("Part-Time, " + super.toString() + hourlySalary);
  }

  /** Prints the member variables and their values of the part-time. */
  public void print(){
    System.out.println("Type: Part-Time");
    super.print();
    System.out.println("\nHourly Salary:         " + hourlySalary);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the part-time class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the hourly salary: ");
    this.hourlySalary = sc.nextDouble();
  }
}
