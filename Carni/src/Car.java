
public class Car {
	String color; //����
	int gas; // �⸧��
	int gear; // ���
	int speed; // ���ǵ�
	int GasSpeed; // ����
	int Oill; // �⸧��
	int pie; // �Ÿ�
	
	String toCString() {
		return "�ڵ����� ������" + this.color + "�̰� ���� " + this.gear + "�̸� �ӵ���" + this.speed +
				"�̰�,  ����� " + this.GasSpeed + "�̸� �Ÿ���"+ this.pie + "km�̰� ���࿡ �ʿ��� �⸧����" + this.Oill + "L �̴�";
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
