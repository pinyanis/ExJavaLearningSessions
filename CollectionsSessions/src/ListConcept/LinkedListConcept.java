package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print
		System.out.println("content of linkedlist:"+ll);
		
		//addfirst;
		ll.addFirst("Naveen");
		//addlast;
		ll.addLast("Automation");
		
		System.out.println("content of linked list:" + ll);
	
		//get;
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//set;
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove  first and last element;
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedList:"+ ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist:"+ll);
		
		//how to iterate(or print) all the values of LinkedList;
		//for loop
		
		System.out.println("****Using for loop");
		for (int n=0; n<ll.size();n++) {
			System.out.println(ll.get(n));
			
		}
		
		//advance for loop
		System.out.println("****Using advance for loop");{
		for (String str : ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("****Using iterator");
		
		Iterator<String> it	= ll.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		
		}
		
		System.out.println("****Using while loop");
		//while loop
		int num=0;
		while (ll.size()>num) {
		System.out.println(ll.get(num));
		num++;
		}
		
		
		
		
		}
		
	}

}
