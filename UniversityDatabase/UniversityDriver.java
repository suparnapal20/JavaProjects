import java.util.Scanner;
import java.util.HashMap;
import java.io.*;

/** UndergraduateDriver.java
*
* This is a simple UndergraduateDriver class
* @author Suparna Pal
* @author Student ID: 2366429
* @author spal@chapman.edu
* CPSC 230-01 - Prof. Stevens
* Assignment MP4 - University Database
* @version 1.0
*/

/** The UndergraduateDriver class is used to represent the simple concept of an
 * undergraduate driver.
 * The UndergraduateDriver class consists of basic methods for creating a
 * undergraduate driver.
 */

public class UniversityDriver{

  /** User picks an affiliate sub- sub- classes and creates an affiliate
  * @return An affiliate representing the created object
  */
  public static Affiliate createAffiliate(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Please choose an option: " +
    "\n 1. Undergraduate" +
    "\n 2. Graduate" +
    "\n 3. Assistant Professor" +
    "\n 4. Associate Professor" +
    "\n 5. Full Professor" +
    "\n 6. Part-Time Staff" +
    "\n 7. Full-Time Staff");
    String uR = sc.nextLine();
    System.out.println();

    switch (uR){
      case "1":
        Undergraduate u = new Undergraduate();
        u.populateRecord();

        return u;

      case "2":
        Graduate g = new Graduate();
        g.populateRecord();

        return g;

      case "3":
        AssistantProfessor aip = new AssistantProfessor();
        aip.populateRecord();

        return aip;

      case "4":
        AssociateProfessor aop = new AssociateProfessor();
        aop.populateRecord();

        return aop;

      case "5":
        FullProfessor fp = new FullProfessor();
        fp.populateRecord();

        return fp;

      case "6":
        PartTime pt = new PartTime();
        pt.populateRecord();

        return pt;

      case "7":
        FullTime ft = new FullTime();
        ft.populateRecord();

        return ft;
    }

