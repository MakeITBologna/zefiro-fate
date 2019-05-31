package it.makeit.alfresco.webscriptsapi;

import it.makeit.alfresco.restApi.RESTQueryParams;

public enum AlfrescoTaskInstanceQueryParamsEnum implements RESTQueryParams {

	AUTHORITY("authority");

	private String name;

	AlfrescoTaskInstanceQueryParamsEnum(String pName) {
		name = pName;
	}

	@Override
	public String getName() {
		return name;
	}
}
