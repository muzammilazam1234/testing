package javaprograms;

import java.util.Scanner;

public class VowelsDmo 
{
	public void getvowels(char input)
	{
		switch(input) 
		{
		case 'a':
		{
			System.out.println(input + " is a vowel");
			break;
		}
		
		case 'e':
		{
			System.out.println(input + " is a vowel");
			break;
		}
		
		case 'i':
		{
			System.out.println(input + " is a vowel");
			break;
		}
		
		case 'o':
		{
			System.out.println(input + " is a vowel");
			break;
		}
		
		case 'u':
		{
			System.out.println(input + " is a vowel");
			break;
		}
		
		
		default:
		{
			System.out.println(input + " is a consonent");
		}
		}
		
	}
	
	public static void main(String[] args) {
		VowelsDmo ob = new VowelsDmo();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the character");
		char input = sc.next().charAt(0);
		ob.getvowels(input);
	}
}
