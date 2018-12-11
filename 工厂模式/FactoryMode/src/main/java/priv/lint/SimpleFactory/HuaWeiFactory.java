package priv.lint.SimpleFactory;

public class HuaWeiFactory implements BigFactory {
    @Override
    public Phone getPhone() {
        return new HuaWei();
    }
}
