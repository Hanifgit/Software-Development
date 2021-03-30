package PrimaryJava;

public class StringBufferAndBuilder {
	public static void main(String[] args) {
		String s1 = "Papon";
		StringBuffer sbBuffer = new StringBuffer(s1);
		System.out.println(sbBuffer);
		sbBuffer.append("Ahasan");
		sbBuffer.replace(1,'a', s1);
		s1.replace('r','o');
		sbBuffer.reverse();
		sbBuffer.delete(0, 1);
		sbBuffer.setLength(3);
		
		
		StringBuilder sbBuilder = new StringBuilder(s1);
		System.out.println(sbBuilder);
		sbBuilder.append(" Ahasan");
		System.out.println(sbBuilder);
		sbBuilder.replace(0, 5, "Papon");
		sbBuilder.reverse();
		sbBuilder.delete(2, 4);
		sbBuilder.insert(0, 'a');
		sbBuilder.deleteCharAt(0);
		sbBuilder.toString();
	}
}
