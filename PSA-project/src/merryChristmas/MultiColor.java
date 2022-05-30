package merryChristmas;

public class MultiColor implements Color {
	
	private String name;

	public MultiColor(String name) {
		this.name = name;

	}

	public MultiColor() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Color createColor(String name) {
		return new MultiColor(name);
	}

}
