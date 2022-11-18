import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[]{3, 5, 9, 7, 15, 3, 4, 2, 8, 2, 8, 10, 4};
        int[] tempList = new int[list.length];
        int starIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] % 2 == 0) && (list[i] == list[j])) {
                    tempList[starIndex++]=list[i];
                }
            }
        }
        System.out.println(Arrays.toString(tempList));
    }
}