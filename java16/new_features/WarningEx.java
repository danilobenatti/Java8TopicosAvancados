package new_features;

public class WarningEx {
	
	public static void main(String[] args) {
		
		@SuppressWarnings(value = "removal")
		Integer i1 = new Integer(5);
		System.out.println(i1);
		
	}
	
}
