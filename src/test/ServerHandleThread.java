package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 服务器端处理线程
 * @author Administrator
 *
 */
public class ServerHandleThread extends Thread{
	private Socket s;
	public boolean isRunning = true;
	public ServerHandleThread(Socket s) {
		super();
		this.s = s;
	}
	public void run(){
		try {
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			while(isRunning){
				byte[] data = new byte[1024*1024];
				int len = in.read(data);
				String str = new String(data, 0, len);
				System.out.println(str);
				if(str.equals("exit")){
					isRunning = false;
				}else{
					str = str.toUpperCase();
					out.write(str.getBytes());
					out.flush();
				}
			}
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
