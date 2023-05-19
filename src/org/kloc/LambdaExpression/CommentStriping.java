package org.kloc.LambdaExpression;

public class CommentStriping {

	public static void main(String[] args) 
	{
		String[] cs={ "#", "!" };
		String text="apples, pears # and bananas\ngrapes\nbananas !apples";
		String[] st=text.split("\n");
		int i=0;
		StringBuilder s=new StringBuilder();
		for(i=0;i<st.length;i++)
		{
			int a=0;
			int j=0;
			while(j<cs.length)
			{
				if(st[i].contains(cs[j]))
				{
					
					a=st[i].indexOf(cs[j]);
					s=s.append(st[i].substring(0,a));
					break;
				}
				if()
				j++;
			}
			
			i++;
		}
		System.out.println(s);
				
	}

}
