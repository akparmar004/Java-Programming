public class StaticDemo {
    public static void main(String[] args) {
//        Demo d1 = new Demo();
//        Demo d2 = new Demo();
//        Demo d3 = new Demo();

        

        System.out.println(args[0]);

    }
}

class Demo{
    static int r = 20;
//    static makes our variable globally affected by any methods and variables...
//    it can be changed by anywhere...

    public Demo(){
        r++;
        System.out.println(r);
    }
}
