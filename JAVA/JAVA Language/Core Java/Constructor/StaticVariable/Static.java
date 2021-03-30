package StaticVariable;

public class Static {
    static int count = 0;
    
    public Static() {
		count++;
	}
    void Display() {
    	System.out.println(count);
    }
}
