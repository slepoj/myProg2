package task2.myTask5;

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
            } catch (NumberFormatException e){
                System.out.println("error data in myTask5");
            }
        }
}
