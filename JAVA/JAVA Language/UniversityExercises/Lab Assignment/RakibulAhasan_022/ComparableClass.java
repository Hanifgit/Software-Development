package RakibulAhasan_022;

public class ComparableClass implements Comparable<ComparableClass>,Runnable {
	public String name="Papon", id="022";
	
	@Override
	public int compareTo(ComparableClass o) {
		return toString().compareTo(o.toString());
	}

	@Override
	public void run() {
		System.out.println(name+" "+id);
	}

}
