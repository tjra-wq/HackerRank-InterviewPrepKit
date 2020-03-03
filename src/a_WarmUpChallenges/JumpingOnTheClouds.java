package a_WarmUpChallenges;

public class JumpingOnTheClouds {
    public static int jumpingOnClouds(int[] c) {
        int count = 0;
        int n = c.length;
        int i = 0;
        while (i!=n) {

            if(i==n-2) {
                count++;
                i = n;
            } else if (i==n-1) {
                //count++;
                i = n;
            } else {
                //System.out.println("c["+i+"] ="+c[i]);
                if (c[i + 2] == 0) {
                    //System.out.println("c["+i+"+2] ="+c[i+2]);
                    i = i + 2;
                    //System.out.println("value of i now="+i);
                    count++;
                    //System.out.println("value of count now = "+count);
                } else {
                    //System.out.println("c["+i+"+1] ="+c[i+1]);
                    i++;
                    //System.out.println("value of i now="+i);
                    count++;
                    //System.out.println("value of count now = "+count);
                }

            }
        }

        return count;
    }
    public static void main(String[] args) {
        //int[] arr = {0,0,1,0,0,1,0};
        //int[] arr = {0,0,0,1,0,0};
        int[] arr = {0,0};
        System.out.println(jumpingOnClouds(arr));
    }
}
