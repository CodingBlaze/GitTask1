import java.util.*;

class Sweet{
	int sweetPercent;
	Sweet(int sweetPercent){
		this.sweetPercent=sweetPercent;
	}
	int computeWeight() {
		//Assuming that for 1gm of sweet has 0.5 sweetPercent
		return sweetPercent*2;
	}
	
}
class Choclate{
	String color;
	Choclate(String color){
		this.color=color;
	}
	int computeWeight() {
		if(this.color=="Black") {
			return 10;
		}else {
			return 5;
		}
	}
}
public class Hometask7One {

	public static void main(String[] args) {
		Sweet gulabJamun=new Sweet(75);
		Sweet rasgulla=new Sweet(80);
		Sweet jalebi=new Sweet(50);
		Choclate cadbury=new Choclate("Black");
		Choclate silk=new Choclate("White");
		List<Integer> gifts=new LinkedList<Integer>();
		gifts.add(jalebi.computeWeight());
		gifts.add(silk.computeWeight());
		gifts.add(cadbury.computeWeight());
		gifts.add(rasgulla.computeWeight());
		gifts.add(gulabJamun.computeWeight());
		gifts.sort(null);
		System.out.println(gifts);
	}

}
