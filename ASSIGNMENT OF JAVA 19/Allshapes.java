package AssignmentDay2;

import java.util.Scanner;

public class Allshapes {

	public static void main(String[] args) {

				Scanner sh = new Scanner(System.in);
				Rectangle door = new Rectangle(8,4);
				Square window = new Square(3);
				Circle ball= new Circle(4.5);
				Triangle roof= new Triangle(3.5,5,6);

				
				char continueChoice;

				do{
					System.out.println("Select a shape");
					System.out.println("1. Rectangle");
					System.out.println("2. Circle");
					System.out.println("3. Square");
					System.out.println("4. Triangle");


					int  choice = sh.nextInt();
					
					switch(choice){
					case 1:

						System.out.println("1. Area");
						System.out.println("2. Perimeter");
						int calculate = sh.nextInt();
						switch (calculate){
						case 1:
							System.out.println("Area: "+door.calculateRectangleArea());
							break;
						case 2:
							System.out.println("Perimeter: "+door.calculateRectanglePerim());
							break;
						default:
							System.out.println("Invalid calculation choice");
						}
						break;

					case 2:
						System.out.println("1. Area");
						System.out.println("2. circumfrance");
						int calculate1 = sh.nextInt();
						switch (calculate1){
						case 1:
							System.out.println("Area: "+ball.calculateCircleArea());
							break;
						case 2:
							System.out.println("circumfrance: "+ball.calculateCircleCurcum());
							break;
						default:
							System.out.println("Invalid calculation choice");
						}
						break;

					case 3:
						System.out.println("1. Area");
						System.out.println("2. Perimeter");
						int calculate2 = sh.nextInt();
						switch (calculate2){
						case 1:
							System.out.println("Area: "+window.calculateSquareArea());
							break;
						case 2:
							System.out.println("Perimeter: "+window.calculateSquarePerimeter());
							break;
						default:
							System.out.println("Invalid calculation choice");
						}
						break;

					case 4:
						System.out.println("what would you like to calculate");
						System.out.println("1. Area");
						System.out.println("2. Perimeter");
						int calculate3 = sh.nextInt();
						switch (calculate3){
						case 1:
							System.out.println("Area: "+roof.calcTriangleArea());
							break;
						case 2:
							System.out.println("Perimeter: "+roof.calcTrianglePerimeter());
							break;
						default:
							System.out.println("Invalid calculation choice");
						}
						break;
					default:
						System.out.println("Invalid shape choice");

					 }

				    System.out.println("Do you want to continue? (y/n)");
				    continueChoice = sh.next().charAt(0);

				} while (continueChoice == 'y' || continueChoice == 'Y');

				System.out.println("Program ended.");
				sh.close();

			}

	}





