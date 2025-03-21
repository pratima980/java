class a extends Thread{
     
     public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("first thread running"+ i);
           try{ Thread.sleep(1000);}
           catch(InterruptedException e){
              e.printStackTrace();
           }

        }
     }
}

class b extends Thread{
 public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("second thread running"+ i);
           try{ Thread.sleep(1000);}
           catch(InterruptedException e){
              e.printStackTrace();
           }

        }
     }

}

class parallel {

    public static void main(String[]args){
         b obj =new b();
          a obj1 =new a();
          obj1.start();
           obj.start();
 System.out.println("Main thread finished!");

    }
}