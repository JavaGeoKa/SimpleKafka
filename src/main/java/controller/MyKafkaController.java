package controller;

import workers.KafkaMyExample;

public class MyKafkaController {

    private static String username = "1hg9gmta";
    private static String password = "GKgmM21mW3nSz_THBTvHRS5hOfXBTJy5";
    private static String brokers = "tricycle.srvs.cloudkafka.com";

    public static void main(String[] args) {


        KafkaMyExample kafka = new KafkaMyExample(brokers, username, password);




    }



}

