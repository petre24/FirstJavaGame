package firstjavagame.main;

public class Game extends Canvas implements Runnable
{
    private static final long serialVersionUID = -8173324309904070247L;

	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH / 12 * 9;

	public Game() {
		 new Window(WIDTH, HEIGHT, "First Game (Version 1.0)", this);
	}
	
	public synchronized void start() {
		
	}
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		new Game();
	}
}
