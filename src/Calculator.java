import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
	Stack<Integer> stack = new Stack<>(); 
	

	public String toString() {
		if (stack.isEmpty())
		{
		return "[].";
		}
		return stack.toString()+'.';

	}

	public void loadConstant(int i) {
		stack.push(i);	
	}

	public void subtract() {
		int sum = stack.get(0)- stack.get(1);
		stack.clear();
		stack.push(sum);
	}
		

	public void multiply() {
		int sum = stack.get(0)* stack.get(1);
		stack.clear();
		stack.push(sum);
		
	}

	public void total() {
		
		
	}

	public void add() {
		int sum = stack.get(0)+ stack.get(1);
		stack.clear();
		stack.push(sum);
	}

	public void divide() {
		int sum = stack.get(0)/ stack.get(1);
		stack.clear();
		stack.push(sum);
		
	}

}

