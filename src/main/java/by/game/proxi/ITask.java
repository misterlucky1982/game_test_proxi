package by.game.proxi;

public interface ITask {
	
	static final String KILL_YOURSELF = "kill yourself";
	
	Object getTaskValue();
	void perform(IRobot robot);
}
