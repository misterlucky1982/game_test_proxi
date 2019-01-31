package by.game.proxi;

public interface IGameWorld {
	
	IGameActivityTracker gameActivityTracker();
	ITaskQueue taskQueue();
	IGameActorListener gameActorListener();
	void addTask(ITask task);
	void addTask(Object actorId, ITask task);
	void addRobot(IRobot robot);
	IRobot getById(Object id);
	IRobot someRobot();
	ITaskQueue getCommonQueue();
	ITaskQueue getRobotQueue(Object id);
	void logActivity(String message);
}
