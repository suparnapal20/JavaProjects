import java.util.Scanner;

/** Undergraduate.java
*
* This is a simple Undergraduate class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The Undergraduate class is used to represent the simple concept of an
 * undergraduate of a university.
 * The Undergraduate class consists of basic methods for creating a undergraduate.
 */

public class Undergraduate extends Student{

  /** The number of courses taken of the undergraduate. */
  protected int coursesTaken;

  /** The scholarship amount of the undergraduate. */
  protected int scholarshipAmount;

  /** The default constructor - calls the constructor of the super class
          * (Student) and sets the member variables to 0 and null, respectively.
  */
  public Undergraduate(){
    super();
    coursesTaken = 0;
    scholarshipAmount = 0;
  }

  /** The overloaded constructor - creates a student of given address, age,
          * id #, name, phone number, starting year, class standing, major,
          * minor, number of courses taken, and scholarship amount.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param cS int representing the student's class standing
          * @param ma String representing the student's major
          * @param mi String representing the student's minor
          * @param cT int representing the undergraduate's number of courses taken
          * @param sA int representing the undergraduate's scholarship amount
  */
  public Undergraduate(String ad, int ag, int i, String n, String pN, int sY, int cS, String ma, String mi, int cT, int sA){
    super(ad, ag, i, n, pN, sY, cS, ma, mi);
    coursesTaken = cT;
    scholarshipAmount = sA;
  }

  /** Returns the number of courses taken.
  * @return A int representing the number of courses taken by the undergraduate
  */
  public int getCoursesTaken(){
    return coursesTaken;
  }

  /** Returns the scholarship amount.
  * @return A int representing the scholarship amount by the undergraduate
  */
  public int getScholarshipAmount(){
    return scholarshipAmount;
  }

  /** Sets the number of courses taken.
  * @param cT The number of courses taken to use for the undergraduate
  */
  public void setCoursesTaken(int cT){
    coursesTaken = cT;
  }

  /** Sets the scholarship amount.
  * @param sA The scholarship amount to use for the undergraduate
  */
  public void setScholarshipAmount(int sA){
    scholarshipAmount = sA;
  }

  /** Returns a printed string representation of the undergraduate.
  * @return A string representation of the Undergraduate object
  */
  public String toString(){
    return("Undergraduate, " + super.toString() + coursesTaken + ", " + scholarshipAmount);
  }

  /** Prints the member variables and their values of the undergraduate. */
  public void print(){
    System.out.println("Type: Undergraduate");
    super.print();
    System.out.println("\nCourses Taken:              " + coursesTaken +
    "\nScholarship Amount:         " + scholarshipAmount);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the undergraduate class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the number of courses taken: ");
    this.coursesTaken = sc.nextInt();
    System.out.println("Enter the scholarship amount: ");
    this.scholarshipAmount = sc.nextInt();
  }
}
