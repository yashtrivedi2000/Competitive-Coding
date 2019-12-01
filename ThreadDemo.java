class ThreadDemo
{
    public static void main(String[] args) {
        Thread t1=new Thread(()->
            
            {
                for(int i=0;i<5;i++)
                System.out.println(i);
            }
        );
        Thread t2=new Thread(()->{
            for(int i=5;i<10;i++)
            System.out.println(i);
        });
        t1.start();
        t2.start();
    }
}