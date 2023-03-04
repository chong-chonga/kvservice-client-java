package github.com.hlx.kvservice.exception;


/**
 * {@link KVServiceStatus} in RuntimeException form
 * @author Huang Lexin
 * @date 2023年03月02日 20:00
 */
public class KVServiceStatusRuntimeException extends RuntimeException {
	public KVServiceStatusRuntimeException(KVServiceStatus status) {
		super(status.formatThrowableMessage(), status.getCause());
	}
}
