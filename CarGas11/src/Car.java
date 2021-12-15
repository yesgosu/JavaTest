import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o;
		Gas car = new Gas();
		car.color = "blue";
		car.gear = 3;
		car.speed = 30;
		car.carspeed = 400;
		car.cargas(13);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주행거리를 입력하세요");
		o=scan.nextInt();
		car.fullasg(o);
		
		System.out.println(car.toCarString());
	}

}
