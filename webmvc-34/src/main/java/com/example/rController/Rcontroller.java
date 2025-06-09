package com.example.rController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.tclass.R204;  // Assuming R204 is your room class

import com.example.Serviceintrf.RoomService;

@Controller
@RequestMapping("/rooms")
public class Rcontroller {

    // Constructor for logging instantiation
    public Rcontroller() {
        System.out.println("This is the controller class");
    }

    // Autowiring the RoomService to get data
    @Autowired
    private RoomService roomService;

    // Handling the GET request to '/rooms/dis'
    @GetMapping("/dis")
    public ModelAndView getRoomDetails() {
        // Create ModelAndView to handle the model and the view
        ModelAndView modelAndView = new ModelAndView();
        
        // Fetching all room details via the service layer
        List<R204> roomList = roomService.getAllDet();
        
        // Adding the list of rooms to the model
        modelAndView.addObject("rooms", roomList);
        
        // Setting the view name to render the data (Make sure 'srk' view exists)
        modelAndView.setViewName("srk");
        
        // Return the populated ModelAndView
        return modelAndView;
    }
}
