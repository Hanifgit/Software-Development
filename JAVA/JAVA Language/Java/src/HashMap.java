import java.util.HashSet;

public class HashMap {
	public static void main(String[] args) {
		java.util.HashMap<String, String>name = new java.util.HashMap<>();
		name.put("Papon", "Rakibul Ahasan");
		name.put("Hanif", "S.k Abu Hanif");
		name.put("Sabbir", "Sabbir Ahmeed");
		System.out.println(name.get("Papon"));
		System.out.println(name.values());
		System.out.println(name);
		name.remove("Papon");
		System.out.println(name);
		
		HashSet<String>nameHashSet = new HashSet<>();
		nameHashSet.add("Apple");
		nameHashSet.add("Banana");
		nameHashSet.add("Apple");
		System.out.println(nameHashSet);
		System.out.println(nameHashSet.size());
		System.out.println(nameHashSet.isEmpty());
	}
}
