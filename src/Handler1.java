package bin;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import bin.MessageProtocol;
import bin.Client;
import bin.Handler0;

public class Handler1{
	public static void main(String[] args){
			int num = 1;
			Thread cli = new HDCLI(num);
			cli.start();
			Handler0 hd = new Handler0();
			hd.handlerConnection(num);

			
	}

}



