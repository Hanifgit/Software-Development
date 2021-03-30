package WithOutSynchronization;

public class JavaString extends Thread {

	MethodClass p1 = new MethodClass() {
		void Method() {
			/* Create CharAt() */
			String s = "Sachin";
			System.out.println(s.charAt(0));// S
			System.out.println(s.charAt(3));// h
			char ch = s.charAt(4);
			System.out.println(ch);

			/* Create Concat() */
			String s1 = "Rakibul";
			s1 = s1.concat(" Ahasan");
			System.out.println(s1);
			String str = "Sachin" + " Tendulkar";
			System.out.println(str);

			/* Create Replace() */
			String s2 = "Java is a programming language. Java is a platform. Java is an Island.";
			String replaceString = s2.replace("Java", "Kava");
			System.out.println(replaceString);

			/* Create StringBuffer() */
			StringBuffer sb = new StringBuffer("Hello ");
			/* Append */
			sb.append("Java");
			System.out.println(sb);

			/* Insert */
			sb.insert(1, "Java");
			System.out.println(sb);

			/* Replace */
			sb.replace(1, 3, "Java");
			System.out.println(sb);

			/* Delete */
			sb.delete(1, 3);
			System.out.println(sb);

			/* Reverse */
			sb.reverse();
			System.out.println(sb);

			System.out.println(sb.capacity());

			/* Create StringBuilder() */
			StringBuilder sb1 = new StringBuilder("Hello ");
			/* Append */
			sb1.append("Java");
			System.out.println(sb1);

			/* Insert */
			sb1.insert(1, "Java");
			System.out.println(sb1);

			/* Replace */
			sb1.replace(1, 3, "Java");
			System.out.println(sb1);

			/* Delete */
			sb1.delete(1, 3);
			System.out.println(sb1);

			/* Reverse */
			sb1.reverse();
			System.out.println(sb1);

			System.out.println(sb1.capacity());

			/* Create StringCompare() */
			String s4 = "Sachin";
			String s5 = "Sachin";
			String s6 = "SACHIN";
			System.out.println(s4.equals(s5));// true
			System.out.println(s4.equals(s6));// false
			System.out.println(s4.equalsIgnoreCase(s6));// true
			System.out.println(s4 == s5);
			System.out.println(s4.compareTo(s5));// 0
			System.out.println(s4.compareTo(s6));// 1(because s1>s3)
			System.out.println(s6.compareTo(s4));// -1(because s3 < s1 )

			/* UpperCase_LowerCase() */
			String st = "Sachin";
			String str1 = " Sachin ";
			System.out.println(st.toUpperCase());// SACHIN
			System.out.println(st.toLowerCase());// sachin
			System.out.println(st);
			System.out.println(str1);
			System.out.println(str1.trim());

			/* substring() */
			String str2 = "SachinTendulkar";
			System.out.println(str2.substring(6));// Tendulkar
			System.out.println(str2.substring(0, 6));// Sachin
		}
	};

	@Override
	public void run() {
		p1.Method();
	}
}
