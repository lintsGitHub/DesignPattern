package priv.lint.Dome;

public class main {
    public static void main(String[] args) {
//        GetTime getTime = new GetTime();
//        System.out.println(getTime.getTime());
        GetTime getTime = new getForTime();
        System.out.println(getTime.getTime() + "毫秒");
    }
}
