abstract class ABS{
    void normal(){
        System.out.println("Abs cls normal method ");
    }
    abstract void  absMethod();
}

class ASUS extends  ABS{
    void  absMethod(){
        System.out.println("Abstract method over-written");
    }
}


public class Abstract {
    public static void main(String[] args) {
//        ASUS objABS = new ASUS();
//        objABS.normal();
//        objABS.absMethod();

        Derived obj = new Derived();
        obj.BIO();
        obj.print();
    }
}


abstract class BIO{
    public  void BIO(){
        System.out.println("This is abstract class constructor");
    }
    int age=10;
    void print()
    {
        System.out.println("He is : "+age);
    }
    abstract void out();
}

class Derived extends BIO{
    void out(){
        System.out.println("Over written...");
    }
}