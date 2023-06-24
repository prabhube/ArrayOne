package Org.one;

public class Aray {
public static void main(String[] args) {
	int a[]=new int[5];
		a[0]=5;
		a[1]=65;
		a[3]=68;
//		System.out.println(a[1]);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
	
	String s[]=new String[5];
	s[0]="prabhu";
	s[1]= "prem";
	s[2]="karthick";

	for (String string : s) {
		System.out.println(string);
	}
}
}
