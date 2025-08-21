package io.modelcontextprotocol.spec;

/**
 * @author kazaff
 */
public interface McpServerAuthenticator {

	/**
	 * @param token user's credential
	 * @return true if the token is valid, false otherwise
	 */
	boolean authenticate(String token);

	/**
	 * @param token user's credential
	 * @param toolId tool id
	 * @param category tool's category
	 * @return true if the token is valid and authorized, false otherwise
	 */
	boolean authorize(String token, String toolId, String category);

}
