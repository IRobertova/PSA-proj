package merryChristmas;

public abstract class AbstractFactory {
	
	abstract Color createColor(String name);

	abstract Toy createStandartToy(String name);

	abstract Toy createColoredToy(String name, String color);

}
