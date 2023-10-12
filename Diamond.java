import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int input;
    int i;
    int spaces;

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter any number");

  input = scan.nextInt();

  if (input % 2 == 1 ){;// Checks if user input is odd or even
    int height = input/2;
    //Prints top half of diamond
    for(i=0;i<=height;i++){
      for(spaces=1;spaces<=height-i;spaces++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
   //Bottom half of diamond
    for(i=height-1;i>=0;i--){
      for(spaces = 1;spaces<=height-i;spaces++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  else
    System.out.println("even ");


    }




  }
