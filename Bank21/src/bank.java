
public class bank {
	double get() {
		return 0.0;
	}
}

class badbank extends bank {
	double get() {
		return 10.0;
	}
}
class nomalbank extends bank {
	double get() {
		return 7.0;
	}
}
class goodbank extends bank {
	double get() {
		return 5.0;
	}
}
class bestbank extends bank {
	double get() {
		return 3.0;
	}
}
