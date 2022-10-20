package src;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Juan", "Manolo", "Juan", "Pepe", "Roberto", "Marta"};

        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr= histo.getHistogram();

        for (String key: data) {
            if(histogr.containsKey(key)) {
                histogr.put(key,histogr.get(key));
            } else {
                histogr.put(key, 1);
            }
        }
        for (String key : histogr.keySet()) {
            System.out.println(key + "==>"+ histogr.get(key));
        }

    }
}
