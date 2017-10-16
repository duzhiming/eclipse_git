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
			ss = new ServerSocket(8888);//�˿ںţ���Χ1-65535��
			
			System.out.println("�������Ѿ��������˿ں�Ϊ8888");
			while(isRunning){
				Socket s = ss.accept();//�����������ȴ��ͻ�������
				System.out.println("���������յĿͻ��ˣ�"+s.getInetAddress()+"����.....");
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
