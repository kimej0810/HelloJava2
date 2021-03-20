package test;

public class TestJava {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int sum1 = TestPlus.sum(a,b);
        System.out.println("sum1 :"+sum1);

        String x = "아아아아";
        String y = "하하하하";
        String str1 = TestPlus1.str(x,y);
        System.out.println("str1 :"+str1);
    }
}
