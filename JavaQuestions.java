public class JavaQuestions {
    public static void main(String args[]) {
        String a = "hello";
        int b = 10, c = 20, d = 30;

        // a=b+c+d;
        // System.out.println(a);error in this case
        a = a + b + c;
        System.out.println(a);
        b = a + c + d;
        System.out.println(b);
        // b=b+c+d;
        // System.out.println(b);error in this case
        // System.out.println(10<20);
        // System.out.println('a'<20);
        // System.out.println('a'<97.6);
        // System.out.println('a'<'A');
        // System.out.println(true>false); All are errors

    }

}
