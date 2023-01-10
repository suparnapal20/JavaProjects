import java.util.Scanner;

/** FullProfessor.java
*
* This is a simple FullProfessor class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The FulleProfessor class is used to represent the simple concept of a
 * full professor of a university.
 * The FullProfessor class consists of basic methods for creating a
 * full professor.
 */

public class FullProfessor extends Faculty{

  /** The number of years until retirement. */
  protected int yearsUntilRetirement;

  /** The default constructor - calls the constructor of the super class
          * (Faculty) and sets the member variable to 0.
  */
  public FullProfessor(){
    super();
    yearsUntilRetirement = 0;
  }

  /** The overloaded constructor - creates a full professor member of given
          * address, age, id #, name, phone number, starting year, annual salary,
          * department, number of papers, and years until retirement.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param aS int representing the faculty's annual salary
          * @param d String representing the faculty's department
          * @param nOP int representing the faculy's number of papers
          * @param yST int representing the assistant professor's years until
                * retirement
  */
  public FullProfessor(String ad, int ag, int i, String n, String pN, int sY, int aS, String d, int nOP, int yUR){
    super(ad, ag, i, n, pN, sY, aS, d, nOP);
    yearsUntilRetirement = yUR;
  }

  /** Returns the years until retirement.
  * @return A int representing the years until retirement of the full professor
  */
  public int getYearsUntilRetirement(){
    return yearsUntilRetirement;
  }

  /** Sets the years until retirement.
  * @param yUR The years until retirement to use for the full professor
  */
  public void setYearsUntilRetirement(int yUR){
    yearsUntilRetirement = yUR;
  }

  /** Returns a printed string representation of the full professor.
  * @return A string representation of the FullProfessor object
  */
  public String toString(){
    return("Full, " + super.toString() + yearsUntilRetirement);
  }

  /** Prints the member variables and their values of the full professor. */
  public void print(){
    System.out.println("Type: Full Professor");
    super.print();
    System.out.println("\nYears Until Retirement:         " + yearsUntilRetirement);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the full professor class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the years until retirement: ");
    this.yearsUntilRetirement = sc.nextInt();
  }
}
