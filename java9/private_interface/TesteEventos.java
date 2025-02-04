package private_interface;

public class TesteEventos {
	
	public static void main(String[] args) {
		
		LogEventInterface log = new LogEventInterface() {
		};
		
		log.logInfo("Server port 8080");
		log.logWarn("Recurso depreciado");
		log.logError("Valor inválido!");
		log.logFatal("Falha de Conexão!");
		
	}
	
}
