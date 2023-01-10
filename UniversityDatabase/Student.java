import java.util.Scanner;

/** Student.java
*
* This is a simple Student class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The Student class is used to represent the simple concept of a
 * student of a university.
 * The Student class consists of basic methods for creating a student.
 */

public abstract class Student extends Affiliate{

  /** The class standing of the student. */
  protected int classStanding;

  /** The major of the student. */
  protected String major;

  /** The minor of the student. */
  protected String minor;

  /** The default constructor - calls the constructor of the super class
          * (Affiliate) and sets the member variables to 0 and null, respectively.
  */
  public Student(){
    super();
    classStanding = 0;
    major = null;
    minor = null;
  }

  /** The overloaded constructor - creates a student of given address, age,
          * id #, name, phone number, starting year, class standing, major, and
          * minor.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param cS int representing the student's class standing
          * @param ma String representing the student's major
          * @param mi String representing the student's minor
  */
  public Student(String ad, int ag, int i, String n, String pN, int sY, int cS, String ma, String mi){
    super(ad, ag, i, n, pN, sY);
    classStanding = cS;
    major = ma;
    minor = mi;
  }

  /** Returns the class standing.
  * @return A int representing the class standing of the student
  */
  public int getClassStanding(){
    return classStanding;
  }

  /** Returns the major.
  * @return A String representing the major of the student
  */
  public String getMajor(){
    return major;
  }

  /** Returns the minor.
  * @return A String representing the minor of the student
  */
  public String getMinor(){
    return minor;
  }

  /** Sets the class standing.
  * @param cS The address to use for the student
  */
  public void setClassStanding(int cS){
    classStanding = cS;
  }

  /** Sets the major.
  * @param ma The address to use for the student
  */
  public void setMajor(String ma){
    major = ma;
  }

  /** Sets the minor.
  * @param mi The address to use for the student
  */
  public void setMinor(String mi){
    minor = mi;
  }

  /** Returns a printed string representation of the student.
  * @return A string representation of the Student object
  */
  public String toString(){
    return(super.toString() + classStanding + ", " + major + ", " + minor + ", ");
  }

  /** Prints the member variables and their values of the student. */
  public void print(){
    super.print();
    System.out.println("\nClass Standing:             " + classStanding +
    "\nMajor:                      " + major +
    "\nMinor:                      " + minor);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the student class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the class standing: ");
    this.classStanding = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the major: ");
    this.major = sc.nextLine();
    System.out.println("Enter the minor: ");
    this.minor = sc.nextLine();
  }
}
