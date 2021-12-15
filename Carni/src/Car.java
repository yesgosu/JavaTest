
public class Car {
	String color; //색깔
	int gas; // 기름양
	int gear; // 기어
	int speed; // 스피드
	int GasSpeed; // 연비
	int Oill; // 기름양
	int pie; // 거리
	
	String toCString() {
		return "자동차의 색깔은" + this.color + "이고 기어는 " + this.gear + "이며 속도는" + this.speed +
				"이고,  연비는 " + this.GasSpeed + "이며 거리는"+ this.pie + "km이고 주행에 필요한 기름양은" + this.Oill + "L 이다";
	}
	void colors(String c) {
		color = c;
	}
	void speedup() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
	void GasSpeed(int g) {
		GasSpeed = g;
	}
	void fillgas(int gas) {
		Oill = (pie*GasSpeed/1000);
	}
}
