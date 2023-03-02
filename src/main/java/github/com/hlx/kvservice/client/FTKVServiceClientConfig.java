package github.com.hlx.kvservice.client;

import lombok.Data;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author Huang Lexin
 * @date 2023年03月02日 20:22
 */
@Data
public class FTKVServiceClientConfig {

	private String password;

	private String[] serverAddresses;

	private Duration duration;

	private boolean logEnabled;

	public FTKVServiceClientConfig(String password, String[] serverAddresses, Duration duration, boolean logEnabled) {
		this.password = password;
		this.serverAddresses = serverAddresses;
		this.duration = duration;
		this.logEnabled = logEnabled;
	}
}
