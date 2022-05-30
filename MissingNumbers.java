package week4.day3.Assignements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set<Integer>unique=new TreeSet<Integer>();
   int[]num= {4,6,7,2,1,3,9,10,8,8,6};
   for (int i:num) {
	   unique.add(i);
   }
   System.out.println(unique);
   List<Integer> print=new ArrayList<Integer>();
	for (int i = 0; i < print.size(); i++) {
		if (print.get(i)+1!=print.get(i+1)) {
			System.out.println(print.get(i)+1);
			break;
		}
	}
	
	
	}

}
