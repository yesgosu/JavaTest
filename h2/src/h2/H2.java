package h2;


public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"frod","front","frost","frozen","frame","kakao"};
		String[] queries = {"fro??","???o","fr???","fro???","pro?"};

		int[] answer = soluntion(words, queries);

		for(int i=0; i<answer.length; i++) {
		System.out.print(answer[i]+ " ");	
		}
	}

	
	public static int[] soluntion(String[] words, String[] queries) {
		int[] answer = new int[queries.length];
		
		for(int i= 0; i< queries.length; i++) {
			String[] splitQueries = queries[i].split("");
			int count = 0;
		for(int j= 0; j<words.length; j++) {
			String[] splitwords = words[j].split("");
			
			if(splitQueries.length == splitQueries.length) {
				int k = 0;
				for(k =0; k<splitQueries.length; k++) {
					if(splitQueries[k].equals(splitwords[k]) || splitQueries[k].equals("?")) {
						continue;
					}else {
						break;
					}
				
			}
			if( k  == splitwords.length) {
				count++;
			}
		}
		}
		answer[i] = count;
	}
	return answer;
}
}