import java.util.LinkedList;
import java.util.Queue;

class ThreadSafeQueueImpl<T> implements ThreadSafeQueue<T>{


    private Queue<T> queue;
    public Object objLock = new Object();

    public ThreadSafeQueueImpl() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void add(T data) {
        synchronized (objLock){
            queue.add(data);
        }
    }

    @Override
    public T remove() {
        synchronized (objLock){
            return queue.remove();
        }
    }

    @Override
    public T peek() {
        synchronized (objLock){
            return queue.peek();
        }
    }

    @Override
    public boolean isEmpty() {
        synchronized (objLock){
            return queue.isEmpty();
        }
    }
}