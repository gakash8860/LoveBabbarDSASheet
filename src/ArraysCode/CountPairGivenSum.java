package ArraysCode;

public class CountPairGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        System.out.println(getPairCount(arr,6));
    }
    public static int getPairCount(int[]arr,int k){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int counter = 0;


        for (int num : arr) {

            int complement = k - num;

            if (frequencyMap.containsKey(complement)) {
                counter += frequencyMap.get(complement);
            }
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return counter;

    }
}
