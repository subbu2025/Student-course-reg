package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TicketservImpl implements TicketServ {

    Map<Integer, Ticket> db = new HashMap<>();

    @Override
    public Ticket bookTicket(Pasenger p) {
        Ticket t = new Ticket();
        Random r = new Random();
        int id = r.nextInt(5); 

        t.setNum(id);
        BeanUtils.copyProperties(p, t);

        t.setStatus("Confirmed");
        db.put(id, t);
        return t;
    }

    @Override
    public Collection<Ticket> getALLTickets() {
        return db.values();
    }
}
