import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ForPetlja {
	
	String ime = "Stefan";
	
	ArrayList<String> imena = new ArrayList();
	
	
	
	@Test
	public void test01() {
		
		imena.add("Stefan");
		imena.add("Marko");
		imena.add("Darko");
		for(int i=0; i<imena.size(); i++) {
			if(imena.get(i).equals("Marko")) {
				System.out.println("Nasao sam Marka !"+ i);
			}
			
		}
		
	}

}
