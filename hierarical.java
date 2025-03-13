class parent{
     public void parentclass(){
    System.out.println(" this is parent vlass method");
     } 
}
 class b1 extends parent {
    public void b1method(){
             System.out.println(" this is b1  vlass method");

    }
 }
  class hierarical extends parent{
    public void b2method(){
        System.out.println("this is b2 method");
    }

    public static void main(String[] args){


 hierarical ne =new hierarical();

ne.parentclass();
b1 tt=new b1();
tt.b1method();
ne.b2method();

    }

  }