package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List fruits;
	private Set crickets;
	private Map cc;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	
	public void setCrickets(Set crickets) {
		this.crickets = crickets;
	}
	
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
	public void printdata(){
		System.out.println("Fruits");
		
		for(Object f:fruits){
			System.out.println(f);
		}
		System.out.println("Fruits");
		
		for(Object cricker:crickets){
			System.out.println(cricker);
		}
		System.out.println("Country and Capitals ");
		Set keys=cc.keySet();
		for(Object key:keys){
			System.out.println("Country: "+key + ":capital:" + cc.get(key));
		}
	}
	
}
