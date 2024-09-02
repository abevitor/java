public class BrasileiraoTabela {
	public static void main(String [] args) {
		String[] times = {"1SaoPaulo", "2Corinthians", "3Palmeiras", "4Santos"};
		String time1 = separarCodigoTime(times);
		System.out.println(time1);
	}

	private static String separarCodigoTime(String[] times) {
		String time1 = times[0].substring(1);
		return time1;
	}

}
