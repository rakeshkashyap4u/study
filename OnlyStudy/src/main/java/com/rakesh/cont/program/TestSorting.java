package com.rakesh.cont.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arlist = new ArrayList<>();
		
		arlist.add(1);
		arlist.add(90);
		arlist.add(23);
		arlist.add(16);
		arlist.add(104);
		arlist.add(11);
		arlist.add(58);
		arlist.add(92);
		arlist.add(13);
		
		System.out.println(arlist);
		
		Comparator<Integer> c =(I1 ,I2)-> (I1<I2) ? -1 : (I1>I2) ? +1 :0;
		
		Collections.sort(arlist, c);
		
		System.out.println(arlist);
		
		List<Integer> l2 =  arlist.stream().filter(i->i%2==0).collect(Collectors.toList()); //filter Prime no
		
		
		System.out.println(l2);
		
		
		
		
 
	}
	
}
	
	class MyComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer I1, Integer I2) {
			// TODO Auto-generated method stub
			
			
			
			if(I1<I2)
			{
				return -1;
			}
			
			else if(I1>I2)
			{
				 return +1;
			}
			
			else 
			{
				return 0;
			}
				
							
			
		}

		
		
		
		
		
	}


