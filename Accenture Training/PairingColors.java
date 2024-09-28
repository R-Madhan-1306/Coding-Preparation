import java.util.*;

public class PairingColors {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(obj.nextInt());
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int pairCount = 0;
        for (int freq : frequencyMap.values()) {
            pairCount += freq / 2;
        }

        System.out.println(pairCount);
    }
}
