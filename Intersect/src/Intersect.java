import java.util.ArrayList;
import java.util.Collections;


public class Intersect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(4);
		list1.add(8);
		list1.add(9);
		list1.add(11);
		list1.add(15);
		list1.add(17);
		list1.add(28);
		list1.add(41);
		list1.add(59);
		Collections.sort(list1);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(7);
		list2.add(11);
		list2.add(17);
		list2.add(19);
		list2.add(20);
		list2.add(23);
		list2.add(28);
		list2.add(37);
		list2.add(59);
		list2.add(81);
		Collections.sort(list2);

		System.out.print(list1);
	
		System.out.print(list2);
		
		ArrayList<Integer> found = new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = i+1; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)){
					
				found.add(list1.get(i));
				}
			}
		}
			System.out.print(found);
				
				}

					
					


	}


