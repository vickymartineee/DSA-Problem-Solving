package Problems.Easy;

//printing aabbabcbba as a4b5c1
public class PrintPatternString {

    public static void main(String[] args) {
        String s = "aabbabcbba";
        int i = 0, j = 0, tmp = 0, nextIdx =0;
        String result = String.valueOf(s.charAt(j));
        while (i < s.length()) {
            char temp = s.charAt(j);
            if (s.charAt(i) == temp) {
                tmp++;
            }else if (nextIdx == 0){
                nextIdx = j;
            }
            j++;
            if (j == s.length()) {
                i = nextIdx;
                nextIdx = 0;
                System.out.println(temp+"" + tmp);
                tmp = 0;
                j = i+1;
            }

        }
        System.out.println(result);
    }

}
