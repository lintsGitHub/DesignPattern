package priv.lint.PolymorphicMode;



public class test {
    public static void main(String[] args) {
        /*
        * 使用多态方式来创建对象
        * */
        Phone phone = new MI();
        phone.sayHello();
        Phone phone2 = new HuaWei();
        phone2.sayHello();
    }
}
