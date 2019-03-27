package priv.lint.Dome;

public class getForTime extends GetTime {
    @Override
    public void code() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}
