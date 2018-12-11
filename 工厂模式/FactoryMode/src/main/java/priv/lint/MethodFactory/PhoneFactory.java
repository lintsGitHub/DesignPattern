package priv.lint.MethodFactory;

public class PhoneFactory {
    public Phone getPhone(String phoneName){
        if (phoneName.equals("MI"))
            return new MI();
        else if (phoneName.equals("HuaWei"))
            return new HuaWei();
        return null;
    }
}
