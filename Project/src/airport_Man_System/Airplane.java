package airport_Man_System;

public class Airplane {

	private int id;
	private int numberOfSeats;
	public Airplane(int id, int numberOfSeats) {
		this.id = id;
		this.numberOfSeats = numberOfSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

}
