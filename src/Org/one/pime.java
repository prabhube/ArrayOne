package Org.one;

public class pime {
public static void main(String[] args) {
	String s1="hello";
	String s2= "hello";
			String s3=new String("hello");
			String s4= new String("hello");
			StringBuffer s5=new StringBuffer("hello");
			StringBuffer s6= new StringBuffer("hello");
//			System.out.println(s1==s2);//true
//			System.out.println(s1.equals(s2));//true
//			System.out.println(s3==s4);//false
//			System.out.println(s1==s3);//false
			System.out.println(s3.equals(s4));//true
			System.out.println(s1.equals(s3));//true
//			System.out.println(s5==s6);//false
//			System.out.println(s1.equals(s5));//false
//			System.out.println(s5.equals(s6));//false
//			System.out.println(s3.equals(s5));//false
			
}
}
