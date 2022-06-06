package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class baekjoon_17413 {

	
	public void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> stackTag = new Stack<Character>();	
		boolean tag = false;
		
		String str = br.readLine() + "\n";
		
		char[] strArr = str.toCharArray();
		
		for(char ch :strArr) {
			
			if(ch == '<') tag = true;
			if(ch =='>') {
				tag = false;
				bw.write(ch);
				continue;
			}
			
			if(tag) {
				while(!stack.empty()) bw.write(stack.pop());
				bw.write(ch);
			}
			if(!tag) {
				if(ch == ' ' || ch == '\n') {
					while(!stack.empty()) bw.write(stack.pop());
					if(ch != '\n') bw.write(ch);
				}
				else stack.push(ch);			
			}
			
			
			
		}
		bw.flush();
		bw.close();
		
		
		
	}
	
	public static void main(String[] args)  throws IOException {
		new baekjoon_17413().solution();

	}

}
