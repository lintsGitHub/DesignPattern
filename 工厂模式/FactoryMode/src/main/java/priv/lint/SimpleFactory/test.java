package priv.lint.SimpleFactory;

import priv.lint.MethodFactory.PhoneFactory;
import priv.lint.PrimitiveMode.HuaWei;
import priv.lint.PrimitiveMode.MI;

public class test {
    public static void main(String[] args) {
        /*
         * 方法工厂模式
         * */
        BigFactory huawei = new HuaWeiFactory();
        Phone phone = huawei.getPhone();
        phone.sayHello();
        BigFactory miFactory = new MIFactory();
        Phone phone1 = miFactory.getPhone();
        phone1.sayHello();
    }
}
