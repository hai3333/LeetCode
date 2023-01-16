import org.junit.Test;


    public class ThreadTest extends Thread{
        private int a=100;
        public void run(){
            for(int i=0;i<a;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }

        }

        public static void main(String[] args) {
          ThreadTest test=new ThreadTest();
          test.start();
         }


    }





