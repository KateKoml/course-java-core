package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

public class ConsumerThread implements Runnable {
    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    public void run() {
        store.consume();
    }
}
