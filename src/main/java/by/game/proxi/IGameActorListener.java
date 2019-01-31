package by.game.proxi;

public interface IGameActorListener {
	void taskAdded();
	void taskIsPerformed();
	void robotIsAdded(IRobot robot);
	void robotIsDied(IRobot robot);
}
