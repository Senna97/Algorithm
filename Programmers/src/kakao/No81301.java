package kakao;

// 프로그래머스 > 2021 카카오 채용연계형 인턴십 > 숫자 문자열과 영단어
public class No81301 {

    public int solution(String s) {

        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            switch (s.charAt(index)) {
                case 'z':
                    sb.append("0");
                    index += 4;
                    break;
                case 'o':
                    sb.append("1");
                    index += 3;
                    break;
                case 't':
                    if (s.charAt(index + 1) == 'w') {
                        sb.append("2");
                        index += 3;
                    } else {
                        sb.append("3");
                        index += 5;
                    }
                    break;
                case 'f':
                    if (s.charAt(index + 1) == 'o') {
                        sb.append("4");
                    } else {
                        sb.append("5");
                    }
                    index += 4;
                    break;
                case 's':
                    if (s.charAt(index + 1) == 'i') {
                        sb.append("6");
                        index += 3;
                    } else {
                        sb.append("7");
                        index += 5;
                    }
                    break;
                case 'e':
                    sb.append("8");
                    index += 5;
                    break;
                case 'n':
                    sb.append("9");
                    index += 4;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    sb.append(s.charAt(index));
                    index += 1;
                    break;
            }
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        No81301 no81301 = new No81301();
        int solution = no81301.solution("one4seveneight");
        System.out.println(solution);
    }
}
