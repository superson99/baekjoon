package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1463 {
	public static int []d;
	//d[n]은 n을 1로만드는데 필요한 최소의 연산 횟수

	public static void main(String[] args) throws IOException {

		new baekjoon_1463().solution();

	}

	private void solution() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		num = Integer.parseInt(br.readLine());
		d = new int[num+1];
		System.out.println(go(num));
		
						
		
	}
	public static int go(int n) {
		if( n == 1) return 0;
		if(d[n] > 0) return d[n];
		d[n] = go(n-1) +1;
		
		if( n % 3 == 0) {
			int temp = go(n/3) + 1;
			if(d[n] > temp) d[n] =temp;
		}
		if( n % 2 == 0) {
			int temp =go(n/2) + 1;
			if(d[n] > temp) d[n] =temp;
		}
			
		return d[n];
	}

}
