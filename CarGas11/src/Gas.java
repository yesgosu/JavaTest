
public class Gas {
	String color;
	int speed;
	int gear;
	int o;
	int carspeed;
	int cargas;
	
	String toCarString() {
		return "�ڵ����� ������" + this.color + ", ����" + this.gear + "�ӷ��� " + this.speed
				+ "����� " + this.cargas + "km�̰� ���࿡ �ʿ��� �⸧����" +  this.o + "�̴�";
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
