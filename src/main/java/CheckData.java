
public class CheckData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData t = new TestData();
		
		System.out.println(t.getTestData().get(1).getId());
		
		System.out.println(t.getTestData().get(1).getDepartment());
		
		for(String s:t.getTestData().get(1).getNames()){
			System.out.println(s);
		}
	}

}
