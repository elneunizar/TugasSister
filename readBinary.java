import java.io.*;
import java.util.Base64;
import java.io.UnsupportedEncodingException;
public class readBinary {
	public String encode(String plaintext) {
		try{
			String encoded=Base64.getEncoder().encodeToString(plaintext.getBytes("utf-8"));
			return encoded;
		}
		catch (UnsupportedEncodingException e) {
			System.out.println("Error: "+e.getMessage());
			return "";
		}

	
	}
	public static void main(String[] args) {
		String fileName="joker.jpeg";

		try {
			byte[] buffer=new byte[10710];
			String buffeS,encoded="",decoded="";
			//buffeEncoded;
			
			FileInputStream inputStream=new FileInputStream(fileName);

			int total=0;
			int nRead=0;
			while((nRead=inputStream.read(buffer))!=-1) {
				buffeS=new String(buffer);
				//buffeEncoded=encode(buffeS);
				try { 
					encoded=Base64.getEncoder().encodeToString(buffeS.getBytes("utf-8"));
					byte[] b64decoded=Base64.getDecoder().decode(encoded);
					decoded=new String(b64decoded);
				}
				catch (UnsupportedEncodingException e) {
					System.out.println("Error: "+e.getMessage());
				}


				System.out.println("Not encoded : "+buffeS);
				System.out.println("");
				System.out.println("Encoded : "+encoded);
				System.out.println("");
				System.out.println("Decoded : "+decoded);
				total+=nRead;
			}
			inputStream.close();
			System.out.println("Read "+total+" bytes");
		}
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '"+fileName+"'");
		}
		catch(IOException ex) {
			System.out.println("Error reading file '"+fileName+"'");
		}
	}
}
