package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon_9012 {

	public static  String solution(String str) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();
		char char_arr[];

			char_arr = str.toCharArray();
			for(char ch : char_arr) {			
					if(ch == '(')stack.push(ch);
					else {
						if(stack.empty()) return "NO";
						stack.pop();
					}										
			}		
			if(!stack.empty()) return "NO";
			else return "YES";
		
		
	}
	
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int cycle;
		cycle = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < cycle ; i++) {
			System.out.println(solution(br.readLine()));
		}
	}
}
