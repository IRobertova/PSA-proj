package merryChristmas;

public class Dwarf implements BoardObserver {
	
	private Observable topic;
	private String name;

	public Dwarf(String name) {
		this.name = name;
	}

	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}

	@Override
	public void update() {
		if (this.topic == null) {
			System.out.println(this.getName() + " Has no topic set");
			return;
		}

		String topic = this.topic.getUpdate();
		System.out.println(this.getName() + " - Received: " + topic);
	}

	public String getName() {
		return name;
	}

}
