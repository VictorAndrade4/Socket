import java.net.*; 
import java.io.*; 

public class EchoServer {
	
	private static String lerArquivo(String path) throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        String txt   = "";
        System.out.println("Lendo arquivo: ");
        while (true) {
            if (linha != null) { 
            	System.out.println(linha);
            	txt += linha;
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
        return txt;
	}
	
	public static void main(String[] args) throws IOException 
	   { 
	    ServerSocket serverSocket = null; 
	    int porta = 10007;
	    try { 
	         serverSocket = new ServerSocket(porta); 
	        } 
	    catch (IOException e) 
	        { 
	         System.err.println("Could not listen on port: "+ porta); 
	         System.exit(1); 
	        } 

	    Socket clientSocket = null; 
	    System.out.println ("Waiting for connection.....");

	    try { 
	         clientSocket = serverSocket.accept(); 
	        } 
	    catch (IOException e) 
	        { 
	         System.err.println("Accept failed."); 
	         System.exit(1); 
	        } 

	    System.out.println ("Connection successful");
	    System.out.println ("Waiting for input.....");
	    
	    // Leitura e Escrita de dados
	    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), 
	                                      true); 
	    BufferedReader in = new BufferedReader( 
	            new InputStreamReader( clientSocket.getInputStream())); 

	    String inputLine; 

	    while ((inputLine = in.readLine()) != null) 
	        { 
	    	// Mudar o diretório para testes em outro PC como servidor.
	    	String txt = lerArquivo("/home/victorandrade/workspace/Socket/"+inputLine+".txt");
	         System.out.println ("Server: " + txt); 
	         out.println(txt); 
	        } 

	    out.close(); 
	    in.close(); 
	    clientSocket.close(); 
	    serverSocket.close(); 
	   } 
	 
		
	
		
}
