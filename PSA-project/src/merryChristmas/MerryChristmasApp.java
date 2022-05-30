package merryChristmas;

import java.util.ArrayList;

public class MerryChristmasApp {

	public static String message;
	public static String toyName;
	public static Color col1;
	public static Color col2;
	public static Topic topic1;
	public static Topic topic2;
	public static MagicBoard magicBoard;
	public static Workshop santaWorkshop;
	public static BoardObserver boardObserver1;
	public static BoardObserver boardObserver2;
	public static ArrayList<Toy> toys;

	public static void main(String[] args) {

		toys = new ArrayList<>();
		magicBoard = new MagicBoard();
		topic1 = new Topic();
		topic2 = new Topic();
		santaWorkshop = new Workshop();
		boardObserver1 = new Dwarf("Small Dwarf");
		boardObserver2 = new Dwarf("Cool Dwarf");

		topic1.subscribe(boardObserver1);
		topic2.subscribe(boardObserver2);

		col1 = santaWorkshop.createColor("Colorful");
		col2 = santaWorkshop.createColor("Purple");

		SantaClaus santaClaus = SantaClaus.getInstance();
		message = santaClaus.postMessage("Ho-ho-ho!");

		message = santaClaus.postMessage("I need doll!");
		createColorfulToy(message);
		message = santaClaus.postMessage("I need wheel!");
		createColorfulToy(message);
		message = santaClaus.postMessage("I need wheel!");
		createStandartToy(message);

		message = santaClaus.postMessage("I need more coffe or sleep!!!!");
		createStandartToy(message);
		System.out.println("------------------------------------------");

		System.out
				.println("The current size of Toylist is " + String.valueOf(toys.size()) + " so we have to hurry up!");
	}

	public static void createColorfulToy(String message) {
		if (message.equals("I need doll!")) {
			magicBoard.INeedDolls();
			topic1.setTopic("Doll");
			toyName = String.valueOf(topic1.getUpdate());
			String c1 = col1.getName();
			toys.add(santaWorkshop.createColoredToy(toyName, c1));

		} else if (message.equals("I need wheel!")) {
			magicBoard.INeedWheels();
			topic1.setTopic("Wheel");
			toyName = String.valueOf(topic1.getUpdate());
			String c2 = col2.getName();
			toys.add(santaWorkshop.createColoredToy(toyName, c2));

		} else
			System.out.println("Santa said something else");

	}

	public static void createStandartToy(String message) {
		if (message.equals("I need doll!")) {
			magicBoard.INeedDolls();
			topic2.setTopic("Doll");
			toyName = String.valueOf(topic2.getUpdate());
			toys.add(santaWorkshop.createStandartToy(toyName));

		} else if (message.equals("I need wheel!")) {
			magicBoard.INeedWheels();
			topic2.setTopic("Wheel");
			toyName = String.valueOf(topic2.getUpdate());
			toys.add(santaWorkshop.createStandartToy(toyName));

		} else
			System.out.println("Santa said something else...");

	}

}
