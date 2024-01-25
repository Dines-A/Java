interface Fatherinterface{
    abstract void father();
//    default interface methods are abstract and public
}
interface Motherinterface{
    abstract void mother();
}
class Soninterface implements Fatherinterface,Motherinterface{
    public void father()
    {
        System.out.println("This is father overwriting class");
    }
    public void mother()
    {
        System.out.println("This is mother overwriting class");
    }
}

public class Interface {
    public static void main(String[] args) {
        Soninterface obj = new Soninterface();
        obj.father();
        obj.mother();
    }
}
