package banksp;

public class banktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		badbank b1 = new badbank();
		nomalbank b2 = new nomalbank();
		goodbank b3 = new goodbank();
		bestbank b4 = new bestbank();
		
		System.out.println("badbank�� ��������"+ b1.get());
		System.out.println("nomalbank�� ��������" + b2.get());
		System.out.println("goodbank�� ��������" + b3.get());
		System.out.println("bestbank�� ��������" + b4.get());
	}

}
