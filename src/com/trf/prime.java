
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName：   prime
 * FileName: prime.java
 * Author:   润发
 * Date:     2013-1-26 下午3:21:18  
 * Version :
 * Description:将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 **********************************************************/
package com.trf;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Decomposition dec = new Decomposition();
		
		System.out.print("输入一个正整数：");
		dec.decompose(input.nextInt());
		input.close();
	}

}
class Decomposition{
	public void decompose(int n){
		int i = 2;

		System.out.print(n+"=");
		for(; i <= n;){
			if(i == n){
				System.out.print(i);
			}
			else if (n % i == 0){
				System.out.print(i+"*");
				n = n / i;
			}
			else 
				i++;
		}
	}
}