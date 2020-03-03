package a_WarmUpChallenges;

public class CountingValleys {
    static int countingValleys(int n, String s) {
        char[] charArray = s.toCharArray();
        int sea = 0;
        int valley = 0;
        for(int i=0; i<charArray.length; i++) {
            //System.out.println(charArray[i]);
            if(charArray[i]=='U')
                sea++;
            if(charArray[i]=='D')
                sea--;
            if(sea==0 && charArray[i]=='U')
                valley++;
        }
        //System.out.println("sea ="+sea);
        //System.out.println("valleys ="+valley);

        return valley;
    }

    public static void main(String[] args) {
        //String s = "UDDDUDUU";
        String s = "DDUUDDUDUUUD";
        countingValleys(s.length(),s);
        System.out.println(countingValleys(s.length(),s));
    }
}
