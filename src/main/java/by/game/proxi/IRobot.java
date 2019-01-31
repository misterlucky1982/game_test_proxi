package by.game.proxi;

public interface IRobot extends IGameActor{
	void nextTask();
	void die();
	void free();
	void say(String message);
}
