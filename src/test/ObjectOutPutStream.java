package test;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutPutStream {

	public static void main(String[] args) {
		Sprite s = new Sprite("Ð¡Ã¨",10,20,Color.red,5,4);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("game.dat"));
			oos.writeObject(s);
			oos.flush();
			System.out.println("±£´æÍê±Ï");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
