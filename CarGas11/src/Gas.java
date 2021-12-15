
public class Gas {
	String color;
	int speed;
	int gear;
	int o;
	int carspeed;
	int cargas;
	
	String toCarString() {
		return "자동차의 색깔은" + this.color + ", 기어는" + this.gear + "속력은 " + this.speed
				+ "연비는 " + this.cargas + "km이고 주행에 필요한 기름양은" +  this.o + "이다";
	}
	void color(String c) {
		color = c;
	}
	void speedup() {
		speed = speed + 10; 
	}
	void speeddown() {
		speed = speed - 10;
	}
	void cargas(int g) {
		cargas = g;
	}
	void fullasg(int gas) {
		o = (cargas*carspeed)/1000;
	}
}
