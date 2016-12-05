package Movie;

public class SeatingChart {
	
	private int[][] theater =
		{
			{10,10,10,10,10,10,10,10,10,10},
			{10,10,10,10,10,10,10,10,10,10},
			{10,10,10,10,10,10,10,10,10,10},
			{10,20,20,20,20,20,20,20,10,10},
			{10,20,20,20,20,20,20,20,10,10},
			{10,20,20,20,20,20,20,20,10,10},
			{20,20,30,30,40,40,30,30,20,20},
			{20,30,30,40,50,50,40,30,30,20},
			{30,40,50,50,50,50,50,50,40,30}
	};
	
	public SeatingChart (){
		
	}
	
	public void sellAllSeats() {
		for (int i = 0; i < this.theater.length; i++) {
			for (int j = 0; j < this.theater[0].length; j++) {
				theater[i][j] = 0;
			}
		}
	}
	
	public int[][] returnTheater() {
		return this.theater;
	}
	
	public void sellBySeat(int row, int col) {
		if (theater[row][col] == 0) {
			System.err.println("That seat is already taken. Please try again.");
			return;
		}
		theater[row][col] = 0;
	}
	
	public void sellByPrice(int price) {
		for (int i = 0; i < this.theater.length; i++) {
			for (int j = 0; j < this.theater[0].length; j++) {
				if (theater[i][j] == price) {
					theater[i][j] = 0;
					System.out.println("Thank you for buying the seat at: " + i +  "," + j);
					return;
				}
			}
		}
	}
	
	public int[][] printTheater() {
		for (int i = 0; i < this.theater.length; i++) {
			for (int j = 0; j < this.theater[0].length; j++) {
				System.out.printf("% 5d", this.theater[i][j]);
			}
			System.out.println();
		}
		return null;
		
	}
}

