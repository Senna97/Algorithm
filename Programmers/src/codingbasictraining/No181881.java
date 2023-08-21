package codingbasictraining;

// 프로그래머스 > 코딩 기초 트레이닝 > 조건에 맞게 수열 변환하기 2
public class No181881 {

    public int solution(int[] arr) {

        int answer = 0;

        while (true) {
            int tryCount = getSameMoment(arr, answer);
            arr = changeArr(arr);

            if (answer == tryCount) {
                break;
            } else {
                answer = tryCount;
            }
        }

        return answer;
    }

    public int[] changeArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2 + 1;
            }

        }

        return arr;
    }

    public int getSameMoment(int[] arr, int tryCount) {

        for (int num : arr) {
            if ((num >= 50 && num % 2 == 0) || (num < 50 && num % 2 != 0)) {
                tryCount++;
                break;
            }
        }

        return tryCount;
    }

    public static void main(String[] args) {
        No181881 no181881 = new No181881();
        int solution = no181881.solution(new int[]{1, 2, 3, 100, 99, 98});
        System.out.println(solution);
    }
}
