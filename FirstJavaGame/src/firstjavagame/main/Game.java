package firstjavagame.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable
{
	private static final long serialVersionUID = -8173324309904070247L;

	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH / 12 * 9;

	private Thread thread;
	private boolean running = false;

	public Game() {
		 new Window(WIDTH, HEIGHT, "First Game (Version 1.0)", this);
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public void run() {
		try {
			thread.join();  // kills the thread
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Game();
	}
}
