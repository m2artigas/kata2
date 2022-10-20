package src;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {2,6,9,5,3,3,0,4,4,0,7,-1,8,-4,8};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        /*for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])) {
                histogram.put(data[i],histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
        }*/
        for (int key: data) {
            if(histogram.containsKey(key)) {
                histogram.put(key,histogram.get(key)+1);
            } else {
                histogram.put(key, 1);
            }
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>"+ histogram.get(key));
        }

    }
}
