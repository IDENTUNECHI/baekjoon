

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(b==0 && c==0) {
                break;
            }
            System.out.println(b + c);
        }

    }
}
