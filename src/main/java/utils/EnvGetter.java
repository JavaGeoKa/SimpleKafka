package utils;

import java.util.HashMap;
import java.util.Map;

public class EnvGetter {

// Version with args
//    public static void main (String[] args) {
//        for (String env: args) {
//            String value = System.getenv(env);
//            if (value != null) {
//                System.out.format("%s=%s%n",
//                        env, value);
//            } else {
//                System.out.format("%s is"
//                        + " not assigned.%n", env);
//            }
//        }
//    }


//version 1
    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }



//    public static void main(String[] args) {
////        System.out.println(System.getenv(env));
////
//    }
}
