package codingbasictraining;

import java.util.Arrays;

// 프로그래머스 > 코딩 기초 트레이닝 > 공백으로 구분하기 1
public class No181869 {

    public String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        No181869 no181869 = new No181869();
        String[] solution = no181869.solution("i love you");
        System.out.println(Arrays.toString(solution));
    }
}
