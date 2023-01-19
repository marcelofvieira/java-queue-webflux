package com.yahoo.finance.pubmatic;

import com.yahoo.finance.pubmatic.response.Response;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.*;
import java.util.stream.Stream;

import static com.yahoo.finance.pubmatic.util.CSVWriter.writeLine;
import static java.lang.System.exit;

@SpringBootApplication
public class PubmaticApplication implements CommandLineRunner {

	private static String inputFileName = "Stocks.txt";
	private static final String outputFileName = "Output.csv";



    public static void main(String[] args) throws Exception {

        SpringApplication.run(PubmaticApplication.class, args);

    }

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {


        if (args.length > 0) {
            System.out.println("File Path Provided");
            inputFileName=args[0];
        } else {
            System.out.println("File Path Not Provided taking in default File");
        }

        Date start=new Date();

        ExecutorService threadPool = Executors.newWorkStealingPool(4);

        BlockingQueue<Response> blockingQueue = new LinkedBlockingQueue<>();

        PrintWriter writer=new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)));

        writeLine(writer, Arrays.asList("Symbol", "Current Price", "Year Target Price", "Year High","Year Low"));

        try (Stream<String> stream = Files.lines(Paths.get(inputFileName))) {

            //starting producer threads using the forkJoin pool
            stream
                    .parallel()
                    .forEach(s -> {
                        threadPool.execute(new Producer(blockingQueue, s));
                    });

            //starting consumer thread
            new Thread(new Consumer(blockingQueue, writer)).start();

        } catch (IOException e) {
            System.out.println("Unable to read Input File");
            e.printStackTrace();

        }

        threadPool.shutdown();

        try {
            threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {

        }
        Response response=new Response();
        response.setAdditionalProperty("STOP",Boolean.TRUE);
        blockingQueue.add(response);

        Date end=new Date();
        long seconds = (end.getTime()-start.getTime())/1000;
        System.out.println("done in :"+seconds+" secs");

        //exit(0);
    }

}
