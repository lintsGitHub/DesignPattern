package priv.lint.MethodFactory;

public class test {
    public static void main(String[] args) {
        /*
        * 简单工厂模式
        * */
        PhoneFactory factory = new PhoneFactory();
        Phone mi = factory.getPhone("MI");
        mi.sayHello();
        Phone huaWei = factory.getPhone("HuaWei");
        huaWei.sayHello();
    }
}
