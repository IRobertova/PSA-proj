package merryChristmas;

public class INeedWheels implements ToyCommand {
	
	private MagicBoard board;

	public INeedWheels(MagicBoard board) {
		super();
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.INeedWheels();
	}

	@Override
	public void stop() {
		this.board.INeedDolls();
	}
}
