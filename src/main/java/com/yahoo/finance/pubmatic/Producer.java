package com.yahoo.finance.pubmatic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yahoo.finance.pubmatic.response.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Nikitash Pawar on 7/7/2017.
 */
public class Producer implements Runnable {

    private BlockingQueue<Response> blockingQueue;
    private String companyName;

    public Producer(BlockingQueue<Response> blockingQueue, String companyName) {
        this.blockingQueue = blockingQueue;
        this.companyName = companyName.trim();
    }

    @Override
    public void run() {

        HttpURLConnection conn = null;

        try{

            URL url = new URL("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22"+companyName+"%22)&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            ObjectMapper mapper = new ObjectMapper();

            Response response = mapper.readValue(br, Response.class);

            System.out.println("Produced : " + response.getQuery().getResults().getQuote().getSymbol());
            blockingQueue.add(response);

        }catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }finally {

            conn.disconnect();
        }

    }
}







