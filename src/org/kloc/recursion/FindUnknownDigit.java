package org.kloc.recursion;

import java.util.Arrays;

public class FindUnknownDigit 
{
	public static void main(String[] args) 
	{
		String st="123*45?=5?088";
		for(int i=0;i<=9;i++)
		{
			char[] ch=st.toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='?')
				{					
					ch[j]=(char)(i+48);
				}
			}
			String s=new String(ch);			
			String[] parts = s.split("=");
	        String LHS = parts[0];
	        String RHS = parts[1];
	        int Result = Expression(LHS);
	        boolean res = Result == Integer.parseInt(RHS);
	        if(res)
	        {
	        	System.out.println(Result);
	        }
	         
		}    
	}
	public static int Expression(String expression) {
        String[] operands = expression.split("[/*+-]"); 
        String[] operators = expression.split("[0-9]+"); 
        operators = Arrays.copyOfRange(operators, 1, operators.length); 
        int result = Integer.parseInt(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            int operand = Integer.parseInt(operands[i]);
            String operator = operators[i - 1];  
            
            switch (operator) {
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
            }
        }
       
        
        return result;
    }
}


//public static int solveExpression( final String expression ) {
//System.out.println(expression);
//for (int i = 0; i <= 9; ++i) {
//  if (!expression.contains("" + i) && (i != 0 || !expression.matches(".*(^\\?[^\\+\\-\\*\\=]|[\\+\\-\\*\\=]\\?[^\\+\\-\\*\\=]).*"))) {
//    String exp = expression.replaceAll("\\?", "" + i);
//    char op = exp.contains("+") ? '+' : exp.contains("*") ? '*' : exp.contains("-") ? '-' : ' ';
//    int number1 = Integer.parseInt(exp.substring(0, exp.indexOf(op, 1)));
//    int number2 = Integer.parseInt(exp.substring(exp.indexOf(op, 1) + 1, exp.indexOf("=")));
//    int result = Integer.parseInt(exp.substring(exp.indexOf("=") + 1));
//    switch (op) {
//      case '+' :
//        if (number1 + number2 == result) return i;
//        break;
//      case '-' :
//        if (number1 - number2 == result) return i;
//        break;
//      case '*' :
//        if (number1 * number2 == result) return i;
//        break;
//    }
//  }
//}
//	return -1;
//}
//}