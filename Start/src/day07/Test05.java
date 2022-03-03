package day07;

import java.util.Arrays;

/*
5과목의 점수를 기억할 배열을 만들고, 
과목 점수를 입력하고 총점도 배열의 마지막에 계산해서 입력하고
평균을 구해 출력하세요.
배열에 담긴 과목 점수도 같이 출력하세요. 
*/

public class Test05 {
	public static void main(String[] args) {
		// 할일
//		1. 배열을 만든다.
		int[] subj = new int[6];
		// 맨 마지막 방에는 총점이 계산 되어야 하므로 그 이전방까지 접근해서 점수를 입력한다.
		for(int i =0; i<subj.length -1; i++) {
//			2. 과목점수를 만들어서 입력한다.
			int score = (int)(Math.random()* 41 + 60); // 41 = 100 - 60 + 1
			subj[i] = score;
		}
		
		System.out.println(("1. " + Arrays.toString(subj)));
		
//		3. 총점을 계산해서 입력한다.
		for(int i = 0; i<subj.length -1; i++) {
//			subj[5] += subj[i]; 		// 마지막 배열에 총합을 누적시켜 대입한다.
			subj[subj.length - 1] += subj[i]; // 이렇게 쓰는 게 수정 시 더 쉽다.
		}
		
		System.out.println("2. " + Arrays.toString(subj));
		
//		4. 평균 구해서 기억 시킨다
		int no = subj.length -1;	// 마지막 총점을 빼야 평균이 구해짐
		double avg = subj[subj.length-1] / (double)no;
		
//		5. 데이터 출력한다.
		System.out.println("과목점수 : ");
		for(int i = 0; i<subj.length-1; i++){// 과목 점수 출력
			System.out.print(subj[i] + " | ");		
			}
		System.out.println();	// 줄바꿈
		System.out.println("총    점 : " + subj[subj.length -1]);
		System.out.println("평    균 : " + avg);
		
		
		
	}
}
