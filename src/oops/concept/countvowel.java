package oops.concept;

public class countvowel {
	    public static void main(String[] args) {
	        String s = "My Name is Sakshi Bari";
	        
	        String[] words = s.split(" ");
	        
	        for (String word : words) {
	            int count = 0;
	            
	            for (int i = 0; i < word.length(); i++) {
	                char ch = word.charAt(i);
	                
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                    count++;
	                }
	            }
	            
	            System.out.println(word + " " + count);
	        }
	    }
	}

