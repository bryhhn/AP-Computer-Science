package Movie;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheTheater {

	public static void main(String[] args) {
		
		 int[][] theater2 =
			{
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		
		SeatingChart sc = new SeatingChart();
		Scanner scan = new Scanner(System.in);
		
		
		// Sell all seats
		//sc.sellAllSeats();
		//sc.printTheater();
		
		if(Arrays.deepEquals(sc.returnTheater(), theater2)){
			System.out.println("All seats are sold. Please come again later.");
		}
		
		while(!Arrays.deepEquals(sc.returnTheater(), theater2)){  
		System.out.println("Do you want to buy by price(1) or seat(2)?");
		int input = scan.nextInt();
		

		switch (input) {
		case 1:
			sc.printTheater();
			System.out.println("All the seats without a (0) are avaiable.");
			System.out.println("How much are you willing to pay?");
			int price = scan.nextInt();
			while(price != 10 && price != 20 && price != 30 && price != 40 && price != 50) {
				System.out.println("Please enter 10, 20, 30, 40, or 50.");
				price = scan.nextInt();
			}
			sc.sellByPrice(price);
			break;
			
		case 2:
			sc.printTheater();
			System.out.println("All the seats without a (0) are avaiable.");
			System.out.println("Which seat would you like to buy? (enter two integers (x,y) (0,0 being the top left place)");
			int row = scan.nextInt();
			int col = scan.nextInt();	
			while((row < 0 || row > 9) || (col < 0 || col > 10)) {
				System.out.println("Please enter valid numbers. (row 0-8) (col 0-9) ");
				row = scan.nextInt();
				col = scan.nextInt();
			}
			sc.sellBySeat(row, col);
			sc.printTheater();
			break;
		
		default:
			System.err.println("Please enter 1 or 2");
			main(args);
	
		scan.close();
		
		}
		
	}
	}

}
