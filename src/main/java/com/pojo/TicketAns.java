package com.pojo;

public class TicketAns {
	private String url;
	private String id;
	private String external_id;
	private String created_at;
	private String updated_at;
	private String subject;
	private String raw_subject;
	private String description;
	private String status;
	private String organization_id;
	private String requester_id;
	private String due_at;
	private String allow_channelback;
	private String forum_topic_id;
	private String has_incidents;
	private String type;
	private String recipient;
	private String submitter_id;
	private String assignee_id;
	private String is_public;
	private String priority;
	private String problem_id;
	private String brand_id;
	private String group_id;
	private String satisfaction_rating;

	// private List<String> followup_ids;
	// private List<String> sharing_agreement_ids;
	// private List<String> fields;
	// private List<String> custom_fields;
	// private List<String> tags;
	// private List<String> follower_ids;
	// private List<String> email_cc_ids;
	// private List<String> collaborator_ids;

	public String getDue_at() {
		return due_at;
	}

	public void setDue_at(String due_at) {
		this.due_at = due_at;
	}

	public String getAllow_channelback() {
		return allow_channelback;
	}

	public void setAllow_channelback(String allow_channelback) {
		this.allow_channelback = allow_channelback;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getForum_topic_id() {
		return forum_topic_id;
	}

	public void setForum_topic_id(String forum_topic_id) {
		this.forum_topic_id = forum_topic_id;
	}

	public String getHas_incidents() {
		return has_incidents;
	}

	public void setHas_incidents(String has_incidents) {
		this.has_incidents = has_incidents;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubmitter_id() {
		return submitter_id;
	}

	public void setSubmitter_id(String submitter_id) {
		this.submitter_id = submitter_id;
	}

	public String getAssignee_id() {
		return assignee_id;
	}

	public void setAssignee_id(String assignee_id) {
		this.assignee_id = assignee_id;
	}

	public String getIs_public() {
		return is_public;
	}

	public void setIs_public(String is_public) {
		this.is_public = is_public;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getExternal_id() {
		return external_id;
	}

	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	public String getProblem_id() {
		return problem_id;
	}

	public void setProblem_id(String problem_id) {
		this.problem_id = problem_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getSatisfaction_rating() {
		return satisfaction_rating;
	}

	public void setSatisfaction_rating(String satisfaction_rating) {
		this.satisfaction_rating = satisfaction_rating;
	}

	public String getRaw_subject() {
		return raw_subject;
	}

	public void setRaw_subject(String raw_subject) {
		this.raw_subject = raw_subject;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(String organization_id) {
		this.organization_id = organization_id;
	}

	public String getRequester_id() {
		return requester_id;
	}

	public void setRequester_id(String requester_id) {
		this.requester_id = requester_id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ticket [url=" + url + ", id=" + id + ", external_id=" + external_id + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", subject=" + subject + ", raw_subject=" + raw_subject
				+ ", description=" + description + ", status=" + status + ", organization_id=" + organization_id
				+ ", requester_id=" + requester_id + ", due_at=" + due_at + ", allow_channelback=" + allow_channelback
				+ ", forum_topic_id=" + forum_topic_id + ", has_incidents=" + has_incidents + ", type=" + type
				+ ", recipient=" + recipient + ", submitter_id=" + submitter_id + ", assignee_id=" + assignee_id
				+ ", is_public=" + is_public + ", priority=" + priority + ", problem_id=" + problem_id + ", brand_id="
				+ brand_id + ", group_id=" + group_id + ", satisfaction_rating=" + satisfaction_rating + "]";
	}

	// public List<String> getSharing_agreement_ids() {
	// return sharing_agreement_ids;
	// }
	//
	// public void setSharing_agreement_ids(List<String> sharing_agreement_ids) {
	// this.sharing_agreement_ids = sharing_agreement_ids;
	// }
	//
	// public List<String> getFields() {
	// return fields;
	// }
	//
	// public void setFields(List<String> fields) {
	// this.fields = fields;
	// }
	//
	// public List<String> getCustom_fields() {
	// return custom_fields;
	// }
	//
	// public void setCustom_fields(List<String> custom_fields) {
	// this.custom_fields = custom_fields;
	// }
	//
	// public List<String> getTags() {
	// return tags;
	// }
	//
	// public void setTags(List<String> tags) {
	// this.tags = tags;
	// }
	//
	// public List<String> getFollowup_ids() {
	// return followup_ids;
	// }
	//
	// public void setFollowup_ids(List<String> followup_ids) {
	// this.followup_ids = followup_ids;
	// }
	// public List<String> getEmail_cc_ids() {
	// return email_cc_ids;
	// }
	//
	// public void setEmail_cc_ids(List<String> email_cc_ids) {
	// this.email_cc_ids = email_cc_ids;
	// }
	//
	// public List<String> getCollaborator_ids() {
	// return collaborator_ids;
	// }
	//
	// public void setCollaborator_ids(List<String> collaborator_ids) {
	// this.collaborator_ids = collaborator_ids;
	// }
	//
	// public List<String> getFollower_ids() {
	// return follower_ids;
	// }
	//
	// public void setFollower_ids(List<String> follower_ids) {
	// this.follower_ids = follower_ids;
	// }

}
