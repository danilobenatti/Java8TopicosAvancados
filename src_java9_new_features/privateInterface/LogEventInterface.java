package privateInterface;

public interface LogEventInterface {
	
	default void logInfo(String message) {
		log(message, "INFO");
	}
	
	default void logWarn(String message) {
		log(message, "WARN");
	}
	
	default void logError(String message) {
		log(message, "ERROR");
	}
	
	default void logFatal(String message) {
		log(message, "FATAL");
	}
	
	// New feature Java 9
	private void log(String message, String type) {
		System.out.println("Início da mensagem.");
		System.out.println(type + ": " + message);
		System.out.printf("Fim da mensagem.%n%n");
	}
}
