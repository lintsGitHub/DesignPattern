package priv.lint.Dome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        Phone phone = new IPhone();
        phone.call();
        System.out.println("========");

        PhoneDecorate phoneDecorate = new RingPhoneDecorate(phone);
        phoneDecorate.call();

//        像我们在IO流中就经常使用
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
}
