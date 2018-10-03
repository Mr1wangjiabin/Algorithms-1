package Ch_1_3_Bags_Queues_And_Stacks;

import static Ch_1_3_Bags_Queues_And_Stacks.Practise_1_3_04.*;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_3_09 {
    /*
     * 思路 :
     * 
     * 准备两个栈，一个用于存放拼接字符串的结果栈，一个用于读取运算符的运算符栈
     * 
     * 浏览表达式，读到 + - * '/' 就入运算符栈
     * 读到 右括号 就在结果栈弹两个元素出来，再把运算符栈顶元素弹出来，拼接成 补全的字符串 再放回结果栈
     * 
     * 
     */
	public static String transform(String str) {
		 LinkedListStack<String> complete = new LinkedListStack<String>();
		 LinkedListStack<String> optr = new LinkedListStack<String>();
		 Boolean continuous = false;
		 for(String s : str.split("")) {
			 if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				 optr.push(s);
				 continuous = false;
			 } else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			     if (continuous) {
			         complete.push(complete.pop() + s);
			     } else {
			         complete.push(s);
			         continuous = true;
			     }
			 } else if (s.equals("(") || s.equals(")")) {
			     continuous = false;
				 String op2 = complete.pop(),
						op1 = complete.pop(),
						opt = optr.pop();
				 complete.push("(" + op1 + opt + op2 + ")");
			 }
		 }
		 return complete.pop();
	 }

   public static void main(String[] args) {
       StdOut.println(transform("11 + 23 ) * 33 - 44 ) * 65 - 6 ) ) )"));
       StdOut.println(transform("11+23)*33-44)*65-6)))"));
   }
}
