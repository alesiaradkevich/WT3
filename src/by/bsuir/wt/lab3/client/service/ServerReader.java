package by.bsuir.wt.lab3.client.service;


import by.bsuir.wt.lab3.client.clientconsole.CommandPrinter;
import by.bsuir.wt.lab3.client.clientconsole.CommandReader;
import by.bsuir.wt.lab3.server.service.ServerLogic;

import java.io.IOException;
import java.util.Scanner;

public class ServerReader extends Thread {
    Client client;
    String data;
    CommandPrinter commandPrinter;
    ClientLogic clientLogic;
    public ServerReader(Client client, ClientLogic clientLogic) {
        this.clientLogic = clientLogic;
        this.client = client;
        data = "";
        commandPrinter = new CommandPrinter();
    }

    public void run() {
        try {
            while (!data.equals("STOP")){
                data = client.getData();
                commandPrinter.print(data);
            }
            client.sendCommand("STOP");
            client.close();
            clientLogic.setNonEnable();
            commandPrinter.print("Break with the server\n" +
                    "Enter any character");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

