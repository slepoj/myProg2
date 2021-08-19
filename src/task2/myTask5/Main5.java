package task2.myTask5;

public class Main5 {
    public static void main(String[] args) {
        Input input = new Input(args);
        input.transform();
        SumNum sumNum = new SumNum(input.getNum());
        System.out.println(sumNum.sum());
    }
}
