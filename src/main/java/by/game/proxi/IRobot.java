package by.game.proxi;

public interface IRobot extends IGameActor{
	void nextTask(ITaskSource source);
	void die();
	void free();
	void say(String message);
}
