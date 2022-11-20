/*
  
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

입력
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

출력
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
*/

import java.util.Scanner;

public class Main {
	private int a;
	private int b;
	private int add;
	private int min;
	private int mul;
	private int div;
	private int div_g;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public void makeAdd(int a, int b ) {
		setA(a);
		setB(b);
		add = a + b;
		System.out.println(add);		
	}
	public void makeMin(int a, int b) {
		setA(a);
		setB(b);
		min = a - b;
		System.out.println(min);
	}
	public void makeMul(int a, int b) {
		setA(a);
		setB(b);
		mul = a * b;
		System.out.println(mul);
	}
	public void makeDiv(int a, int b) {
		setA(a);
		setB(b);
		div = a / b;
		System.out.println(div);
	}
	public void makeDiv_g(int a, int b) {
		setA(a);
		setB(b);
		div_g = a % b;
		System.out.println(div_g);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if(a >= 1 || b >= 10000) {
			m.makeAdd(a, b);
			m.makeMin(a, b);
			m.makeMul(a, b);
			m.makeDiv(a, b);
			m.makeDiv_g(a, b);
		}
		else {
			System.out.println("범위 초과");
		}
		input.close();
	}
}
