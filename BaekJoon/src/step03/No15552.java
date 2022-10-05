package step03;

import java.io.*;
import java.util.StringTokenizer;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine()); //int 로 받기 위해 형변환

        for (int i = 1; i <= num; i++) {
            st = new StringTokenizer(br.readLine()); //공백 단위로 구분하여
            int A = Integer.parseInt(st.nextToken()); //순서대로 호출
            int B = Integer.parseInt(st.nextToken());

            bw.write(A + B + "\n"); //버퍼에 있는 값 전부 출력
        }
        bw.close(); //스트림 닫기
    }
}
