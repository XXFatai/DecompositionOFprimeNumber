
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName��   prime
 * FileName: prime.java
 * Author:   ��
 * Date:     2013-1-26 ����3:21:18  
 * Version :
 * Description:��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
 **********************************************************/
package com.trf;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Decomposition dec = new Decomposition();
		
		System.out.print("����һ����������");
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