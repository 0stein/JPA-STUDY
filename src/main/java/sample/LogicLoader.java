package sample;

public class LogicLoader {
	private Logic logic;
	
	public void run() {
		logic.run();
	}

	public LogicLoader(Logic logic) {
		this.logic = logic;
	}
}
