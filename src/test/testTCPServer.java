package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class testTCPServer {
	public static boolean isRunning = true;
	public static void main(String[] args) {
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(8888);//端口号（范围1-65535）
			
			System.out.println("服务器已经启动，端口号为8888");
			while(isRunning){
				Socket s = ss.accept();//阻塞方法，等待客户端连接
				System.out.println("服务器接收的客户端："+s.getInetAddress()+"连接.....");
				new ServerHandleThread(s).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ss!=null){
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
