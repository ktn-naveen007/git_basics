
public class Basics extends Exception{
	Basics(){
		
	}
	
	Basics(String str){
		super(str);
	}

	public void divideByZero() {
		try {
		int a, b, c;
		a = 10;
		b = 0;
		c = a / b;
		System.out.println("c=" + c);
		}catch (Exception e) {
			System.out.println("exception message>>>>>>>>" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Basics t = new Basics();
			
			Class cls=t.getClass();
			
			System.out.println("======"+cls.getName());
			
			
			int values[] ={10000,20000,30000,40000,50000};
			
			for(long i:values){
				if(i>40000){
					Basics t1 = new Basics("balance is more");
					
					try {
						throw t1;
					} catch (Basics e) {
						// TODO Auto-generated catch block
						System.out.println("custom exception>>>>>>>>" + e.getMessage());
					}
				}
			}

			String str = null;
		//	System.out.println(str.length());

			System.out.println("********String exception********");
			
			String name ="naveen";
		//	int i = Integer.parseInt(name);

			/*
			 * String str = "naveen"; StringBuilder sb = new StringBuilder(str);
			 * 
			 * 
			 * System.out.println(sb.append("programmer"));
			 */

		//	t.divideByZero();
			System.out.println("*********divide by zero caught*********");
		/*}catch (NullPointerException e) {
			System.out.println("null pointer>>>>>>>>" + e.getMessage());*/
		}/*catch (Exception e) {
			System.out.println("exception message>>>>>>>>" + e.getMessage());
		}*/finally{
			System.out.println("**********finally block executed**********");
		}
	}

}
