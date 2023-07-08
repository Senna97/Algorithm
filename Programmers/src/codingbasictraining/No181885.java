package codingbasictraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 > 코딩 기초 트레이닝 > 할 일 목록
public class No181885 {

    public String[] solution(String[] todo_list, boolean[] finished) {

        List<String> toDoList = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                toDoList.add(todo_list[i]);
            }
        }

        String[] answer = new String[toDoList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = toDoList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        No181885 no181885 = new No181885();
        String[] solution = no181885.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});
        System.out.println(Arrays.toString(solution));
    }
}
