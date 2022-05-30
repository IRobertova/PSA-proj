package merryChristmas;

public class Wheel implements Toy {

	private String name;
	private String color;

	public Wheel() {

	}

	public Wheel(String name) {
		this.name = name;
	}

	public Wheel(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public Toy create(String name) {
		System.out.println(name + " has been created!");
		System.out.println("------------------------------------------");

		return new Wheel(name);

	}

	@Override
	public Toy create(String name, String color) {
		System.out.println(color + " " + name + " has been created!");
		System.out.println("------------------------------------------");

		return new Wheel(name, color);
	}

}
