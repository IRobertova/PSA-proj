package merryChristmas;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

	private List<BoardObserver> observers;
	private String topic;

	public Topic() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(BoardObserver boardObserver) {
		this.observers.add(boardObserver);
		boardObserver.setTopic(this);
	}

	@Override
	public void unsubscribe(BoardObserver boardObserver) {
		this.observers.remove(boardObserver);
		boardObserver.setTopic(null);

	}

	@Override
	public void notifyObservers() {

		for (BoardObserver boardObserver : this.observers) {
			boardObserver.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.notifyObservers();
	}
}
