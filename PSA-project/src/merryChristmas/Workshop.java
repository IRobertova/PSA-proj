package merryChristmas;

public class Workshop extends AbstractFactory {
	
	@Override
	Color createColor(String name) {
		if (name.equalsIgnoreCase("Colorful")) {
			return new MultiColor(name);
		}if(name.equalsIgnoreCase("Purple")) {
			return new PurpleColor(name);
		}
		return null;
	}

	@Override
	Toy createStandartToy(String toyName) {
		if (toyName.equalsIgnoreCase("Doll")) {
			return new Doll().create(toyName);
		}
		if (toyName.equalsIgnoreCase("Wheel")) {
			return new Wheel().create(toyName);
		}
		return null;
	}

	@Override
	Toy createColoredToy(String toyName, String color) {
		if (toyName.equalsIgnoreCase("Doll")) {
			return new Doll().create(toyName, color);
		}
		if (toyName.equalsIgnoreCase("Wheel")) {
			return new Wheel().create(toyName, color);
		}
		return null;
	}

}
