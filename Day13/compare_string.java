//do not use == operator to compare string
public class compare_string {
    public static void main(String[] args) {

        String s1 = new String("abc");
        String s2 = new String("abc");
        if (s1 == s2) {
            System.out.println("Equals");
        } else {
            System.out.println("not Equals");
        }
    }
}
