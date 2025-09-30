//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VowelCounter {

    public static int getCount(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCount("hello world"));   // 3 (e, o, o)
        System.out.println(getCount("java"));          // 2 (a, a)
        System.out.println(getCount("bcdfg"));         // 0
    }
}
