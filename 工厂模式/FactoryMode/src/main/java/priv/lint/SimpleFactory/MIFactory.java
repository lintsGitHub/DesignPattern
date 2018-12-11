package priv.lint.SimpleFactory;

public class MIFactory implements BigFactory {
    @Override
    public Phone getPhone() {
        return new MI();
    }
}
