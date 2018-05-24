package com.pojo;

public class Ticket {
	private TicketDraft ticket;

	public Ticket(String subject, String comment){
		this.ticket = new TicketDraft(subject, comment);
	}
	
	public TicketDraft getTicket() {
		return ticket;
	}

	public void setTicket(TicketDraft ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "ClassPojo [ticket = " + ticket + "]";
	}
}

class TicketDraft {
	private String subject;
	private Comment comment;

	public TicketDraft(String subject, String comment) {
		this.subject = subject;
		this.comment = new Comment(comment);
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ClassPojo [subject = " + subject + ", comment = " + comment + "]";
	}
}

class Comment {

	private String body;

	public Comment(String body) {
		this.body = body;
	}
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "ClassPojo [body = " + body + "]";
	}
}