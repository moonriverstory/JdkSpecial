package binding.dynamicBinding;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        Person a = new Man();
        //  a.age内部主要通过如下字节码实现：
        //  getfield      #5                  // Field test/Person.age:I
        System.out.println(a.age);
        //  a.getAge()内部主要通过如下字节码实现：
        //  invokevirtual #7                  // Method test/Person.getAge:()I
        System.out.println(a.getAge());
    }
    /**
     30
     40
     */
}
