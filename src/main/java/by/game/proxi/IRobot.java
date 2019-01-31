package by.game.proxi;

public interface IRobot extends IGameActor{
	void nextTask(ITaskQueue queue);
	void die();
	void free();
	void say(String message);
}
