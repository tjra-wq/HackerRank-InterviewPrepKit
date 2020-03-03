package a_WarmUpChallenges;

import java.util.HashMap;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        int pairCounter = 0;
        for(int i : ar) {
            if(hm.get(i)!=null) {
                count = hm.get(i);
                hm.put(i,count+1);
            } else {
                hm.put(i,1);
            }
        }

        for(Integer keyInteger: hm.keySet()) {
            if(hm.get(keyInteger)>1)
                pairCounter+=hm.get(keyInteger)/2;
        }
        return pairCounter;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,30,50,10,20};
        int n = arr.length;
        System.out.println(sockMerchant(n,arr));
    }
}

