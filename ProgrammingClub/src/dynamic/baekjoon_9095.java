package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_9095 {

	public static int d[];
	public static int sum;
	
	public void solution(int num){
		
//		for(int i = 0; i < num ; i ++) {
//			
//		}
		d = new int[num +1];
		System.out.println(go(num));
		
				
	}
	
	public int go(int n) {
		if(n == 0 || n ==1 ) return 1;
		if(n == 2) return 2;
				
		if(d[n] >0 ) return d[n];
		
		d[n] = go(n-1) + go(n-2) + go(n-3);
		
		return d[n];
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		new baekjoon_9095().solution(num);

	}

}
