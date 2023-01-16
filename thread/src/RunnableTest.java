public class RunnableTest implements  Runnable{
    private static int a=100;
    @Override
    public void run() {
        for(int i=0;i<a;i++){
            if(i%2==0){
                System.out.println(i);


            }
        }
    }

    public static void main(String[] args) {
        RunnableTest runnable=new RunnableTest();
        runnable.run();


    }
}
