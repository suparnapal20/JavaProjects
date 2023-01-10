import java.util.Scanner;

/** Faculty.java
*
* This is a simple Faculty class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The Faculty class is used to represent the simple concept of a
 * faculty member of a university.
 * The Faculty class consists of basic methods for creating a faculty member.
 */

public abstract class Faculty extends Affiliate{

  /** The annual salary of the faculty member. */
  protected int annualSalary;

  /** The department of the faculty member. */
  protected String department;

  /** The number of papers of the faculty member. */
  protected int numberOfPapers;

  /** The default constructor - calls the constructor of the super class
          * (Affiliate) and sets the member variables to 0 and null, respectively.
  */
  public Faculty(){
    super();
    annualSalary = 0;
    department = null;
    numberOfPapers = 0;
  }

  /** The overloaded constructor - creates a faculty member of given address,
          * age, id #, name, phone number, starting year, annual salary,
          * department, and number of papers

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param aS int representing the faculty's annual salary
          * @param d String representing the faculty's department
          * @param nOP int representing the faculy's number of papers
  */
  public Faculty(String ad, int ag, int i, String n, String pN, int sY, int aS, String d, int nOP){
    super(ad, ag, i, n, pN, sY);
    annualSalary = aS;
    department = d;
    numberOfPapers = nOP;
  }

  /** Returns the annual salary.
  * @return A int representing the annual salary of the faculty
  */
  public int getAnnualSalary(){
    return annualSalary;
  }

  /** Returns the department.
  * @return A String representing the department of the faculty
  */
  public String getDepartment(){
    return department;
  }

  /** Returns the number of papers.
  * @return A int representing the number of papers of the faculty
  */
  public int getNumberOfPapers(){
    return numberOfPapers;
  }

  /** Sets the annual salary.
  * @param aS The annual salary to use for the faculty
  */
  public void setAnnualSalary(int aS){
    annualSalary = aS;
  }

  /** Sets the department.
  * @param d The department to use for the faculty
  */
  public void setDepartment(String d){
    department = d;
  }

  /** Sets the number of papers.
  * @param nOP The number of papers to use for the faculty
  */
  public void setNumberOfPapers(int nOP){
    numberOfPapers = nOP;
  }

  /** Returns a printed string representation of the faculty.
  * @return A string representation of the Faculty object
  */
  public String toString(){
    return(super.toString() + annualSalary +  ", " + department + ", " +
    numberOfPapers + ", ");
  }

  /** Prints the member variables and their values of the faculty. */
  public void print(){
    super.print();
    System.out.println("\nAnnual Salary:              " + annualSalary +
    "\nDepartment:                 " + department +
    "\nNumber Of Papers:           " + numberOfPapers);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the faculty class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the annual salary: ");
    this.annualSalary = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the department name: ");
    this.department = sc.nextLine();
    System.out.println("Enter the number of papers: ");
    this.numberOfPapers = sc.nextInt();
  }
}
