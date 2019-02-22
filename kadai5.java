import java.util.Scanner;


public class kadai5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] q = new String[5];
        q[0] = "Q1:私はオムライスが好きだ";
        q[1] = "Q2:外より家にいる事が多い";
        q[2] = "Q3:松屋よりすき家が好きだ";
        q[3] = "Q4:ギターよりベース派だ";
        q[4] = "Q5:朝に弱い";

        String a;
        a = "1:当てはまらない 2:あまり当てはまらない 3:まあまあ当てはまる 4:当てはまる";

        int sum = 0;
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
            System.out.println(a);
            sum += s.nextInt();
        }
            int x  = sum;
            if (x == 20) {
                System.out.println("診断結果\nあなたと私の相性は最高です。");
            } else if (15 <= x && x < 20) {
                System.out.println("診断結果\nあなたと私の相性はとても良いです。");
            } else if (10 <= x && x < 15) {
                System.out.println("診断結果\nあなたと私の相性はまあまあです。");
            } else if (5 < x && x < 10) {
                System.out.println("診断結果\nあなたと私の相性は普通です。");
            } else if (x == 5) {
                System.out.println("診断結果\nあなたと私の相性はあまりよくありません。");
            }
        }
    }
