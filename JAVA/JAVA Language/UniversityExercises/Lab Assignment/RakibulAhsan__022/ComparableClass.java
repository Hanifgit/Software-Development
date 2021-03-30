package RakibulAhsan__022;

class ComparableClass implements Comparable<ComparableClass>,Runnable {
	public String name="Papon", id="022";
	
	@Override
	public int compareTo(ComparableClass o) {
		return toString().compareTo(o.toString());
	}

	public synchronized void run() {
		System.out.println(name+" "+id);
	}

}
