package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_11726 {

	public static int d[];
	
	
	public static void main(String[] args) throws IOException{
		new baekjoon_11726().solution();

	}

	public void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		d = new int[num +1];
		int asw = go(num);
		System.out.println(asw);
		
	}

	public static int go(int n) {
		
		if( n == 1 || n == 0) return 1;
		if (n == 2) return 2;
		if(d[n] > 0 )return d[n];
		
		d[n] = go(n-1) + go(n-2);		
		d[n] %= 10007;
		return d[n];
		
	}
}
