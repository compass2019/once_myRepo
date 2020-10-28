package cn.itcast.visible;

public class Test001 {
    public static void main(String[] args) {
        String s1 = new String("abc");
//        String s2 = new String("def");
//        String s3 = s1.intern() + s2.intern();
//        String s4 = "abcdef";
//        System.out.println(s3 == s4);
        String s5 = "abc";
        String s6 = s1.intern();
        System.out.println(s1.equals(s5));//false
        System.out.println(s5==s6);//true

    }
}