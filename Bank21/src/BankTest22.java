
public class BankTest22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		badbank b1 = new badbank();
		nomalbank b2 = new nomalbank();
		goodbank b3 = new goodbank();
		bestbank b4 = new bestbank();
		System.out.println("badbank은행의 이자율은" + b1.get());
		System.out.println("noramlbank은행의 이자율은" + b2.get());
		System.out.println("goodbank은행의 이자율은" + b3.get());
		System.out.println("bestbank은행의 이자율은" + b4.get());
	}

}
