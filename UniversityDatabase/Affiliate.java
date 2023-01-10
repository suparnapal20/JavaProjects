import java.util.Scanner;

/** Affiliate.java
*
* This is a simple Affiliate class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The Affiliate class is used to represent the simple concept of an
 * affiliate of a university.
 * The Affiliate class consists of basic methods for creating an affiliate.
 */

public abstract class Affiliate implements Printable, Comparable<Affiliate>{

  /** The address of the university affiliate. */
  protected String address;

  /** The age of the university affiliate. */
  protected int age;

  /** The id # of the university affiliate. */
  protected int id;

  /** The name of the university affiliate. */
  protected String name;

  /** The phone number of the university affiliate. */
  protected String phoneNumber;

  /** The starting year of the university affiliate. */
  protected int startingYear;

  /** The default constructor - sets address, name, and phone number to null
          * and the age, id, and starting year to 0.
  */
  public Affiliate(){
    address = null;
    age = 0;
    id = 0;
    name = null;
    phoneNumber = null;
    startingYear = 0;
  }

  /** The overloaded constructor - creates an affiliate of given address, age,
          * id #, name, phone number, and starting year.

          * @param ad String representing the affiliate's address
          * @param ag int representing the affiliate's age
          * @param i int representing the affiliate's id #
          * @param n String representing the affiliate's name
          * @param pN String representing the affiliate's phone number
          * @param sY int representing the affiliate's starting year
  */
  public Affiliate(String ad, int ag, int i, String n, String pN, int sY){
    address = ad;
    age = ag;
    id = i;
    name = n;
    phoneNumber = pN;
    startingYear = sY;
  }

  /** The copy constructor - creates an affiliate of given address, age, id #,
          * name, phone number, and starting year from a pre-existing affiliate object.

          * @param a Affiliate representing a pre-existing affiliate object
  */
  public Affiliate(Affiliate a){
    address = a.address;
    age = a.age;
    id = a.id;
    name = a.name;
    phoneNumber = a.phoneNumber;
    startingYear = a.startingYear;
  }

  /** Returns the address.
  * @return A String representing the address of the affiliate
  */
  public String getAddress(){
    return address;
  }

  /** Returns the age.
  * @return A int representing the age of the affiliate
  */
  public int getAge(){
    return age;
  }

  /** Returns the id #.
  * @return A int representing the id # of the affiliate
  */
  public int getID(){
    return id;
  }

  /** Returns the name.
  * @return A String representing the name of the affiliate
  */
  public String getName(){
    return name;
  }

  /** Returns the phone number.
  * @return A String representing the phone number of the affiliate
  */
  public String getPhoneNumber(){
    return phoneNumber;
  }

  /** Returns the starting year.
  * @return A int representing the starting year of the affiliate
  */
  public int getStartingYear(){
    return startingYear;
  }

  /** Sets the address.
  * @param ad The address to use for the affiliate
  */
  public void setAddress(String ad){
    address = ad;
  }

  /** Sets the age.
  * @param ag The age to use for the affiliate
  */
  public void setAge(int ag){
    age = ag;
  }

  /** Sets the name.
  * @param n The name to use for the affiliate
  */
  public void setName(String n){
    name = n;
  }

  /** Sets the id #.
  * @param i The id # to use for the affiliate
  */
  public void setID(int i){
    id = i;
  }

  /** Sets the phone number.
  * @param pN The phone number to use for the affiliate
  */
  public void setPhoneNumber(String pN){
    phoneNumber = pN;
  }

  /** Sets the starting year.
  * @param sY The starting year to use for the affiliate
  */
  public void setStartingYear(int sY){
    startingYear = sY;
  }

  /** Compares the starting year variables of two affiliates.
  * @return A int representing whether the starting year is greater than, less
  * than, or equal to the current starting year.
  */
  public int compareTo(Affiliate a){
    int ret = 0;

    if (getStartingYear() > a.getStartingYear()){
      ret = 1;
    }

    else if (getStartingYear() < a.getStartingYear()){
      ret = -1;
    }

    return ret;
  }

  /** Returns a printed string representation of the affiliate.
  * @return A string representation of the Affiliate object
  */
  public String toString(){
    return(address + ", " + age + ", " + id + ", " + name + ", " + phoneNumber +
    ", " + startingYear + ", ");
  }

  /** Prints the member variables and their values of the affiliate. */
  public void print(){
    System.out.println("Age:                        " + age +
    "\nAddress:                    " + address +
    "\nName:                       " + name +
    "\nPhone Number:               " + phoneNumber +
    "\nID:                         " + id +
    "\nStarting Year:              " + startingYear);
  }

  /** Asks the user to enter a value for each of the member variables and
  * sets them equal to the member variable of the affiliate class.
  */
  public void populateRecord(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the address: ");
    this.address = sc.nextLine();
    System.out.println("Enter the age: ");
    this.age = sc.nextInt();
    System.out.println("Please enter the ID #: ");
    this.id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the name: ");
    this.name = sc.nextLine();
    System.out.println("Enter the phone number: ");
    this.phoneNumber = sc.nextLine();
    System.out.println("Enter the starting year: ");
    this.startingYear = sc.nextInt();
  }
}
