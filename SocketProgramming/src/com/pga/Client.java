package com.pga;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8888);
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			out.writeUTF("Client: Hey, Thanks for accepting my request");
			
			String data = in.readUTF();
			System.out.println(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
