package by.game.proxi;

public interface IGameWorld {
	
	void addTask(ITask task);
	void addTask(Object actorId, ITask task);
	void addRobot(IRobot robot);
	IGameWorld setIGameActivityTracker(IGameActivityTracker activityTacker);
	void startGame();
	void setMaxTaskTime(long time);
	void setTaskAmountThreshold(int threshold);
}
