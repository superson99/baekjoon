package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon_9012 {

	public void solution() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();
		char char_arr[];
		String str;
		
		int cycle;
		cycle = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < cycle; i++) {
			str = br.readLine();
			char_arr = str.toCharArray();
			
			for(char ch : char_arr) {
				if(ch == '(')stack.push(ch);
				else stack.pop();
			}
			if(!stack.empty()) bw.write("No");
			else bw.write("YES");
			
			
			stack.clear();
			bw.write("\n");
			bw.flush();
		}
		bw.close();
	}
	
	
	public static void main(String[] args)throws IOException {
		 new baekjoon_9012().solution();
	}

}
