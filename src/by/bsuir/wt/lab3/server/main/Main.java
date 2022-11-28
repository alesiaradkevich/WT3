package by.bsuir.wt.lab3.server.main;

import by.bsuir.wt.lab3.server.service.ServerLogic;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerLogic serverLogic = new ServerLogic();
        serverLogic.startConnection();
    }

}

