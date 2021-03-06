package org.mokai.connector.jetty;

import java.util.HashMap;
import java.util.Map;

import net.gescobar.jmx.annotation.ManagedAttribute;

import org.mokai.ui.annotation.Label;

public class JettyConfiguration {

	@Label("Port")
	private int port = 9080;

	@Label("Context")
	private String context = "/";

	@Label("Use Basic Auth")
	private boolean useBasicAuth = false;

	@Label("Users")
	private Map<String,String> users = new HashMap<String,String>();

	@Label("Mapper")
	private Map<String,String> mapper = new HashMap<String,String>();

	@ManagedAttribute
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@ManagedAttribute
	public String getContext() {
		return context;
	}

	public void setContext(String context) {

		this.context = context;
	}

	@ManagedAttribute
	public boolean isUseBasicAuth() {
		return useBasicAuth;
	}

	public void setUseBasicAuth(boolean useBasicAuth) {
		this.useBasicAuth = useBasicAuth;
	}

	@ManagedAttribute
	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}

	public void addUser(String username, String password) {
		this.users.put(username, password);
	}

	@ManagedAttribute
	public Map<String, String> getMapper() {
		return mapper;
	}

	public void setMapper(Map<String, String> mapper) {
		this.mapper = mapper;
	}

}
