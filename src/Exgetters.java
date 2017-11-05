class TestDemo{
	String name;
	int phone;
	int age=40;
	int retirementAge() {
		return age=(65-age);
		
	}
	String getName(){
		return name="prem";
		 
	 }
	 int getPhone() {
		return phone=999;
	 }
	
}
public class Exgetters {
	public static void main(String args[]) {
		TestDemo demo=new TestDemo();
		String name= demo.getName();
		int retirementage=demo.retirementAge();
		//int contact=demo.getPhone();
		System.out.println(name);
		System.out.println(demo.getPhone());
		System.out.println(retirementage);
		
	}
	

}

