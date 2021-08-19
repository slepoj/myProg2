package task2.myTask4;

public class Main4 {
    public static void main(String[] args) {
        Input input = new Input(args);
        input.transform();
        Nod nod = new Nod(input.getA(),input.getB());
        System.out.println(nod.findNod());
    }
}
