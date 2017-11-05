
class Testing{
	String word="Hi";
	long phoneno=925299;

	void print() {
		System.out.println("I am in method...");
	}
	void add() {
		int a=5,b=10,c=0;
		c=a+b;
		System.out.println(c);
	}
	
}




public class VarMethoPro {
public static void main(String args[]) {
	Testing test=new Testing();
	System.out.println(test.word);
	test.print();
	test.add();
	
	
	
	}

}
