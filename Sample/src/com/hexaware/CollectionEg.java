package com.hexaware;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionEg {

	public static void main(String[] args) {
		List list = new ArrayList(); //LinkedList,Vector
		list.add("Hari");
		list.add("Priya");
		list.add("Hari");
		list.add(1);
		list.add(2.2);
		list.add(true);
		list.add('A');
		list.add(null);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println("**********");
		
		System.out.println("**********");
		List llist = new LinkedList(); //LinkedList
		llist.add("Hari");
		llist.add("Priya");
		llist.add("Hari");
		llist.add(1);
		llist.add(2.2);
		llist.add(true);
		llist.add('A');
		llist.add(null);
		System.out.println(llist);
		llist.remove(5);
		System.out.println(llist);
		Iterator lit =llist.iterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println(llist.size());
		System.out.println(llist.isEmpty());
		System.out.println("**********");
		
		System.out.println("**********");
		List vlist = new Vector(); //Vector
		vlist.add("Hari");
		vlist.add("Priya");
		vlist.add("Hari");
		vlist.add(1);
		vlist.add(2.2);
		vlist.add(true);
		vlist.add('A');
		vlist.add(null);
		System.out.println(vlist);
		vlist.remove(5);
		System.out.println(vlist);
		Iterator vit =vlist.iterator();
		while(lit.hasNext()) {
			System.out.println(vit.next());
		}
		System.out.println(vlist.size());
		System.out.println(vlist.isEmpty());
		System.out.println("**********");
		Set set = new HashSet(); //TreeSet
		set.add("Hari");
		set.add("Priya");
		set.add("Hari");
		set.add(1);
		set.add(2.2);
		set.add(true);
		set.add('A');
		set.add(null);
		System.out.println(set);
		Iterator itt =set.iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		System.out.println("**********");
//		Set tset = new TreeSet(); //TreeSet
//		tset.add("Hari");
//		tset.add("Priya");
//		tset.add("Hari");
//		//tset.add(1);
//		//tset.add(2.2);
//		tset.add(true);
//		tset.add('A');
//		tset.add(null);
//		System.out.println(tset);
//		Iterator tsit =tset.iterator();
//		while(tsit.hasNext()) {
//			System.out.println(tsit.next());
//		}
		System.out.println("**********");
		Map map = new HashMap(); // Hashtable, Treemap
		map.put("1", "Hari");
		map.put("2", "Priya");
		map.put("3", "Hari");
		map.put("4", 1);
		map.put("5", 2.2);
		map.put("6", true);
		map.put("7", 'A');
		map.put("7", null);
		map.put("8", "Bala");
		map.put(null, "Ram");
		System.out.println(map);
		
		Collection col=map.values();
		Iterator itm =col.iterator();
		while(itm.hasNext()) {
			System.out.println(itm.next());
		}
		System.out.println("**********");
		
		System.out.println("**********");
		Map table = new Hashtable(); // Hashtable null values not taken
		table.put("1", "Hari");
		table.put("2", "Priya");
		table.put("3", "Hari");
		table.put("4", 1);
		table.put("5", 2.2);
		table.put("6", true);
		table.put("7", 'A');
		//table.put("7", null);
		table.put("8", "Bala");
		//table.put(null, "Ram");
		System.out.println(table);
		
		Collection htcol=table.values();
		Iterator itht =htcol.iterator();
		while(itht.hasNext()) {
			System.out.println(itht.next());
		}
		System.out.println("**********");
		
		System.out.println("Treemap");
		Map tmap = new TreeMap(); //  Treemap key should not be null
		tmap.put("1", "Hari");
		tmap.put("2", "Priya");
		tmap.put("3", "Hari");
		tmap.put("4", 1);
		tmap.put("5", 2.2);
		tmap.put("6", true);
		tmap.put("7", 'A');
		tmap.put("7", null);
		tmap.put("8", "Bala");
		//tmap.put(null, "Ram");
		System.out.println(tmap);
		
		Collection tmcol=tmap.values();
		Iterator ittm =tmcol.iterator();
		while(ittm.hasNext()) {
			System.out.println(ittm.next());
		}
		System.out.println("**********");
	}

}
