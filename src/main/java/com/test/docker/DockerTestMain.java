package com.test.docker;

import java.util.Date;

public class DockerTestMain {

    public static void main(String[] args) throws InterruptedException {

        while (true){
            System.out.println(new Date().toString());
            Thread.sleep(30000);
        }

    }

}
