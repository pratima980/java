interface pi{
    void mi();
}
interface po{
    void m2();

}
 class multiple implements pi ,po{
   
  public  void mi(){
        System.out.println("hy");
    };

  public  void m2(){
        System.out.println("hy");
    };
  public  void m23(){
        System.out.println("hy");
    };

    public static void main(String[]args){


        multiple mu =new multiple();

      
        mu.mi();
        mu.m2();
        
    }
 }