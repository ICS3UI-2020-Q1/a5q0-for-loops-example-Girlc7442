import java.util.Scanner;

/**
 * For loop example
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //create the count variable
    int count = 1;
    //create the while loop to count to 10
    while(count <= 10){
      //loop action: print number to the console
      System.out.println(count);
      //increase the counter
      count = count + 1;
    }
    
    //do the same thing with a for loop
    for(int i = 0; i < 10; i++){
      //loop action: print the number
      System.out.println("loop" + (i + 1));
    }

  }
}
