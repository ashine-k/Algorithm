import java.util.*;

class Solution {

    public int solution(int storey) {
        int answer = 0;
        while (storey != 0) {
            int num = storey % 10;
            if (num == 5) {
                if ((storey / 10) % 10 >= 5) { // 55 65 75
                    storey += 5;
                } else {
                    storey -= 5;
                }
                answer += 5;
            } else if (num > 5) {
                storey += 10 - num;
                answer += 10 - num;
            } else {
                storey -= num;
                answer += num;
            }
            storey /= 10;
        }
        return answer;
    }
}