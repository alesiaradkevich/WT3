package by.bsuir.wt.lab3.client.main;


import by.bsuir.wt.lab3.client.clientconsole.CommandReader;
import by.bsuir.wt.lab3.client.service.ClientLogic;
import by.bsuir.wt.lab3.server.service.ServerLogic;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClientLogic clientLogic = new ClientLogic();
        clientLogic.startClient();
    }
}
