package program_by_data_structure1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
	    String lower = s.toLowerCase();
	    char[] c = lower.toCharArray(); // converting to a char array
	    int freq_h =0, freq_e = 0,freq_l = 0,freq_o=0;

	    for(int i = 0; i< c.length;i++) {
	        if(c[i]=='h') // looking for 'a' only
	          freq_h++;
	        if(c[i]=='e')
	          freq_e++;
	        if (c[i]=='l') {
	          freq_l++;
	        }

	        if (c[i]=='o') {
	          freq_o++;
	        }       
	    }
	    freq_l=freq_l/2;
	    Integer a[]={freq_h,freq_e,freq_l,freq_o}; 
	    List<Integer> list=Arrays.asList(a);  
	    Collections.sort(list);  
	    int element=list.get(0); 
	    System.out.println("Number of hello: "+list.get(0));
	    
	    }
	  }

	
