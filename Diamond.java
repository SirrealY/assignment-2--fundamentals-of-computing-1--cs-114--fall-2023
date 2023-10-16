import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int input;
    int row;
    int spaces;
    int column;
    int stars = 1;
    int aster;

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter any number");

  input = scan.nextInt();

  if (input % 2 == 1 ){// Checks if user input is odd or even
    int height = input/2;
    //Prints top half of diamond
    for(row = 0;row <= height;row++){
      for(spaces = 1;spaces<=height-row;spaces++){
        System.out.print(" ");
      }
      for(column=1;column<=2*row+1;column++){
        System.out.print("*");
      }
      System.out.println();
    }
   //Bottom half of diamond
    for(row=height-1;row>=0;row--){
      for(spaces = 1;spaces<=height-row;spaces++){
        System.out.print(" ");
      }
      for(column=1;column<=2*row+1;column++){
        System.out.print("*");
      }
      System.out.println();
    }
  } else {
    //Prints first star
    for(aster = 0; aster < (input/2)-1; aster++){
      System.out.print("  ");
    }
    System.out.println("  *");
      int vertical = input / 2;
      //Top of diamond
      for(row = 0;row < vertical ;row++) {
        for(spaces = vertical - 1 ; spaces > row;spaces--) {
          System.out.print("  ");//Prints Spaces
        }
        for(column = 0;column <= stars;column++) {
          System.out.print(" *");//Prints Stars
        }
        System.out.println();
        stars += 2;//Increment by 2
      }
      //Bottom of diamond
      for(row = vertical - 2 ;row >=0;row--) {
        for(spaces = vertical - 1 ;spaces > row ;spaces--){
          System.out.print("  ");//Print Space
        }
        if (row==0) {
          stars = 2 + 1 * row;
        } else {
          stars = 2 + 2 * row;
        }
        for (column = 0; column < stars ;column++) {
          System.out.print(" *");
        }
        System.out.println();
        stars-=2;//Decrement by 2
      }
      //Prints last star
      for (aster = 0; aster < (input/2)-1; aster++){
        System.out.print("  ");
      }
      System.out.println("  *");
scan.close();}
  }
}
