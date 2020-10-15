package application;

import java.util.Scanner;
import entities.Rectangle;

public class RectangleData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter the width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("\nEnter the height: ");
		rectangle.height = sc.nextDouble();
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
		sc.close();
	}
}
