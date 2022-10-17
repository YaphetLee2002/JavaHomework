package chapterNine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        Scanner in = new Scanner(System.in);

        int id;
        String name;

        while(true) {
            id = in.nextInt();
            if(id == -1) {
                break;
            }
            name = in.nextLine();
            hashMap.put(id, name);
        }

        hashMap.forEach((key, value) -> {
            if (key.equals(1)) {
                System.out.println(value);
            }
        });
        in.close();
    }
}
