package it.makeit.alfresco.webscriptsapi;

import it.makeit.alfresco.restApi.RESTQueryParams;

/**
 * List of query params accepted for rest-full api for retrive workflow
 * instance: /alfresco/service/api/workflow-instances
 *
 * @author Alba Quarto
 *
 */
public enum AlfrescoWorkflowInstanceQueryParamsEnum implements RESTQueryParams {
	INITIATOR("initiator"), INCLUDE_TASKS("includeTasks"), STATE("state"), COMPLETED_BEFORE(
			"completedBefore"), COMPLETED_AFTER("completedAfter");

	private String name;

	AlfrescoWorkflowInstanceQueryParamsEnum(String pName) {
		name = pName;
	}

	@Override
	public String getName() {
		return name;
	}
}
