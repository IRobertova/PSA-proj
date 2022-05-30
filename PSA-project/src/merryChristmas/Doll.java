package merryChristmas;

public class Doll implements Toy {

	private String name;
	private String color;

	public Doll() {
	}

	public Doll(String name) {
		this.name = name;
	}

	public Doll(String name, String color) {
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

		return new Doll(name);
	}

	@Override
	public Toy create(String name, String color) {
		System.out.println(color + " " + name + " has been created!");
		System.out.println("------------------------------------------");

		return new Doll(name, color);
	}

}
