class GrandFather{
    int age=21;

}
class Father extends GrandFather{
    void father()
    {
        System.out.println("Father : "+age);
    }
}

public class Multilevel extends Father {
    public static void main(String[] args) {
        Father obj = new Father();
        obj.father();
    }
}