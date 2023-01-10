import java.util.Scanner;

/** FullTime.java
*
* This is a simple FullTime class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The RullTime class is used to represent the simple concept of a
 * full-time member of a university.
 * The FullTime class consists of basic methods for creating a full-time member.
 */

public class FullTime extends Staff{

  /** The annual salary of the full-time member. */
  protected int annualSalary;

  /** The default constructor - calls the constructor of the super class
          * (Staff) and sets the member variable to 0.
  */
  public FullTime(){
    super();
    annualSalary = 0;
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
          * @param aS double representing the full-time's annual salary
  */
  public FullTime(String ad, int ag, int i, String n, String pN, int sY, String b, String t, int aS){
    super(ad, ag, i, n, pN, sY, b, t);
    annualSalary = aS;
  }

  /** Returns the annual salary.
  * @return A int representing the annual salary of the full-time member
  */
  public int getAnnualSalary(){
    return annualSalary;
  }

  /** Sets the annual salary.
  * @param aS The annual salary to use for the full-time member
  */
  public void setAnnualSalary(int aS){
    annualSalary = aS;
  }

  /** Returns a printed string representation of the full-time.
  * @return A string representation of the FullTime object
  */
  public String toString(){
    return("Full-Time, " + super.toString() + annualSalary);
  }

  /** Prints the member variables and their values of the full-time. */
  public void print(){
    System.out.println("Type: Full-Time");
    super.print();
    System.out.println("\nAnnual Salary:         " + annualSalary);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the full-time class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the annual salary: ");
    this.annualSalary = sc.nextInt();
  }
}
