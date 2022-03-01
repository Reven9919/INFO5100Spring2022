package assigment1;

import java.util.*;

//Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
public class correspondingMeaning {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    char grade;
    System.out.println("Enter grade:");
    grade = input.next().charAt(0);
    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Deficient");
        break;
      case 'F':
        System.out.println("Failing");
        break;
      default:
        System.out.println("Invalid input");
    }
  }
}