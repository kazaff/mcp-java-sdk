package io.modelcontextprotocol.spec;

/**
 * @author kazaff
 */
public interface ToolFilter {

	/**
	 * Determines whether a tool should be accepted or not.
	 * @param toolName the name of the tool
	 * @param token the user's credentials
	 * @param authenticator the authenticator
	 * @return true if the tool should be accepted, false otherwise
	 */
	boolean accept(String toolName, String token, McpServerAuthenticator authenticator);

}
