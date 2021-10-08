package desafios;

import java.util.ArrayList;
import java.util.List;

public class WiseCodeOtter {

	public static void main(String[] args) {
		//B, W, A, Z, B, Z, C, W, A, Y
		//B, A, C, A, C, B, C, B, C, A

		//String levelDois[] = {"B" , "W", "A", "Z", "B", "Z", "C", "W", "A", "Y"};
		//	String levelUm[] = {"B" , "A", "C", "A", "C", "B", "C", "B", "C", "A"};
			String levelTres[] = {"C", "Y", "A", "Z", "C", "Y", "C", "W", "B", "Z"};
		//C, Y, B, Z, A, Y, A, Z, C, W

		List<String> moviments = new ArrayList<>();
		List<String> locOt = new ArrayList<>();
		List <String> arritems = new ArrayList<>();
		for(int i = 0; i< levelTres.length; i++) arritems.add(levelTres[i]);
		locOt.add("B");
		for( int i = 0; i < arritems.size()-1; i++) {
			if(locOt.get(locOt.size() - 1).equals("B") && arritems.get(i+1).equals("Y")) {
				moviments.add("keep");
			}else {
				if( arritems.get(i).equals("B") && arritems.get(i+1).equals("A") ||
						arritems.get(i+1).equals("Z")) {
					if(locOt.get(locOt.size()-1).equals("A") ){
						moviments.add("downt");
					}else{ 
						moviments.add("down");
					}
					locOt.add("C");

				} else if(arritems.get(i).equals("B") && arritems.get(i+1).equals("C") ||
						arritems.get(i+1).equals("W")) {
					if(locOt.get(locOt.size()-1).equals("C")){
						moviments.add("upt");
					}else {
						moviments.add("up");
					}
					locOt.add("A");
				}else if( arritems.get(i).equals("C") && arritems.get(i+1).equals("A") ||
						arritems.get(i+1).equals("Y") ||
						arritems.get(i).equals("A") && arritems.get(i+1).equals("Y") ) { 
					if(locOt.get(locOt.size()-1).equals("A")) {
						moviments.add("down");
					} else {
						moviments.add("up");
					} 
					locOt.add("B");
				}
			}
		}
		System.out.println(locOt);
		System.out.println(moviments);



	}


}

