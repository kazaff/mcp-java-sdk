package io.modelcontextprotocol.spec;

/**
 * @author kazaff
 */
public class DefaultToolFilter implements ToolFilter {

	@Override
	public boolean accept(String toolName, String token, McpServerAuthenticator authenticator) {
		return true;
	}

}
