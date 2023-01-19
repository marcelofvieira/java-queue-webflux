package com.yahoo.finance.pubmatic;

import com.yahoo.finance.pubmatic.response.Quote;
import com.yahoo.finance.pubmatic.response.Response;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

import static com.yahoo.finance.pubmatic.util.CSVWriter.writeLine;

/**
 * Created by Nikitash Pawar on 7/7/2017.
 */
public class Consumer implements Runnable {
    private BlockingQueue<Response> blockingQueue;
    private PrintWriter writer;
    private Response response = null;

    public Consumer(BlockingQueue<Response> blockingQueue, PrintWriter fileWriter) throws IOException {
        this.blockingQueue = blockingQueue;
        this.writer=fileWriter;
    }

    @Override
    public void run() {

        try {

        while((response = blockingQueue.take()).getQuery() !=null){

                if (response.getAdditionalProperties().get("STOP")== Boolean.TRUE) {
                    System.out.println("REACHED END");
                    break;
                }
                Quote quote = response.getQuery().getResults().getQuote();

                if(Objects.isNull(quote.getLastTradePriceOnly())
                        && Objects.isNull(quote.getOneyrTargetPrice())
                        && Objects.isNull(quote.getYearHigh())
                        && Objects.isNull(quote.getYearHigh())){

                    writeLine(writer, Arrays.asList(quote.getSymbol(), "-1"));
                }else{
                    writeLine(writer, Arrays.asList(quote.getSymbol(), quote.getLastTradePriceOnly(), quote.getOneyrTargetPrice(),
                            quote.getYearHigh(),quote.getYearHigh()));

                }

            System.out.println("Consumed :"+Arrays.asList(quote.getSymbol(), quote.getLastTradePriceOnly(), quote.getOneyrTargetPrice(),
                    quote.getYearHigh(),quote.getYearHigh()));


            }

            System.out.println("Consumer Exited");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.flush();
            writer.close();
        }


    }
}
