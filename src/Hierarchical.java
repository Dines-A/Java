class Mother{
    char gender='M';
    void print()
    {
        System.out.println(gender);
    }
}

class Son extends Mother{

    char gender='M';


}

class Daughter extends  Mother{

    char gender='F';


}

public class Hierarchical  {
    public static void main(String[] args) {
            Daughter obj = new Daughter();
            obj.print();

            Son  objSon = new Son();
            objSon.print();
    }
}
