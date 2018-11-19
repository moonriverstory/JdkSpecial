package objectPool;

/**
 * 八种基本类型的包装类，其中6种，有对象cache，称为对象常量池。
 *
 * Integer cache [-128,127] objects static.
 */
public class ObjectPoolTest {
    public static void main(String[] args) {
        objPoolTest();
    }

    public static void objPoolTest() {
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);

        System.out.println("i1=i2\t" + (i1 == i2));
        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));//栈内计算出结果
        System.out.println("i4=i5\t" + (i4 == i5));//不同对象
        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));//栈内计算出结果

        System.out.println();
    }
    /**
     i1=i2	true
     i1=i2+i3	true
     i4=i5	false
     i4=i5+i6	true
     */
}
