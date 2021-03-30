
/*Static Variable jnno Class object build korte hoie na,
Static variable class name sate use korte parbo.Eta Class name related*/
public class OneStatic {
      String name;
      int id;
      static String university = "BUBT";
      
      OneStatic(String name,int id) {
    	  this.name = name;
    	  this.id = id;
      }
      void Display() {
    	  System.out.println(name);
    	  System.out.println(id);
    	  System.out.println(university);
      }
}
