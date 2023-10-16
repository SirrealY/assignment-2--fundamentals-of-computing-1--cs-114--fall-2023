import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int input;
    int i;
    int spaces;
    int j;
    int stars = 1;
    int aster;

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter any number");

  input = scan.nextInt();

  if (input % 2 == 1 ){// Checks if user input is odd or even
    int height = input/2;
    //Prints top half of diamond
    for(i = 0;i <= height;i++){
      for(spaces = 1;spaces<=height-i;spaces++){
        System.out.print(" ");
      }
      for(j=1;j<=2*i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
   //Bottom half of diamond
    for(i=height-1;i>=0;i--){
      for(spaces = 1;spaces<=height-i;spaces++){
        System.out.print(" ");
      }
      for(j=1;j<=2*i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  } else {
    for(aster = 0; aster < (input/2)-1; aster++){
      System.out.print("  ");
    }
    System.out.println("  *");
      int vertical = input / 2;
      //Top of diamond
      for(i = 0;i < vertical ;i++) {
        for(spaces = vertical - 1 ; spaces > i;spaces--) {
          System.out.print("  ");
        }
        for(j = 0;j <= stars;j++) {
          System.out.print(" *");
        }
        System.out.println();
        stars += 2;
      }

      //Bottom of diamond
      for(i = vertical - 2 ;i >=0;i--) {
        for(spaces = vertical - 1 ;spaces > i ;spaces--){
          System.out.print("  ");
        }
        if (i==0) {
          stars = 2 + 1 * i;
        } else {
          stars = 2 + 2 * i;
        }
        for (j = 0; j < stars ;j++) {
          System.out.print(" *");
        }
        System.out.println();
        stars-=2;
      }
      for (aster = 0; aster < (input/2)-1; aster++){
        System.out.print("  ");
      }
      System.out.println("  *");
scan.close();}
  }
}
