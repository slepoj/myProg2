package task2.myTask6;

public class Input {
    private String str[];
    private int num;

    public Input(String[] str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void transform() {
        try {
            num = Integer.parseInt(str[0]);
        } catch (Exception e) {
            System.out.println("error data in myTask6");
        }
    }
}
