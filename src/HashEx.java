import java.util.HashMap;
import java.util.Map;

public class HashEx {
	public static void main(String args[]) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"prem");
		map.put(2,"siva");
		map.put(3,"ravi");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"         "+m.getValue());
		}
		
	}

}
