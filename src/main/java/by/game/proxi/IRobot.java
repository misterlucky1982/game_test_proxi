package by.game.proxi;

public interface IRobot extends IGameActor{
	void setTask(ITask task);
	void die();
	void free();
	void say(String message);
}
