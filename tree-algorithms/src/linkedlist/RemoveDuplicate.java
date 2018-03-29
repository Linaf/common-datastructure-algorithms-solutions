package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

import tree.model.Node;

public class RemoveDuplicate {

	//need refactor with generic Type LinkedList as an argument
	public static void removeDuplicate(LinkedList<String> list) {
		Collections.sort(list);
		if(list.isEmpty() || list.size()==1)
			return;
		Iterator<String> itr= list.iterator();
		String previous =null;
		while(itr.hasNext()) {
			String current=itr.next();
			
			if(Objects.equals(previous, current)){
				list.remove(previous);
			}
			previous=current;
		}
		
}
}