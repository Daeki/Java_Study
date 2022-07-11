package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드부터 인원수를 입력 받아서
		// 인원수 만큼 이름을 입력 받아서 
		// 이름들을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int count = sc.nextInt();
		String [] names = new String[count];
		int [] kors = new int [names.length];
		int total_kor=0;//국어 총점을 담을 변수
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+" 번 이름 입력");
			names[i]=sc.next();
		}
		
		//각 학생의 이름별로 국어 점수 입력 후 출력
		for(int i=0;i<kors.length;i++) {
			System.out.println(names[i]+ " 국어 점수 입력");
			kors[i]=sc.nextInt();
		}
		
		//반의 국어 총점을 계산하고 출력
		for(int i=0;i<names.length;i++) {
			total_kor= total_kor+kors[i];
		}
		
		
		//---------------------------------
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		for(int i=0;i<kors.length;i++) {
			System.out.println(names[i]+ " 국어 점수 " + kors[i]);
			
		}
		//
		System.out.println("국어 총점 : "+total_kor);

	}

}
