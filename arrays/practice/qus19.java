import java.util.ArrayList;

public class qus19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(6);
        list.add(2);
        list.add(13);
        list.add(44);
        list.add(50);
        list.add(16);
        list.add(37);

        int minEl = Integer.MAX_VALUE;
        int minEl2 = Integer.MAX_VALUE;

        for (int num : list) {
            if (num < minEl) {
                minEl2 = minEl; 
                minEl = num;
            } else if (num < minEl2 && num != minEl) { 
                minEl2 = num;
            }
        }

        System.out.println( minEl2);
    }
}
