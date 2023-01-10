import java.util.Scanner;

/** Graduate.java
*
* This is a simple Graduate class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The Graduate class is used to represent the simple concept of an
 * graduate of a university.
 * The Graduate class consists of basic methods for creating a graduate.
 */

public class Graduate extends Student{

  /** The number of published papers of the graduate. */
  protected int numberOfPublishedPapers;

  /** The thesis advisor of the graduate. */
  protected String thesisAdvisor;

  /** The default constructor - calls the constructor of the super class
          * (Student) and sets the member variables to 0 and null, respectively.
  */
  public Graduate(){
    super();
    numberOfPublishedPapers = 0;
    thesisAdvisor = null;
  }

  /** The overloaded constructor - creates a student of given address, age,
          * id #, name, phone number, starting year, class standing, major,
          * minor, number of published papers, and thesis advisor.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param cS int representing the student's class standing
          * @param ma String representing the student's major
          * @param mi String representing the student's minor
          * @param nOPP int representing the graduate's number of published papers
          * @param tA String representing the graduate's thesis advisor
  */
  public Graduate(String ad, int ag, int i, String n, String pN, int sY, int cS, String ma, String mi, int nOPP, String tA){
    super(ad, ag, i, n, pN, sY, cS, ma, mi);
    numberOfPublishedPapers = nOPP;
    thesisAdvisor = tA;
  }

  /** Returns the number of published papers taken.
  * @return A int representing the published papers by the graduate
  */
  public int getNumberOfPublishedPapers(){
    return numberOfPublishedPapers;
  }

  /** Returns the number of courses taken.
  * @return A String representing the thesis advisor of the undergraduate
  */
  public String getThesisAdvisor(){
    return thesisAdvisor;
  }

  /** Sets the number of published papers.
  * @param nOPP The number of published papers to use for the graduate
  */
  public void setNumberOfPublishedPapers(int nOPP){
    numberOfPublishedPapers = nOPP;
  }

  /** Sets the thesis advisor.
  * @param tA The thesis advisor to use for the graduate
  */
  public void setThesisAdvisor(String tA){
    thesisAdvisor = tA;
  }

  /** Returns a printed string representation of the graduate.
  * @return A string representation of the Graduate object
  */
  public String toString(){
    return("Graduate, " + super.toString() + numberOfPublishedPapers + ", " + thesisAdvisor);
  }

  /** Prints the member variables and their values of the graduate. */
  public void print(){
    System.out.println("Type: Graduate");
    super.print();
    System.out.println("\nNumber of Published Papers: " + numberOfPublishedPapers +
    "\nThesis Advisor:             " + thesisAdvisor);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the graduate class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the number of published papers: ");
    this.numberOfPublishedPapers = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the name of thesis advisor: ");
    this.thesisAdvisor = sc.nextLine();
  }
}
