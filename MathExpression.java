import java.util.Stack;

public class MathExpression {

	public void solve(String e) {
		Stack<String> stack = new Stack();
		//1+6*3-10/5+1
		int i=0;
		while(true) {
			char c =e.charAt(i);
			if(i > e.length()-1)
				break;
			if(Character.isDigit(c)){
				if (stack.isEmpty()){
					stack.push(Character.toString(c));
				} else if(isNumeric(stack.peek())) {
					stack.push(stack.pop().concat(Character.toString(c)));
				} else {
					stack.push(Character.toString(c));
				}
			}
			i++;
		}
		process(stack);
	}
	
	public void process(Stack<String> stack) {
		if(stack.isEmpty()) return;
		while(true) {
			//if(stack.peek())
		}
	}
	
	public static boolean isNumeric(String str)
	{
	    return str.matches("-?\\d+(.\\d+)?");
	}
}
