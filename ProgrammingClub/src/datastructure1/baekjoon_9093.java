package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon_9093 {
	
	public static void solution() throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();
		char[] arr_str;
		

		
		int cycle;	
		cycle = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < cycle ; i++) {
			String str = bf.readLine() + "\n";
			arr_str = str.toCharArray();
			
			for(char ch : arr_str) {
				if(ch == ' ' || ch == '\n') {
					while(!stack.empty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				}
				else {
					stack.push(ch);
				}
			}//end:for
	
		}//end:for
		bw.flush();
		bw.close();
		
	}//end : solution
	
	public static void main(String[] args) throws IOException, Exception {
		new baekjoon_9093().solution();

	}

}
