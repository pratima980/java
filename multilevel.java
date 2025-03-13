class parent{
    public void parentmethod(){
        System.out.println("ths is parent");

    }
}
class p2 extends parent{
    public void p2method(){
        System.out.println("  this is p2");
    }
}
class p3 extends p2 {
    public void p3method(){
        System.out.println("this is p3");
    }
}
 public class multilevel extends p3{

public void multilevelmethod(){

System.out.println(" this is multilevel");

}
    public static void main(String[]args)
    {

multilevel obj =new multilevel();
obj.multilevelmethod();
obj.p3method();
obj.p2method();
obj.parentmethod();

    }
 }class multiple extends pi ,po{