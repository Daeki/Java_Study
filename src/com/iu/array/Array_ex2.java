package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//몬스터 기본 정보
		String [] monsterNames = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		//파이어볼
		int magicPower=6;
		
		//몬스터 파티 생성
		//몬스터 수 입력 (1-4)후
		//1. 입력한 수만큼 몬스터를 랜덤하게 뽑고
		//2. 해당 몬스터의 hp를 뽑아서
		//출력
		System.out.println("몬스터 수 입력 (1-4)");
		int count = sc.nextInt();
		String [] monsterPartyNames = new String[count];
		int [] monsterPartyHps = new int[monsterPartyNames.length];
		
		for(int i=0;i<monsterPartyNames.length;i++) {
			int index = random.nextInt(4);//1
			monsterPartyNames[i]=monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
		}
		
		for(int i=0;i<monsterPartyNames.length;i++) {
			System.out.println(monsterPartyNames[i]+ " : " + monsterPartyHps[i]);
		}
		
		System.out.println("==========================");
		
		
		//1. 사냥 2. 도망
		//0-6미만의 랜덤한 데미지로 몬스터를 공격//3
		boolean check=true;
		
		while(check) {
			int death =0;
			System.out.println("1. 사냥");
			System.out.println("2. 도망");
			int select = sc.nextInt();
			if(select==1) { 
				for(int i=0;i<monsterPartyNames.length;i++) {
					int damage=random.nextInt(magicPower);
					System.out.println(monsterPartyNames[i]+ "에게 "+ damage + " 피해를 줌");
					monsterPartyHps[i]=monsterPartyHps[i]-damage;
					if(monsterPartyHps[i]<1) {
						death++;
					}
				}
				
				
			}else {
				break;
			}
			
			System.out.println("사냥한 몬스터 수 : "+death);
			
		}//while 끝
		
		
		
		
		

		
		
		

	}

}
