import java.util.Arrays;
// 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42576

/**
 * 두개의 배열을 정렬해서, 순회하며 비교하고, 달라지는 순간 그 아이를 리턴한다.
 */


public class NoCompletePlayer {
    static public void main(String[] args){
        String[] participant =  {"leo", "kiki", "eden"};
        String[] completion =  { "leo", "eden"};
        System.out.println(solution(participant,completion));
    }

    static public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<completion.length;i++){
            if(participant[i].equals(completion[i])){
                continue;
            }else {
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
