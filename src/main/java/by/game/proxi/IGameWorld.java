package by.game.proxi;

public interface IGameWorld {
	void addTask(ITask task);
	void addTask(Object actorId, ITask task);
	void addRobot(IRobot robot);
	IRobot getById(Object id);
	IRobot someRobot();
	ITaskQueue getCommonQueue();
	ITaskQueue getRobotQueue(Object id);
}
