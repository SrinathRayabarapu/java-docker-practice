package com.test.docker;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProcessExecutor {
    public static void main(String[] args) throws InterruptedException, IOException {

        method1(args[0]);

//        method2(args[0]);

    }

    private static void method2(String arg) throws IOException, InterruptedException {
        String[] args1 = new String[2];
        args1[0] = arg;
        args1[1] = "srinath-tester";
        Process process = new ProcessBuilder(args1).start();
        System.out.println("Process executed and waiting..");

        boolean exit = process.waitFor(15, TimeUnit.MINUTES);
        System.out.println("exit boolean : " + exit);

        System.out.println("Exit return value : " + process.exitValue());
    }

    private static void method1(String arg) throws IOException, InterruptedException {
        String[] args1 = new String[2];
        args1[0] = arg;
        args1[1] = "srinath-tester";
        final Process process = Runtime.getRuntime().exec(args1);
        System.out.println("Process executed and waiting..");

        boolean exit = process.waitFor(15, TimeUnit.MINUTES);
        System.out.println("exit boolean : " + exit);

        System.out.println("Exit return value : " + process.exitValue());
    }
}
