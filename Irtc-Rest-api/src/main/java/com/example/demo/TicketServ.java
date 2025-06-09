package com.example.demo;

import java.util.Collection;

public interface TicketServ {
	
	public Ticket bookTicket(Pasenger p);
	
	public Collection<Ticket>  getALLTickets();

}
