package priv.lint.Dome;

public class GetTime {
    public long getTime(){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}
