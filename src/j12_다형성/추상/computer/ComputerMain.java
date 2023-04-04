package j12_다형성.추상.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop();
		Computer c2 = new DesktopImpl();
		
		c1.onDisplay();
		c2.onKeyPress();
		((Desktop)c2).onMouseClick();
		
		c1.onSound();
		c2.onSound();
		
		
		
	}

}
