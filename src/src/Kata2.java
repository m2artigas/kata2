package src;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {2,6,9,5,3,3,0,4,4,0,7,-1,8,-4,8};

        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr= histo.getHistogram();

        for (int key: data) {
            if(histogr.containsKey(key)) {
                histogr.put(key,histogr.get(key));
            } else {
                histogr.put(key, 1);
            }
        }
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>"+ histogr.get(key));
        }

    }
}
