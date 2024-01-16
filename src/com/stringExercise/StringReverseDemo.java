package com.stringExercise;

public class StringReverseDemo {

	public static void main(String[] args) {
		String line = " India is My Country ";
		String[] words =line.split(" ");
//		for(String s:words)
//			System.out.println(s);
//		
//		for(int i=words.length-1;i>=0;i--) {
//			
//			System.out.print(" "+words[i]);
//		}
	
		StringBuffer sb = new StringBuffer();
	
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]);
			if(i>1)
			{
				sb.append(".");
			}
		}
		System.out.println(sb);
		
	}

}
