package priv.lint.Dome;

/*
* 装饰类
* */
public class RingPhoneDecorate extends PhoneDecorate {
    public RingPhoneDecorate(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        System.out.println("手机彩铃");
        super.call();
    }
}
