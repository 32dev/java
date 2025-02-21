//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    long count = 0;
    public long solution(long num) {

        long answer = 0;
        if ( count >= 500){
            return -1;
        }else  if (num == 1) {
            return count;
        } else if (num % 2 == 0) {
            count++;
            num = num / 2;
            return solution(num);
        } else {
            count++;
            num = num * 3 + 1;
            return solution(num);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main().solution(626331));

    }
}