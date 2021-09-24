package asssignment_2;

public class singleobject {
	private static singleobject instance = null;
	
	public int id = 0;
	private singleobject() {
 
	}
	public static singleobject getInstance() {
		if(instance == null) {
			instance = new singleobject();
		}
		return instance;
	}
}
