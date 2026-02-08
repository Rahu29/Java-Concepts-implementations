import java.util.concurrent.locks.ReentrantLock;

public class RetrantLock {

    private static int balance = 1000;
    private static final ReentrantLock lock = new ReentrantLock();

    static void main() {
        withdraw(10);
    }

    public static void withdraw(int amount){
        lock.lock();
        try{
            if(balance >= amount){
                System.out.println(Thread.currentThread().getName() + " withdrawing...");
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } finally {
            lock.unlock();
        }
    }

}
