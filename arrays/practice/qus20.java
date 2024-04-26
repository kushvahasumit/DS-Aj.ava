import java.util.ArrayList;

public class qus20 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);

        int k = 17;
        boolean value = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)== k ) {
                System.out.println("value Found "+k);
                value = true;
                break;
            }
        }
        
        if (!value) {
            System.out.println("Element not found");
        }
    }
}
