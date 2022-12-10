package interfaces;

class MountainBike extends TwoWheeler implements Bicycle, Vehicle {
//	this is also a multi inheritance demo
//	a class can extend from only one base/concrete class but can implement multiple interfaces

	private int seatHeight;
	private int gear;
	private int speed;

	public MountainBike(int startHeight, int startgear, int startspeed) {
		this.seatHeight = startHeight;
		this.gear = startgear;
		this.speed = startspeed;
	}

	@Override
	public void applybreak(int decrement) {
		speed = speed - decrement;
	}

	@Override
	public void speedup(int increment) {
		speed = speed + increment;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void candrive() {
		System.out.println("Bicycle can drive");

	}

}
