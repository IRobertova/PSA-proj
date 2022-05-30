package merryChristmas;

public class INeedDolls implements ToyCommand {
	
	private MagicBoard board;

	public INeedDolls(MagicBoard board) {
		super();
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.INeedDolls();
	}

	@Override
	public void stop() {
		this.board.INeedWheels();
	}
}
