package com.pojo;

import java.io.Serializable;

public class CreateTicket implements Serializable {
	private static final long serialVersionUID = 11L;

	private TicketRespond ticket;

	public TicketRespond getTicket() {
		return ticket;
	}

	public void setTicket(TicketRespond ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "ClassPojo [ticket = " + ticket + "]";
	}
}
