package extra;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	static Robot Stanley = new Robot();

	static void drawSquare() {
		Stanley.setSpeed(500);
		Stanley.penDown();
		for (int i = 0; i < 4; i++) {
			Stanley.move(50);
			Stanley.turn(90);
		}
	}
	static void drawWSquare() {
		Stanley.setSpeed(500);
		Stanley.penDown();
		for (int i = 0; i < 4; i++) {
			Stanley.move(50);
			Stanley.turn(-90);
		}
	}

	static void drawTriangle() {
		Stanley.setSpeed(500);
		Stanley.penDown();
		for (int i = 0; i < 36; i++)
			;
		Stanley.move(200);
		Stanley.turn(360 / 3);
		Stanley.move(200);
		Stanley.turn(360 / 3);
		Stanley.move(200);
	}

	static void drawNTriangle() {
		Stanley.setSpeed(500);
		Stanley.penDown();
		for (int i = 0; i < 48; i++)
			;
		Stanley.move(200);
		Stanley.turn(-360 / 3);
		Stanley.turn(-360 / 3);
		Stanley.move(200);
		Stanley.turn(360 / 3);
		Stanley.move(200);
	}

	static void drawWTriangle() {
		Stanley.setSpeed(500);
		Stanley.penDown();
		for (int i = 0; i < 36; i++)
			;
		Stanley.move(200);
		Stanley.turn(360 / 6);
		Stanley.turn(-360 / 3);
		Stanley.move(200);
		Stanley.turn(-360 / 3);
		Stanley.move(200);
		Stanley.turn(-360 / 3);
		Stanley.move(200);
	}

	public static void main(String[] args) {
		drawSquare();
		for (int i = 0; i < 6; i++) {
			drawTriangle();
			drawNTriangle();
			drawNTriangle();
			drawWTriangle();
		}
		drawWSquare();
		for (int i = 0; i < 12; i++) {
			drawTriangle();
			drawWTriangle();
			drawNTriangle();
			drawNTriangle();
		}
		for(int i=0; i<50; i++);
		Stanley.move(10);
		Stanley.turn(360/360);
	}
}