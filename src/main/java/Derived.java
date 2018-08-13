import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Derived extends Base {

	public static void m1() {
		System.out.println("derived class static m1 called....");
	}

	public void m1(int i) {
		System.out.println("derived class m1 called....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Derived();

		b.m1(10);

		b.m1();

	/*	LinkedHashMap<Integer, String> map = new LinkedHashMap();
		map.put(1, "naveen");
		map.put(2, "praveen");
		map.put(3, "santosh");

		for (int i : map.keySet()) {
			System.out.println(map.get(i));
		}

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "::" + e.getValue());
		}

		Set<Entry<Integer, String>> s = map.entrySet();

		for (Entry e : s) {
			System.out.println(e.getKey() + ">>" + e.getValue());
		}

		for (String str : map.values()) {
			System.out.println("values====" + str);
		}*/
		
		
		
		LinkedHashMap<Integer, List<String>> map1 = new LinkedHashMap();
		List<String> al = new ArrayList();
		al.add("naveen");
		al.add("praveen");
		al.add("santosh");
		
		List<String> al1 = new ArrayList();
		al1.add("naveen1");
		al1.add("praveen1");
		al1.add("santosh1");
		
		map1.put(1, al);
		map1.put(2, al1);
		
		for (Map.Entry<Integer, List<String>> e : map1.entrySet()) {
			for(int i=0;i<e.getValue().size();i++){
			System.out.println(e.getKey() + "::" + e.getValue().get(i));
		}
		}
		
		int arr[] = {10,30,40,20};
		
		
		
		
	}

}
