package github.com.hlx.kvservice.exception;

/**
 * @author Huang Lexin
 * @date 2023年03月02日 20:00
 */
public class KVServiceExpection extends RuntimeException {

	public KVServiceExpection(String message) {
		super(message);
	}
}
