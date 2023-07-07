
public class Main {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Joao","Bob"};
		
		for(int i=0;i<vect.length; i++ ) {
			System.out.println(vect[i]);
		}
		
		//loco for each
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
