package ShapeClass;
import java.util.Scanner;

abstract class Shape{
	public void area() {};
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public void area(){
		double area = 3.14*radius*radius;
		System.out.println(String.format("%.2f",area));
	}	
}

class Square extends Shape{
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	public void area(){
		double area = side*side;
		System.out.println(String.format("%.2f",area));
	}	
}

class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public void area() {
		double area = 0.5*(base)*(height);
		System.out.println(String.format("%.2f",area));
	}
}

class Rectangle extends Shape{
	private double length;
	private double bredth;
	
	public Rectangle(double length, double bredth) {
		this.length = length;
		this.bredth = bredth;
	}
	public void area() {
		double area = length*bredth;
		System.out.println(String.format("%.2f",area));
	}
}

class giveArea{
	public void show(Shape shape) {
		shape.area();
	}
}

public class CalcArea {
	public static void main(String[] args) {
		Shape shape = null;
		
		shape = ChooseShape(shape);
		giveArea ar = new giveArea();
		if(shape != null)
			ar.show(shape);
		else
			System.out.println("Choose correctly");
	}

	private static Shape ChooseShape(Shape shape) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose from 1: Circle 2: Square 3: Triangle 4: Rectangle");
		int choice = sc.nextInt();
		sc.close();
		if(choice == 1) {
			System.out.println("Enter the radius of circle");
		    double radius = sc.nextDouble();
			shape = new Circle(radius); 
		}
		else if(choice == 2) {
			System.out.println("Enter the side of Square");
		    double side = sc.nextDouble();
			shape = new Square(side); 
		}
		else if(choice == 3) {
			System.out.println("Enter the base of triangle");
		    double base = sc.nextDouble();
		    System.out.println("Enter the height of triangle");
		    double height = sc.nextDouble();
			shape = new Triangle(base, height); 
		}
		else if(choice == 4) {
			System.out.println("Enter the length of rectangle");
		    double length = sc.nextDouble();
		    System.out.println("Enter the bredth of rectangle");
		    double bredth = sc.nextDouble();
			shape = new Triangle(length, bredth); 
		}
		return shape;
	}
}
