package tasks;

import java.util.Arrays;

public class WordCount2 {
	public static void main(String[] args) {
		String str = "hi i am bharathi i am good at programming in java in";
		str = str.toLowerCase();
		
		String words[] = str.split(" ");
		//System.out.println(words);
	
		int count =0;
		for (int i = 0;i<words.length;i++) {
			System.out.println(words[i]);
			count = 1;
			for(int j =i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
				
			}
			
			if(count>1 && words[i]!="0") {
				System.out.println(count);
			}
		}
	}

}
