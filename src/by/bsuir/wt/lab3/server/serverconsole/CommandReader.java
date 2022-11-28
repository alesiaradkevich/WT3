package by.bsuir.wt.lab3.server.serverconsole;


import by.bsuir.wt.lab3.server.service.ServerLogic;

import java.io.IOException;
import java.util.Scanner;

public class CommandReader extends Thread{
    Scanner scan;
    ServerLogic serverLogic;
    public CommandReader(ServerLogic serverLogic){
        this.serverLogic = serverLogic;
        scan = new Scanner(System.in);
    }

    public void run(){
        String command = scan.next();
        if (command.equals("STOP")) {
            try {
                serverLogic.stopConnection();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}

