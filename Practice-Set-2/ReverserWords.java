package LeetCode;

/**
 * Created by rbabbar on 8/20/14.
 */
public class ReverserWords {
    public static String reverseWords(String s) {
        if (s.length() < 1) return null;
        if (s.length() == 1) return s;
        if (s.length() > 1) {
            int start = 0,
                    end = 0;

            char[] ch = reverse(s.toCharArray(), start, s.length()-1);

            while (start < s.length()) {

                if (ch[end] != ' ') {
                    start = end;
                    for(; end< s.length() && ch[end] != ' '; end++);
                    end--;
                    ch=   reverse(ch, start, end);
                }
                end++;
            }
            return (new String(ch));

        }
        return null;
    }

    protected static char[] reverse(char[] input, int start, int end) {
        while (start < end) {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }

    public static void main(String[] args){


        System.out.println(reverseWords("the sky is blue"));
    }
}
