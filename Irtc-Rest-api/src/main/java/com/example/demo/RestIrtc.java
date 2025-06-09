package com.example.demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestIrtc {
	
	@Autowired
	private TicketservImpl serv;
	@PostMapping("posting")
	public Ticket bookingTicket( @RequestBody Pasenger p)
	{
	
	Ticket tt=serv.bookTicket(p);
	return tt;
	}
	@GetMapping("get")
	public Collection<Ticket>getAllTicketss()
	{
		Collection<Ticket> gt=serv.getALLTickets();
							return gt;
	}
	

}
	


