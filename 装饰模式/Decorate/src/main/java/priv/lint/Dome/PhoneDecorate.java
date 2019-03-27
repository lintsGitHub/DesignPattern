package priv.lint.Dome;
/*
* 装饰的抽象类
* */
public class PhoneDecorate implements Phone {

    private Phone phone;

    public PhoneDecorate(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        this.phone.call();
    }
}
