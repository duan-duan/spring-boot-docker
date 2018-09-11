package com.harry.docker.demo;

/**
 * @Description:
 * @author: wangruirui
 * @date: 2018/09/11
 */
public class Demo {

    PrintProcessor printProcessor;

    public Demo() {
        SaveProcessor saveProcessor = new SaveProcessor();
        saveProcessor.start();
        printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();

    }
    public static void main(String[] args){
        Request request = new Request();
        request.setName("kaka");
        new Demo().toTest(request);

    }

    public void toTest(Request request){
        printProcessor.processorRequest(request);


    }
}
