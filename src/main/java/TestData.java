import java.util.ArrayList;
import java.util.List;

public class TestData {

	int id;
	List<String> names;
	String department;
	
	int id1;
	List<String> names1;
	String department1;
	List<SetData> total;
	
    SetData data ;
    SetData data1 ;
    
	TestData() {
		data= new SetData();
		data1= new SetData();
		total = new ArrayList<SetData>();
		
		id = 101;
		department = "IT";

		names = new ArrayList();
		names.add("naveen");
		names.add("praveen");
		names.add("santosh");

		data.setId(id);
		data.setDepartment(department);
		data.setNames(names);
		

		id1 = 101;
		department1 = "Sales";

		names1 = new ArrayList();
		names1.add("naveen1");
		names1.add("praveen1");
		names1.add("santosh1");

		data1.setId(id1);
		data1.setDepartment(department1);
		data1.setNames(names1);
		
		total.add(data);
		total.add(data1);

	}
	
	public List<SetData> getTestData(){
		return total;
	}
}
