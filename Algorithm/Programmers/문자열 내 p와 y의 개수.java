import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char [] list = new char[s.length()];
        int pCnt = 0;
        int yCnt = 0;

        for (int i=0; i<s.length(); i++) {
            list[i] = s.charAt(i);
        }

        for (int i=0; i<s.length(); i++) {
            if (list[i] == 'y' || list[i] == 'Y') {
                yCnt++;
            }
            else if (list[i] == 'p' || list[i] == 'P') {
                pCnt++;
            }
        }

        if (yCnt == pCnt) {
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
