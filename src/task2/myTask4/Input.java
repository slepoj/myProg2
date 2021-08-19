package task2.myTask4;

public class Input {
    private String str[];
    private int a, b;

    public Input(String[] str) {
        this.str = str;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void transform() {
        try {
            a = Integer.parseInt(str[0]);
        } catch (Exception e) {
            System.out.println("error data in myTask4");
        }
        try {

            b = Integer.parseInt(str[1]);
        } catch (Exception e) {
            System.out.println("error data in myTask4");
        }
    }
}
