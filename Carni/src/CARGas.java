import java.util.Scanner;



public class CARGas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int 0;
		Car CARGas = new Car();
		CARGas.color = "BLUE";
		CARGas.gear = 3;
		CARGas.speed = 40;
		CARGas.pie = 400;
		CARGas.GasSpeed = 10; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주행거리를 입력하시오:");
		//O =scan.nextInt();
		//CARGas.fillgas(Oill);
		 System.out.println(CARGas.toCString());
		
		
		
				
		
	}

}
