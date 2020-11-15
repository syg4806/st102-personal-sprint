package Ang;
import  java.util.*;
public class Math_giveup {

	public int[] solution(int[] answers) {
        int[] answer;
        int[] onearr = {1,2,3,4,5};
        int[] twoarr = {2,1,2,3,2,4,2,5};
        int[] threearr = {3,3,1,1,2,2,4,4,5,5};
        int onepoint=0, twopoint=0, threepoint=0;
        
        for(int i=0; i<answers.length; i++) {
        	
        	if(onearr[i%onearr.length] == answers[i])
        		onepoint++;
        	if(twoarr[i%twoarr.length] == answers[i])
        		twopoint++;    	
        	if(threearr[i%threearr.length] == answers[i])
        		threepoint++;
        }
        
        int max = Math.max(onepoint, Math.max(twopoint, threepoint));
        List<Integer> list = new ArrayList<Integer>();
        
        if(max == onepoint)
        	list.add(1);
        if(max == twopoint)
        	list.add(2);
        if(max == threepoint)
        	list.add(3);
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
    
        return answer;
    }
}
//ó������ list ���� �����Ϸ��ߴٰ�, ����ؾ��� ��Ȳ���� ���� ���ܼ� list�� ����ϰ� �Ǿ���.
//�߰��� ���� ��޼� �ð��� �����ɷȴµ�, �ڵ� �����ϰ� �ٸ�������� �Ѱ� ���ϱ� ��κ��� ���� ����ϰ� �ߴ�.
