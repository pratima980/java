class parent{
    public void display()
    {
        System.out.println("parent");
    }
}

class b1 extends parent{
    public void display(){
        System.out.println(
            "b1"
        );
    };

}

    class b2 extends parent{
        public void display(){
            System.out.println("b2");
        }
    }

class poly{
    public static  void main(String[]args){
     b1 obj1 =new b1();
     b2 obj2=new b2();
     obj1.display();
     obj2.display();

    }
    
} 