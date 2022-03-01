package assigment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Box {
  private final double width;
  private final double height;
  private final double depth;

  public Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  public double volume() {
    return this.depth * this.height * this.width;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Please put the box's width height and depth orderly:");
    try {
      double width = reader.nextDouble();
      double height = reader.nextDouble();
      double depth = reader.nextDouble();
      Box b = new Box(width, height, depth);
      System.out.println(b.volume());
    } catch (InputMismatchException e) {
      System.out.println("Input of the width, height or depth is not correct.");
    }
  }
}