package merryChristmas;

public interface Observable {

	void subscribe(BoardObserver boardObserver);

	void unsubscribe(BoardObserver boardObserver);

	void notifyObservers();

	String getUpdate();

}
