public class ProCon {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Basket b = new Basket();
        Runnable producerJob = new Producer(b);
        Runnable consumerJob = new Consumer(b);

        Thread producerWorker = new Thread(producerJob);
        Thread consumerWorker = new Thread(consumerJob);

        producerWorker.start();
        consumerWorker.start();
    }
}

class Basket {
    private int nContents;
    private boolean isAvailable = false;

    public synchronized int get() {
        while (isAvailable == false) {
            try {
                System.out.println(Thread.currentThread().getName() + " called wait");
                wait();
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }

        isAvailable = false;
        notifyAll();
        return nContents;
    }

    public synchronized void put(int value) {
        while (isAvailable == true) {
            try {
                System.out.println(Thread.currentThread().getName() + " called wait");
                wait();
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }

        isAvailable = true;
        nContents = value;
        notifyAll();
    }
}

class Consumer implements Runnable {
    private Basket basket;

    public Consumer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = basket.get();
            System.out.println(Thread.currentThread().getName() + " gets " + value);
        }
    }
}

class Producer implements Runnable {
    private Basket basket;

    public Producer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            basket.put(i);
            System.out.println(Thread.currentThread().getName() + " puts " + i);

            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
    }
}