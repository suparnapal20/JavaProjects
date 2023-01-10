import java.util.Scanner;

/** AssociateProfessor.java
*
* This is a simple AssociateProfessor class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The AssociateProfessor class is used to represent the simple concept of a
 * associate professor of a university.
 * The AssociateProfessor class consists of basic methods for creating a
 * associate professor.
 */

public class AssociateProfessor extends Faculty{

  /** The number of years until tenure. */
  protected int yearsSinceTenure;

  /** The default constructor - calls the constructor of the super class
          * (Faculty) and sets the member variable to 0.
  */
  public AssociateProfessor(){
    super();
    yearsSinceTenure = 0;
  }

  /** The overloaded constructor - creates a associate professor of given
          * address, age, id #, name, phone number, starting year, annual salary,
          * department, number of papers, and years since tenure.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param aS int representing the faculty's annual salary
          * @param d String representing the faculty's department
          * @param nOP int representing the faculy's number of papers
          * @param yST int representing the assistant professor's years since tenure
  */
  public AssociateProfessor(String ad, int ag, int i, String n, String pN, int sY, int aS, String d, int nOP, int yST){
    super(ad, ag, i, n, pN, sY, aS, d, nOP);
    yearsSinceTenure = yST;
  }

  /** Returns the years since tenure.
  * @return A int representing the years since tenure of the associate professor
  */
  public int getYearsSinceTenure(){
    return yearsSinceTenure;
  }

  /** Sets the years since tenure.
  * @param yST The years since tenure to use for the associate professor
  */
  public void setYearsSinceTenure(int yST){
    yearsSinceTenure = yST;
  }

  /** Returns a printed string representation of the associate professor.
  * @return A string representation of the AssociateProfessor object
  */
  public String toString(){
    return("Associate, " + super.toString() + yearsSinceTenure);
  }

  /** Prints the member variables and their values of the associate professor. */
  public void print(){
    System.out.println("Type: Associate Professor");
    super.print();
    System.out.println("\nYears Since Tenure:         " + yearsSinceTenure);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the associate professor class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the years since tenure: ");
    this.yearsSinceTenure = sc.nextInt();
  }
}
