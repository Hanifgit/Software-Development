public class BoxDemo {
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.wigth = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		/*S-01*/
//		double vol = myBox.wigth*myBox.height*myBox.depth;
//		System.out.println("Volume is "+vol);
//		
//		Box myBox1 = myBox;
//		System.out.println("Volume is "+myBox1.height);
		
		/*S-02*/
//		myBox.Volume();
		
		/*S-03*/
		System.out.println(myBox.Volume());
	}
}
