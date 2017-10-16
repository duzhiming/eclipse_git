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
			//创建socekt套数字，需要IP,端口号
			s = new Socket("192.168.4.77",8888);
			
			//获取输入输出流
			OutputStream out = s.getOutputStream();
			InputStream in = s.getInputStream();
			while(isRunning){
				//发送数据给服务器
				System.out.println("请输入你要发送的内容");
				String msg = sc.nextLine();
				out.write(msg.getBytes());
				out.flush();
				System.out.println("发送数据完毕！！");
				if ("exit".equals(msg)) {// 客户端主动关闭
					isRunning = false;
					System.out.println("客户端已关闭");
				}else{
					//接收服务器返回数据
					byte[] data = new byte[1024*1024];
					int len = in.read(data);
					String str = new String(data,0,len);
					System.out.println("接收到服务器的数据："+str);
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
