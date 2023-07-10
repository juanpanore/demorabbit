package com.example.demo.util;

public interface MessageSender<T> {
    void execute(T message, String idMessage);
}
