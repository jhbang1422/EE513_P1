package bin;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import bin.MessageProtocol;
import bin.WKCLI;
import bin.Worker0;

class Worker1{
	public static void main(String[] args){
		int id = 1;
		Thread cli = new WKCLI(id);
		cli.start();
		Worker0 wk = new Worker0();
		wk.workerServer(id);

	}
}

