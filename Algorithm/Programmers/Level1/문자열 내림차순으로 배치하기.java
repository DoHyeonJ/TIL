import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> lowerList = new ArrayList<>(); //소문자 리스트
        ArrayList<Character> upperList = new ArrayList<>(); //대문자 리스트


        for (int i=0; i<s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) { // 대문자일 경우
                upperList.add(s.charAt(i));
            }
            else { // 소문자일 경우
                lowerList.add(s.charAt(i));
            }
        }

        Collections.sort(lowerList); // sort 로 정렬
        Collections.sort(upperList);
        Collections.reverse(lowerList); // 정렬한거 뒤집기
        Collections.reverse(upperList);

        for (int i=0; i<lowerList.size(); i++) { // 정렬하고 뒤집은 문자 문자열에 중첩하여 담기
            answer = answer + lowerList.get(i);
        }

        for (int i=0; i<upperList.size(); i++) {
            answer = answer + upperList.get(i);
        }

        return answer;
    }
}
