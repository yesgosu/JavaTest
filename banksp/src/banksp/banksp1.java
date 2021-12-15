package banksp;

public class banksp1 {
	double get() {
		return 0.0;
	}
}

class badbank extends banksp1 {
	double get() {
		return 10.0;
	}
}

class nomalbank extends banksp1 {
	double get() {
		return 7.0;
	}
}
class goodbank extends banksp1 {
	double get( ) {
		return 5.0;
	}
}
class bestbank extends banksp1 {
	double get() {
		return 3.0;
	}
}
