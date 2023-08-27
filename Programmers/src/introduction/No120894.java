package introduction;

// 프로그래머스 > 코딩테스트 입문 > 영어가 싫어요
public class No120894 {

    public long solution(String numbers) {

        StringBuilder answer = new StringBuilder();

        while (true) {
            if (numbers.length() == 0) {
                break;

            } else {
                char initial = numbers.charAt(0);

                switch (initial) {
                    case 'z':
                        answer.append('0');
                        numbers = numbers.substring(4);
                        break;
                    case 'o':
                        answer.append('1');
                        numbers = numbers.substring(3);
                        break;
                    case 't':
                        if (numbers.charAt(1) == 'w') {
                            answer.append('2');
                            numbers = numbers.substring(3);
                        } else {
                            answer.append('3');
                            numbers = numbers.substring(5);
                        }
                        break;
                    case 'f':
                        if (numbers.charAt(1) == 'o') {
                            answer.append('4');
                        } else {
                            answer.append('5');
                        }
                        numbers = numbers.substring(4);
                        break;
                    case 's':
                        if (numbers.charAt(1) == 'i') {
                            answer.append('6');
                            numbers = numbers.substring(3);
                        } else {
                            answer.append('7');
                            numbers = numbers.substring(5);
                        }
                        break;
                    case 'e':
                        answer.append('8');
                        numbers = numbers.substring(5);
                        break;
                    case 'n':
                        answer.append('9');
                        numbers = numbers.substring(4);
                        break;
                }
            }

        }

        return Long.parseLong(answer.toString());
    }

    public static void main(String[] args) {
        No120894 no120894 = new No120894();
        long solution = no120894.solution("onetwothreefourfivesixseveneightnine");
        System.out.println(solution);
    }
}
