package controller;

import workers.KafkaMyExample;

public class MyKafkaController {

    private static String username = "";
    private static String password = "";
    private static String brokers = "";

    public static void main(String[] args) {


        KafkaMyExample kafka = new KafkaMyExample(brokers, username, password);




    }



}

