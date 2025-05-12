package com.edu;
import java.util.*;
public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		int res=(a>b)?((a>c)?((a>d)?a:d):(c>d)?c:d):((b>c)?((b>d)?b:d):c);
		System.out.println("greatest="+res);
			}
		}

