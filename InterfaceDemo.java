package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {

		MountainBike mountainbike = new MountainBike(10, 1, 20);

		System.out.println("seatheight is " + mountainbike.getSeatHeight());
		System.out.println("speed is " + mountainbike.getSpeed());
		System.out.println("gear is " + mountainbike.getGear());

		mountainbike.applybreak(2);
		System.out.println("apply break " + mountainbike.getSpeed());
		mountainbike.candrive();
		mountainbike.canRotate();

	}

}
