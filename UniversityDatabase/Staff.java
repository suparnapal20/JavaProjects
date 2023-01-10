import java.util.Scanner;

/** Staff.java
*
* This is a simple Staff class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The Staff class is used to represent the simple concept of a
 * staff member of a university.
 * The Staff class consists of basic methods for creating a staff member.
 */

public abstract class Staff extends Affiliate{

  /** The building of the staff member. */
  protected String building;

  /** The title of the staff member. */
  protected String title;

  /** The default constructor - calls the constructor of the super class
          * (Affiliate) and sets the member variables to 0 and null, respectively.
  */
  public Staff(){
    super();
    building = null;
    title = null;
  }

  /** The overloaded constructor - creates a staff member of given address,
          * age, id #, name, phone number, starting year, title, and building.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
          * @param b String representing the staff's building
          * @param t String representing the staff's title
  */
  public Staff(String ad, int ag, int i, String n, String pN, int sY, String b, String t){
    super(ad, ag, i, n, pN, sY);
    building = b;
    title = t;
  }

  /** Returns the building.
  * @return A String representing the building of the staff
  */
  public String getBuilding(){
    return building;
  }

  /** Returns the title.
  * @return A String representing the title of the staff
  */
  public String getTitle(){
    return title;
  }

  /** Sets the building.
  * @param b The building to use for the staff
  */
  public void setBuilding(String b){
    building = b;
  }

  /** Sets the title.
  * @param t The title to use for the staff
  */
  public void setTitle(String t){
    title = t;
  }

  /** Returns a printed string representation of the staff.
  * @return A string representation of the Staff object
  */
  public String toString(){
    return(super.toString() + building + ", " + title + ", ");
  }

  /** Prints the member variables and their values of the staff. */
  public void print(){
    super.print();
    System.out.println("\nBuilding:                   " + building +
    "\nTitle:                      " + title);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the staff class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    super.populateRecord();
    System.out.println("Enter the building name: ");
    this.building = sc.nextLine();
    System.out.println("Enter the title name: ");
    this.title = sc.nextLine();
  }
}
