package it.makeit.alfresco.workflow.model;

import java.util.Date;
import java.util.List;

/**
 * A running Task.
 * @author Giulio Pellitta (javadoc)
 *
 */
public class Task {

	private String id;
	private String processId;
	private String processDefinitionId;
	private String activityDefinitionId;
	private String name;
	private String description;
	private Date dueAt;
	private Date startedAt;
	private Date endedAt;
	private String durationInMs;
	private String priority;
	private String owner;
	private String assignee;
	private String formResourceKey;
	private String state;
	private List<Variable> variables;

	public enum TaskStatus {
		
		/**
		 * @author Giulio Pellitta
		 * @see {@link https://api-explorer.alfresco.com/api-explorer/} and {@link https://docs.alfresco.com/5.2/tasks/more-menu-mytasks-edit.html}.
		 */
		
		COMPLETED("completed"),
		CLAIMED("claimed"),
		DELEGATED("delegated"),
		RESOLVED("resolved");
		
		private String taskStatus;

		TaskStatus(String taskStatus) {
			this.taskStatus=taskStatus;
		}
		
		public String getTaskStatus() {
			return this.taskStatus;
		}
	}
	
	/**
	 * @return Id of this task.
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return Id of the process the task belongs to.
	 */
	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	/**
	 * @return Type of process this task is part of (e.g. "invioFattureAttiveBis:1:104").
	 */
	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getActivityDefinitionId() {
		return activityDefinitionId;
	}

	public void setActivityDefinitionId(String activityDefinitionId) {
		this.activityDefinitionId = activityDefinitionId;
	}

	/**
	 * @return Type of task (e.g. "Approve Invoice Task")
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueAt() {
		return dueAt;
	}

	public void setDueAt(Date dueAt) {
		this.dueAt = dueAt;
	}

	public Date getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(Date startedAt) {
		this.startedAt = startedAt;
	}

	public Date getEndedAt() {
		return endedAt;
	}

	public void setEndedAt(Date endedAt) {
		this.endedAt = endedAt;
	}

	public String getDurationInMs() {
		return durationInMs;
	}

	public void setDurationInMs(String durationInMs) {
		this.durationInMs = durationInMs;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getFormResourceKey() {
		return formResourceKey;
	}

	public void setFormResourceKey(String formResourceKey) {
		this.formResourceKey = formResourceKey;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Variable> getVariables() {
		return variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}
}
