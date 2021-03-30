package VariableArgument_Varargs;

public class ThisClass {
	void Summation(int ...num) {
		int sum = 0;
		for(int x:num) {
			sum+=x;
		}
		System.out.println(""+sum);
	}
}
