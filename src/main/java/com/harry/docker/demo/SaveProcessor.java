package com.harry.docker.demo;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description:
 * @author: wangruirui
 * @date: 2018/09/11
 */
public class SaveProcessor extends Thread implements RequestProcessor{

    private LinkedBlockingDeque<Request> blockingQueue = new LinkedBlockingDeque<>();



    @Override
    public void run() {
        while (true){
            try {
                Request request = blockingQueue.take();
                System.out.println("save data " + request);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void processorRequest(Request request) {
        blockingQueue.add(request);

    }
}
