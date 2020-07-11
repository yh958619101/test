package yh.myframe;

public class Demo1 {
    @Check
    public void add() {
        System.out.println("1+1=" + (1 + 1));
    }

    @Check
    public void sub() {

        System.out.println("2-1=" + (2 - 1));
    }

    @Check
    public void mul() {

        System.out.println("1*2=" + (1 * 2));
    }

    @Check
    public void div() {
        System.out.println("2/0=" + (2 / 0));
    }

    @Check
    private void say() throws Exception {
        throw new Exception("错误发生");
    }

    @Check
    private void says() throws Exception {
        throw new Exception("错误是发生");
    }
}
