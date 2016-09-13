import org.apache.xmlrpc;
import java.util.Base64;
//import java.io.*;
import java.io.UnsupportedEncodingException;

public class Server {
	public String decode(String encoded) {
		String decoded="";
		try {
			byte[] b64decoded=Base64.getEncoder().encodeToString(encoded.getBytes("utf-8"));
			decoded=new String(b64decoded);
			return decoded;
		}
		catch(UnsupportedEncodingException e) {
			System.out.println("Error :"+e.getMessage());
			return "";
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("Attempting to start XML-RPC Server........");
			WebServer Server=new WebServer(80);
			server.addHandler("sample",new Server());
			server.start();

			System.out.println("Started successfully.");
			System.out.println("Attempting decode. (Press keyboard interrupt to stop.)");
		}
		catch (Exception er) {
			System.err.println("JavaServer: "+exception);
		}
	}
}

