package merryChristmas;

public class MagicBoard {
	
	private boolean chooseToy;

	public void INeedDolls() {
		System.out.println("Magic Board: Doll!");
		this.chooseToy = true;
	}

	public void INeedWheels() {
		System.out.println("Magic Board: Wheel!");
		this.chooseToy = false;
	}
}
