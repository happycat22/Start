package day07;

import java.util.Arrays;

/*
 6개의 메모리를 배열로 만들고 그 안에 랜덤한 숫자를 입력한 후 출력하세요. 

 1~45까지의 숫자를 중복되지 않는 값으로 랜덤으로 뽑아라 
  
 */
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		//할일    
		
		int[] lotto = new int[6];		// 1. 변수 초기화 2. 배열 만들기
		
		loop:
		for(int i = 0; i<lotto.length; i++) {
			int no = (int)(Math.random()*45 +1);	// 3. 랜덤하게 숫자를 만들어서
			
		
		// 중복 검사
		// 지금 만든 번호가 이전에 이미 만들어진 번호면 지금 회차를 반복한다.
		// 지금 회차를 다시 반복한다
		
		for(int j=0; j<i; j++) {			
			int tmp = lotto[j];		//이전에 만든 번호 추출
			if(no==tmp) {
						// 이경우는 지금 만든 번호가 이전회차에서 이미 만든 번호이므로 지금 회차를 다시 반복한다.
				i--;	// 회차를 1 감소 시켜준다.
				
				continue loop;	// 다음 회차를 진행한다.
		}
	}
		
		lotto[i] = no;	//4. 배열 채워넣기
	}
		
			for(int i =0; i<lotto.length; i++) {
				System.out.print((lotto[i] + " | ")); 	// 5. 하나씩 출력
			}
			
			System.out.println();
		
	}

}
