package task2.myTask6;

public class Main6 {
    public static void main(String[] args) {
        Input input = new Input(args);
        input.transform();
        EzeNum ezeNum = new EzeNum(input.getNum());
        ezeNum.findEzeNum();
        ezeNum.output();
    }
}
