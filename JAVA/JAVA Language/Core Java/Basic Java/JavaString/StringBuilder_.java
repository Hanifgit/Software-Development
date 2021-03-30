package JavaString;

public class StringBuilder_ {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");

		/* Append */
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		/* Insert */
		sb.insert(1, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello

		/* Replace */
		sb.replace(1, 3, "Java");
		System.out.println(sb);// prints HJavalo

		/* Delete */
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo

		/* Reverse */
		sb.reverse();
		System.out.println(sb);// prints olleH

		System.out.println(sb.capacity());// now 22 ((oldcapacity*2)+2
	}
}
