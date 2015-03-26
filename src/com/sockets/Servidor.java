package com.sockets;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta12345aberta!");
		Socket cliente = servidor.accept();
		System.out.println("Novaconexãocomocliente"
				+ cliente.getInetAddress().getHostAddress());
		Scanner s = new Scanner(cliente.getInputStream());
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
		servidor.close();
		cliente.close();
	}

}
