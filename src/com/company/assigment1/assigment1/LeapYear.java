package assigment1;

import java.util.Scanner;

public class LeapYear {

  public static boolean leapYear(int year) {
    if (year % 100 == 0) {
      return year % 400 == 0;
    } else {
      return year % 4 ==0;
    }
  }

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Please enter the year:");
    int year = read.nextInt();
    String ret = leapYear(year) ? year + " is a leap year." : year + " is not a leap year.";
    System.out.println(ret);
  }
}
