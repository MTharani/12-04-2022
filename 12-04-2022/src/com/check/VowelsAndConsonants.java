package com.check;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) 
	{
		int v=0,c=0,s=0;
		System.out.println("enter the sentence");
          Scanner sc=new Scanner(System.in);
          String name=sc.nextLine();
          for(int i=0;i<name.length();i++)
          {
        	  char ch=name.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
        	  v++;
          }
          else if(ch==' ') 
          {
        	  s++;
          }
          else
          {
        	  c++;
          }
          }
          System.out.println("vowels is:" +v);
          System.out.println("consonants is:"+c);
          System.out.println("space is:"+s);
	}

}
