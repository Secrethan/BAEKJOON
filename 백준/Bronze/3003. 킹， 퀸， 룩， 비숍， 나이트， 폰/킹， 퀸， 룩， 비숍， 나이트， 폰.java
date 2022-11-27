
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int  k, q, l, b, n, p;
		k = q = 1; 
		l = b = n = 2; 
		p = 8;
	
		Scanner input = new Scanner(System.in);
		int d_k = input.nextInt();
		int d_q = input.nextInt();
		int d_l = input.nextInt();
		int d_b = input.nextInt();
		int d_n = input.nextInt();
		int d_p = input.nextInt();
		
		if(d_k > k ) {
			d_k = k - d_k;
		}
		else {
			d_k = k - d_k;
		}
		if(d_q > q ) {
			d_q = q - d_q;
		}
		else {
			d_q = q - d_q;
		}
		if(d_l > l ) {
			d_l = l - d_l;
		}
		else {
			d_l = l - d_l;
		}
		if(d_b > b ) {
			d_b = b - d_b;
		}
		else {
			d_b = b - d_b;
		}
		if(d_n > n ) {
			d_n = n - d_n;
		}
		else {
			d_n = n - d_n;
		}
		if(d_p > p ) {
			d_p = p - d_p;
		}
		else {
			d_p = p - d_p;
		}
		System.out.println(d_k);
		System.out.println(d_q);
		System.out.println(d_l);
		System.out.println(d_b);
		System.out.println(d_n);
		System.out.println(d_p);
		
		
		input.close();
	}
}
