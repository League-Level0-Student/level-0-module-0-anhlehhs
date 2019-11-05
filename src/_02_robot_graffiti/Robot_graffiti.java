package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robot_graffiti {
public static void main(String[] args) {
	Robot Anh= new Robot();
	Anh.penDown();
	Anh.hide();
	Anh.setSpeed(100);
	Anh.turn(35);
	Anh.move(100);
	Anh.turn(125);
	Anh.move(100);
	Anh.turn(180);
	Anh.move(50);
	Anh.turn(-75);
	Anh.move(50);
	Anh.penUp();
	Anh.turn(180);
	Anh.move(180);
	Anh.penDown();
	Anh.turn(90);
	Anh.move(100);
	Anh.turn(180);
	Anh.turn(90);
	Anh.move(50);
	
}
}