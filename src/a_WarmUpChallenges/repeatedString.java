package a_WarmUpChallenges;

public class repeatedString {
    static long repeatedString(String s, long n) {
        long count = 0L;
        long strLen = s.length();
        long strRepeatCount = 0;
        char[] charArray1 = s.toCharArray();
        long remaining = 0;

        if(n>strLen) {
            for (int i=0; i<strLen; i++) {
                if(charArray1[i]=='a')
                    count++;
            }
            strRepeatCount = (n/strLen);
            if (n%strLen == 0) {
                //count = count * strRepeatCount;
            } else {
                //System.out.println("count now = "+count);
                remaining = n-(strLen*strRepeatCount);
                //System.out.println("remaining = "+remaining);
                count = count * strRepeatCount;
                for (int i=0; i<remaining; i++) {
                    if(charArray1[i]=='a')
                        count++;
                }
            }
        } else {
            for (int i=0; i<n; i++) {
                if(charArray1[i]=='a')
                    count++;
            }
        }


        //System.out.println("String length = "+strLen);
        //System.out.println("String repeatations Needed = "+strRepeatCount);

        //String newString = "";

        //System.out.println("NewString: "+newString);

        //counting
        /*
        char[] charArray = newString.toCharArray();
        for (int i=0; i<n; i++) {
            if(charArray[i]=='a')
                count++;
        }
*/

        return count;
    }
    public static void main(String[] args) {
        String s = "aba";
        long n = 10L;
        System.out.println(repeatedString(s,n));
    }
}
