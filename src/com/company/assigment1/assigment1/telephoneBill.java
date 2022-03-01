package assigment1;

import java.util.Scanner;

public class telephoneBill {

  //Write a program to calculate the monthly telephone bills as per the following rule:
// Minimum $ 200 for up to 100 calls.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter call:");
    int call = input.nextInt();
    double money = 200;
    if (call > 100) {
      int grade = (call - 100) / 50;
      switch (grade) {
        case 1:
          money += 0.60 * 50;
          break;
        case 2:
          money += 0.5 * 50;
          break;
        default:
          money += 0.4 * (call - 200);
      }
    }
    System.out.println("Your monthly telephone bill is:" + money);
  }
}
