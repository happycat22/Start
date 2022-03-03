package day07;
import java.util.*;
public class Test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] blackpink = new String[4];
		for(int i = 0; i<blackpink.length;i++) {
			System.out.println(blackpink[i]);
		}
		
		blackpink[0] = "제니";
		blackpink[1] = "리사";
		blackpink[2] = "로제";
		blackpink[3] = "제니";
		
		System.out.println(Arrays.toString(blackpink)); // 반드시 배열 확인 용도로만 사용해야 한다. 
	}

	String[] tmp = new String[5];
	for(int i = 0; i<4; i++) {
		tmp[i] = blackpink[i];
	}
			
		tmp[4] = "둘리";
		blackpink = tmp;
		
		//하나씩 출력
//		배열과 같은 데이터는 항상 for 명령이 데이터를 꺼내서 사용하는데 편하다.
		for(String name : blackpink) {
			
		 // 의미: blackpink의 데이터를 순차적으로 하나씩 꺼내서 name 변수에 기억시키세요.
		//출력
			System.out.println(name + " ");

		}
	}

