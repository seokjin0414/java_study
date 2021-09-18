package programmers.java.Lv1;

public class StringNumberWordToInt {
	
	public int solution(String s) {
	    String[] convert = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    
	    for (int i = 0; i < convert.length; i++) {
	        s = s.replaceAll(convert[i], Integer.toString(i));
	    }
	    
	    return Integer.parseInt(s);
	}
    
    
    public int solution2(String b) {
        int answer = 0;
		String x[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String y[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
				
		for (int i=0; i<10; i++) {
			b = b.replaceAll(x[i], y[i]);
		}
		answer = Integer.parseInt(b);
	 return answer;	
	}
    
    
}