    return null;
  }

  /** The main method. Exercises the Simulation and Game functionalities.
  * @param args The command line arguments (not used)
  */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    HashMap<Integer, Affiliate> database = new HashMap<Integer, Affiliate>();
    HashMap<Integer, Affiliate> sortedDatabase = new HashMap<Integer, Affiliate>();

    while (true){
      System.out.println("Please choose an option by selecting its corresponding number: " +
      "\n 1. Create an affiliate record" +
      "\n 2. Print information for an affiliate given ID" +
      "\n 3. List all affiliates in order of seniority" +
      "\n 4. Delete a record given ID" +
      "\n 5. Save your database to a file" +
      "\n 6. Restore database from a file" +
      "\n 7. Exit");
      String userResponse = scnr.nextLine();
      System.out.println();

      if (userResponse.equals("7")){
        break;
      }

      if (userResponse.equals("1")){
        Affiliate a = createAffiliate();
        int id = a.getID();
        database.put(id, a);
      }

      if (userResponse.equals("2")){
        System.out.println("Please enter the affiliate's ID #: ");
        int id = Integer.parseInt(scnr.nextLine());
        if (database.get(id) == null){
          System.out.println("Unsuccessful: affiliate does not exist.");
        }
        else {
          database.get(id).print();
        }
      }

      if (userResponse.equals("3")){
        Affiliate[] records = new Affiliate[database.size()];
        int valueCount = 0;
        for (Affiliate a : database.values()){
          records[valueCount] = a;
          valueCount++;
        }

        for (int outside = 0; outside < records.length - 1; outside++){
          for (int j = 0; j < records.length - 1; j++){
            if (records[j].compareTo(records[j+1]) == 1){
              Affiliate temp = records[j];
              records[j] = records[j+1];
              records[j+1] = temp;
            }
          }
        }

        for (int i = 0; i < records.length; i++){
          System.out.println(database.get(records[i].getID()));
        }
      }

      if (userResponse.equals("4")){
        System.out.println("Please enter the affiliate's ID # you would like to remove: ");
        int id = Integer.parseInt(scnr.nextLine());
        if (database.remove(id) != null){
          System.out.println("Successful!");
        }
        else{
          System.out.println("Unsuccessful: affiliate does not exist.");
        }
      }

      if (userResponse.equals("5")){
        try {
          System.out.println("Enter the output file name with extension: ");
          String outputFile = scnr.nextLine();
          FileWriter fw = new FileWriter(outputFile);

          for (Affiliate a : database.values()){
            fw.write(a.toString() + "\n");
          }

          fw.close();
        }

        catch (IOException e){
          System.out.println("An error occured.");
        }
      }

      if (userResponse.equals("6")){
        try {
          System.out.println("Enter the input file name with extension: ");
          String inputFile = scnr.nextLine();
          BufferedReader br = new BufferedReader(new FileReader(inputFile));

          String currentLine = br.readLine();

          while (currentLine != null){
            String[] lA = currentLine.split(", ");
            String type = lA[0];
            switch (type){
              case "Undergraduate":
                Undergraduate u = new Undergraduate(lA[1], Integer.parseInt(lA[2]),
                Integer.parseInt(lA[3]), lA[4], lA[5], Integer.parseInt(lA[6]),
                Integer.parseInt(lA[7]), lA[8], lA[9], Integer.parseInt(lA[10]),
                Integer.parseInt(lA[11]));
                database.put(u.getID(), u);
                break;

              case "Graduate":
                Graduate g = new Graduate(lA[1], Integer.parseInt(lA[2]),
                Integer.parseInt(lA[3]), lA[4], lA[5], Integer.parseInt(lA[6]),
                Integer.parseInt(lA[7]), lA[8], lA[9], Integer.parseInt(lA[10]),
                lA[11]);
                database.put(g.getID(), g);
                break;

              case "Assistant":
                AssistantProfessor aip = new AssistantProfessor(lA[1], Integer.parseInt(lA[2]),
                Integer.parseInt(lA[3]), lA[4], lA[5], Integer.parseInt(lA[6]),
                Integer.parseInt(lA[7]), lA[8], Integer.parseInt(lA[9]), Integer.parseInt(lA[10]));
                database.put(aip.getID(), aip);
                break;

              case "Associate":
                AssociateProfessor aop = new AssociateProfessor(lA[1], Integer.parseInt(lA[2]),
                Integer.parseInt(lA[3]), lA[4], lA[5], Integer.parseInt(lA[6]),
                Integer.parseInt(lA[7]), lA[8], Integer.parseInt(lA[9]), Integer.parseInt(lA[10]));
                database.put(aop.getID(), aop);
                break;

              case "Full":
                FullProfessor fp = new FullProfessor(lA[1], Integer.parseInt(lA[2]),
                Integer.parseInt(lA[3]), lA[4], lA[5], Integer.parseInt(lA[6]),
                Integer.parseInt(lA[7]), lA[8], Integer.parseInt(lA[9]), Integer.parseInt(lA[10]));
                database.put(fp.getID(), fp);
                break;

              case "Part-Time":
                PartTime pt = new PartTime(lA[1], Integer.parseInt(lA[2]),
                Integer.parseInt(lA[3]), lA[4], lA[5], Integer.parseInt(lA[6]),
                lA[7], lA[8], Double.parseDouble(lA[9]));
                database.put(pt.getID(), pt);
                break;

              case "Full-Time":
                FullTime ft = new FullTime(lA[1], Integer.parseInt(lA[2]),
                Integer.parseInt(lA[3]), lA[4], lA[5], Integer.parseInt(lA[6]),
                lA[7], lA[8], Integer.parseInt(lA[9]));
                database.put(ft.getID(), ft);
                break;
            }

            currentLine = br.readLine();
          }
        }

        catch (IOException e){
          System.out.println("An error occured.");
        }
      }

      System.out.println();
    }
  }
}
