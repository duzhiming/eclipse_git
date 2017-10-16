package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class duxie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		try {
			in = new InputStreamReader(new FileInputStream("b.txt"));
			
			char[] b = new char[14];
			int len = -1;
			while((len = in.read(b))!=-1){
				String s = new String(b, 0, len);
				for(int i=0;i<(s.length()/2);i++){
					System.out.println("   "+s.substring(i+7, i+8)+"   "+s.substring(i, i+1));
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(in !=null){
				in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
