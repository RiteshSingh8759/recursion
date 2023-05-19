package org.kloc.recursion;

public class yourorder 
{
	public static void main(String[] args) {
		String st="is2 Thi1s T4est 3a";
		pigIt(st);
		
	}
//	public static String sortString(String input) {
//	    if (input.isEmpty()) {
//	        return "";
//	    }
//	    
//	    String[] words = input.split(" ");
//	    String[] sortedWords = new String[words.length];
//	    
//	    for (String word : words) {
//	        int position = Integer.valueOf(word.replaceAll("\\D", "")) - 1;
//	        sortedWords[position] = word;
//	    }
//	    
//	    return String.join(" ", sortedWords);
//	}
	public static  void pigIt(String str) {
        String[] st=str.split(" ");
        for(int i=0;i<st.length;i++)
          {
          String s=st[i].charAt(st[i].length()-1)+""+st[i].substring(1,st[i].length()-1)+""+st[i].charAt(0)+""+"ay";
          System.out.println(s);
        }
    }

}
