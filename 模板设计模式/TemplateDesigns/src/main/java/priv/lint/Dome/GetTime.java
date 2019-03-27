package priv.lint.Dome;

public abstract class GetTime {
//    这就是我们的模板方法
    public long getTime(){
        long start = System.currentTimeMillis();

//        for (int i = 0; i < 10000; i++) {
//            System.out.println(i);
//        }
//        我们计算时间的代码是很灵活的
        code();

        long end = System.currentTimeMillis();
        return end - start;
    }

    public abstract void code();

}
