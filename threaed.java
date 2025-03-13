class threaed extends Thread {
    public void run(){

for(int i=0 ;i<=5;i++){

    System.out.println("threda is"+i);
    try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }}

      public static void main(String[] args) {

threaed rt1 =new threaed();
rt1.start();
      }

}  