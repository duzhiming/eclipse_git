package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class testTCPclient {
	public static boolean isRunning = true;
	public static void main(String[] args) {
		
		Socket s =null;
		Scanner sc = new Scanner(System.in);
		try {
			//����socekt�����֣���ҪIP,�˿ں�
			s = new Socket("192.168.4.77",8888);
			
			//��ȡ���������
			OutputStream out = s.getOutputStream();
			InputStream in = s.getInputStream();
			while(isRunning){
				//�������ݸ�������
				System.out.println("��������Ҫ���͵�����");
				String msg = sc.nextLine();
				out.write(msg.getBytes());
				out.flush();
				System.out.println("����������ϣ���");
				if ("exit".equals(msg)) {// �ͻ��������ر�
					isRunning = false;
					System.out.println("�ͻ����ѹر�");
				}else{
					//���շ�������������
					byte[] data = new byte[1024*1024];
					int len = in.read(data);
					String str = new String(data,0,len);
					System.out.println("���յ������������ݣ�"+str);
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(s!=null&&!s.isClosed()){
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
