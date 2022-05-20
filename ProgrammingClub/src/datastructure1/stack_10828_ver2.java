package datastructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stack_10828_ver2 {
		
	private static int arr_stack[];
	private static int top = 0;
	
	public static void solution()throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cycle;
		int print_value;
		String[] str_split;
		String str;
		cycle = Integer.parseInt(bf.readLine());
		
		
		arr_stack = new int[cycle+1];
		arr_stack[0] = -1;
		
		for(int i =0 ; i <cycle ; i++) {
			
			str = bf.readLine();
			str_split = str.split(" ");
			
			String instruct = str_split[0];
			
			
			switch(instruct) {
			case "push": 
				int push_value;
				push_value = Integer.parseInt(str_split[1]);
				push(push_value);
				break;
			case "pop":
				int pop_value;
				pop_value = pop();			
				print_value = pop_value;
				System.out.println(print_value);
				break;
				
			case "empty":
				print_value = empty();
				System.out.println(print_value);
				break;
			case "top":
				print_value = top();
				System.out.println(print_value);
				break;
			case "size":
				print_value = size();
				System.out.println(print_value);
				break;
				
			default:
				System.out.println("hi");
				break;
				
			}//end :switch
			
		
			
		}//end : for
	}
	public static int size() {
		return top;
	}
	public static int top() {
		return arr_stack[top];
	}
	public static int empty() {
		
		if(top >0)
		return 0;
		else return 1;
	}
	
	public static int pop() {
		int top_value = arr_stack[top];
		
		
		arr_stack[top] = -1;
		top--;
		if(top <0) top = 0;
		return top_value;
	}
	public static void push(int i) {
		top++;
		arr_stack[top] = i;
	}

	public static void main(String[] args) throws IOException{
		new stack_10828_ver2().solution();
	}
	

}
