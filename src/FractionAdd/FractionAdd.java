package FractionAdd;

import java.util.*;

/*분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.

두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오. 
기약분수란 더 이상 약분되지 않는 분수를 의미한다.

입력
첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다. 입력되는 네 자연수는 모두 30,000 이하이다.

출력
첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 빈 칸을 사이에 두고 순서대로 출력한다.*/

//더이산 나누어 지지 않는 분수를 구하는 문제로 분수를 공통분모로 만든 후 유클리드 호제법을 이용해 최대공약수로 분자와 분모를 나누어 해결
public class FractionAdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		
		//공통 분모로 만들어주는 과정
		int num1 = (n1 * n4) + (n2 * n3);
		int num2 = n2 * n4;
		
		int count = GCD(num1, num2);
		
		//공통분모로 만들고 분자와 분모에 동시에 최대공약수로 나눔
		System.out.print(num1/count + " " + num2/count);
	}
	
	//유클리드 호제법으로 최대 공약수를 구함
	public static int GCD(int num1, int num2) {
		if(num1 == 0) {
			return num2;
		}
		return GCD(num2%num1, num1);
	}
}
