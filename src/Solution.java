import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.next(); // enter the word
		char arr[] =str.toCharArray(); // convert it from string to array of char
			
		char p='a';  // start point
		int sum = 0; // start point
		
		for(int i=0;i<arr.length;i++){ 
			
			if( (Math.abs(arr[i]-p)) > 13)  // abs value - char > 13
				sum += (26% (Math.abs(arr[i]-p))); 
			else
				sum += (Math.abs(arr[i]-p));
			
			//System.out.println(Math.abs(arr[i]-p));
			
			p = arr[i];
		}
		
		System.out.println(sum);
	}
}