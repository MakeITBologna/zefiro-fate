package it.makeit.alfresco.publicapi.model;

import com.google.api.client.util.Key;

public class Group extends Entry {

	@Key
	private boolean isRoot;

	@Key
	private String id;

	public boolean isRoot() {
		return isRoot;
	}

	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


}
