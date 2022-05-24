package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;


public class baekjoon_1158 {
	
	public void solution(int N,int K) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new LinkedList<>();
		int cnt = 0;
		
		for(int i =0 ; i < N ; i++) {
			queue.offer(i+1);
		}
		
		bw.write("<");
		while(queue.size() != 1) {
			
			cnt = (cnt +1) % K;		

			int value = queue.poll();
			if(cnt == 0) {
				bw.write(value+", ");				
			}
			else {
				queue.offer(value);
			}
		}
		bw.write(queue.poll() + ">");
		
		bw.flush();
		bw.close();
		
		
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();

		String[] values = inputString.split(" ");
		int N = Integer.parseInt(values[0]);
		int K = Integer.parseInt(values[1]);
		
		new baekjoon_1158().solution(N,K);
		br.close();
		
	}

}
