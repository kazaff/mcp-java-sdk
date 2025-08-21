package io.modelcontextprotocol.spec;

/**
 * Default implementation of McpServerAuthenticator
 *
 * @author kazaff
 */
public class DefaultMcpServerAuthenticator implements McpServerAuthenticator {

	@Override
	public boolean authenticate(String token) {
		return true;
	}

	@Override
	public boolean authorize(String token, String toolId, String category) {
		return true;
	}

}
