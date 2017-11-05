
class MethParmsDemo{
	public void speak() {
		System.out.println("It can speak...");
	}
	public void walk(String direction, int distance) {
		System.out.println("It can move in"+" "+direction+" "+"for distance "+distance);
		
	}
	
}


public class JavaMethParms {

	public static void main(String[] args) {
		MethParmsDemo params=new MethParmsDemo ();
		params.speak();
		params.walk("east",7);
		String direction="west";
		int distance=77;
		params.walk(direction,distance);
		
	}

}
