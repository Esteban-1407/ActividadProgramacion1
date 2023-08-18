import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String[]names = {"Diego","Carlos","Sebastian"};
        int[]numbers = {1,3,42,131};
        float[]c = new float[5];
        System.out.println(numbers.length);
        c[0]=1.5f;
        c[1]=4.7f;
        Array.set(c,2,3.7);
        System.out.println(c[1]);
        System.out.println(Array.get(c,1));

        }
    }
