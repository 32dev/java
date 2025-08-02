package collatz_guess;
public class Main {
    long count = 0;
    public long solution(long num) {

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