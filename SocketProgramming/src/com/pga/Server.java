package com.pga;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);
			System.out.println("Waiting for client....");
			Socket socket = server.accept();
			System.out.println("Client connected...");
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			String data = in.readUTF();
			System.out.println(data);
			
			out.writeUTF("Server: Sure. No problem!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
