package github.com.hlx.kvservice.exception;

import com.google.common.base.Objects;

import javax.annotation.Nullable;
import java.util.List;
import java.util.TreeMap;

/**
 * Used for indicating the status of the request for FTKV service.
 * When an error occurs in the request, a
 * {@link KVServiceStatusRuntimeException}。
 * @author Huang Lexin
 * @date 2023年03月04日 23:09
 */
public class KVServiceStatus {
	public enum Code {
		/**
		 * The password provided by the client is incorrect.
		 */
		INVALID_PASSWORD(0),

		/**
		 * Client specified an invalid request type for the given operation.
		 */
		INVALID_REQUEST_TYPE(1),

		/**
		 * Leader processes request timeout.
		 * Server may or may not have executed the request.
		 */
		TIMEOUT(2),

		/**
		 * The KVService is currently unavailable.
		 * This may be caused by the inability to connect to the server or the current absence of a leader.
		 */
		UNAVAILABLE(3);

		private final int value;

		Code(int value) {
			this.value = value;
		}

		public int value() {
			return value;
		}

		/**
		 * Returns a {@link KVServiceStatus} object corresponding to this status code.
		 */
		public KVServiceStatus toStatus() {
			return KV_SERVICE_STATUS_LIST.get(value);
		}


	}

	private static final List<KVServiceStatus> KV_SERVICE_STATUS_LIST = buildStatusList();

	private static List<KVServiceStatus> buildStatusList() {
		TreeMap<Integer, KVServiceStatus> map = new TreeMap<>();
		for (Code code : Code.values()) {
			KVServiceStatus replaced = map.put(code.value(), new KVServiceStatus(code));
			if (replaced != null) {
				throw new IllegalStateException("Code value duplicate between" + code.name() + "&" + replaced.getCode().name());
			}
		}
		return List.copyOf(map.values());
	}


	public static final KVServiceStatus PASSWORD_WRONG = Code.INVALID_PASSWORD.toStatus();

	public static final KVServiceStatus INVALID_ARGUMENT = Code.INVALID_REQUEST_TYPE.toStatus();

	public static final KVServiceStatus TIMEOUT = Code.TIMEOUT.toStatus();

	public static final KVServiceStatus UNAVAILABLE = Code.UNAVAILABLE.toStatus();

	private final Code code;

	private final String description;

	private final Throwable cause;


	private KVServiceStatus(Code code) {
		this(code, null, null);
	}

	private KVServiceStatus(Code code, @Nullable String description, @Nullable Throwable cause) {
		this.code = code;
		this.description = description;
		this.cause = cause;
	}

	public KVServiceStatus withCause(Throwable cause) {
		if (Objects.equal(this.cause, cause)) {
			return this;
		}
		return new KVServiceStatus(this.code, this.description, cause);
	}

	/**
	 * Create a derived instance of {@link KVServiceStatus} with the given description.  Leading and trailing
	 * whitespace may be removed; this may change in the future.
	 */
	public KVServiceStatus withDescription(String description) {
		if (Objects.equal(this.description, description)) {
			return this;
		}
		return new KVServiceStatus(this.code, description, this.cause);
	}

	public Code getCode() {
		return code;
	}

	public Throwable getCause() {
		return cause;
	}

	public String formatThrowableMessage() {
		if (description == null) {
			return code.toString();
		} else {
			return code + ": " + description;
		}
	}
}
