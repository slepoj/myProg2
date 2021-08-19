package task2.myTask2;

public class AddNum {
    private int mac[];
    private String str[];
    private int sum = 0;

    public AddNum(String srt[]) {
        this.str = srt;
    }

    private void transform() {
        mac = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            try {
                mac[i] = Integer.parseInt(str[i]);
            } catch (NumberFormatException e){
                System.out.println("error data in myTask2");
            }
        }
    }

    public int add() {
        transform();
        for (int n : mac) {
            sum += n;
        }
        return sum;
    }
}
