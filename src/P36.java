public class P36{
    private static boolean flag=true;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                    for (int i = 1; i <= 52;) {
                        synchronized (P36.class) {
                        try {
                            P36.class.notifyAll();
                            for (int j=0;j<2;j++) {
                                System.out.print(i++);
                            }
                            P36.class.wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                    for (char a = 'a'; a <= 'z'; a++) {
                        synchronized (P36.class) {
                        try {
                            P36.class.notifyAll();
                            System.out.print(a);
                            P36.class.wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
