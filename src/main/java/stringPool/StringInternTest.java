package stringPool;

public class StringInternTest {
    public static void main(String[] args) {

        String s1 = new String("hello") + new String("hello");
        String intern1 = s1.intern();
        String s2 = "hellohello";
        System.out.println(s1 == s2);//懵逼
        //System.out.println(intern1 == s2);
        //这个boolean与这两句的先后有关
        /*String intern3 = s3.intern();
        String s4 = "hellohello";*/

        String s3 = new String("hello") + new String("hello");
        String s4 = "hellohello";
        String intern3 = s3.intern();
        System.out.println(s3 == s4);
        //System.out.println(intern3 == s4);

    }
    /**
     jdk 1.7 1.8

     true
     //true
     false
     //true
     */
    /**
     jdk 1.6

     false
     //true
     false
     //true
     */
}
