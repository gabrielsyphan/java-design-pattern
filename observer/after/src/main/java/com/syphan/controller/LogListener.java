package com.syphan.controller;

public class LogListener implements EventListener {

    @Override
    public void onEvent(String event, String message) {
        System.out.println("LogListener: " + event + " - " + message);
    }
}
