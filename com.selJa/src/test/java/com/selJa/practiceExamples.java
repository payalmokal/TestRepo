package com.selJa;

public class practiceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//reverse string
		String line="The simplest ever visual guide";
		
		StringBuilder line1= new StringBuilder();
		line1.append(line);
		System.out.println(line1.reverse());
		
		int len=(line.length());
		String nstr="";
		for(int i=0;i<len;i++) {
			char ch=line.charAt(i);
			nstr=ch+nstr;
			System.out.println(nstr);
		}
		System.out.println(nstr);
	}

}
