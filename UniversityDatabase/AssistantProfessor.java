import java.util.Scanner;

/** AssistantProfessor.java
*
* This is a simple AssistantProfessor class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The AssistantProfessor class is used to represent the simple concept of a
 * assistant professor of a university.
 * The AssistantProfessor class consists of basic methods for creating a
 * assistant professor.
 */

public class AssistantProfessor extends Faculty{

  /** The number of years until tenure. */
  protected int yearsUntilTenure;

  /** The default constructor - calls the constructor of the super class
          * (Faculty) and sets the member variable to 0.
  */
  public AssistantProfessor(){
    super();
    yearsUntilTenure = 0;
  }

  /** The overloaded constructor - creates a assistant professor of given address,
          * age, id #, name, phone number, starting year, annual salary,
          * department, number of papers, and years until tenure.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param aS int representing the faculty's annual salary
          * @param d String representing the faculty's department
          * @param nOP int representing the faculy's number of papers
          * @param yUT int representing the assistant professor's years until tenure
  */
  public AssistantProfessor(String ad, int ag, int i, String n, String pN, int sY, int aS, String d, int nOP, int yUT){
    super(ad, ag, i, n, pN, sY, aS, d, nOP);
    yearsUntilTenure = yUT;
  }

  /** Returns the years until tenure.
  * @return A int representing the years until tenure of the assistant professor
  */
  public int getYearsUntilTenure(){
    return yearsUntilTenure;
  }

  /** Sets the years until tenure.
  * @param yUT The years until tenure to use for the assistant professor
  */
  public void setYearsUntilTenure(int yUT){
    yearsUntilTenure = yUT;
  }

  /** Returns a printed string representation of the assistant professor.
  * @return A string representation of the AssistantProfessor object
  */
  public String toString(){
    return("Assistant, " + super.toString() + yearsUntilTenure);
  }

  /** Prints the member variables and their values of the assistant professor. */
  public void print(){
    System.out.println("Type: Assistant Professor");
    super.print();
    System.out.println("\nYears Until Tenure:         " + yearsUntilTenure);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the assistant professor class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the years until tenure: ");
    this.yearsUntilTenure = sc.nextInt();
  }
}
