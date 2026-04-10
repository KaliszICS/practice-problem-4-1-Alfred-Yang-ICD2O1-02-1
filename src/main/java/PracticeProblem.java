public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}
	public static String seriesInclusive(int shibby){
		String nun = "1";
		int num = 1;
		if (shibby < 1){
			return "";
		}
		while (num < shibby){
			num++;
			nun += " " + num;
		}

		return nun;
	}
	public static String seriesExclusive(int shibby){
		String nun = "0";
		int num = 0;
		if (shibby < 1){
			return "";
		}
		while (num < shibby-1){
			num++;
			nun += " " + num;
		}

		return nun;
	}

}
