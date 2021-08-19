package task2.myTask3;

public class InTerm {
    private String str[];

    public InTerm(String[] str) {
        this.str = str;
    }

    public void output (){
        for (int i = 0; i < str.length; i++) {
            if (i+1!=str.length){
                System.out.print(str[i]+" ");
            }else {
                System.out.println(str[i]);
            }
        }
    }
}