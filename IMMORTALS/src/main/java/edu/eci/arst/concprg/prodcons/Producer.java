/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arst.concprg.prodcons;

import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class Producer extends Thread {

    private Queue<Integer> queue = null;
    
    private int dataSeed = 1000000000 ;
    private Random rand=null;
    private final long stockLimit;
    private boolean stop;

    public Producer(Queue<Integer> queue,long stockLimit) {
        this.queue = queue;
        rand = new Random(System.currentTimeMillis());
        this.stockLimit=stockLimit;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() >= stockLimit) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            dataSeed = dataSeed + rand.nextInt(100);
            System.out.println(queue.size());
            //System.out.println("Producer added " + dataSeed);
            synchronized (queue) {
                queue.add(dataSeed);
                queue.notify();
            }
        }
    }
        
    
    public boolean estoyLleno(){
        return stop;
    }
    public synchronized void aCorrer() {
        System.out.println(queue.size());
        stop =false;
	notify();
    }
}
