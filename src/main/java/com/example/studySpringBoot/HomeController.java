package com.example.studySpringBoot;

import Model.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
    //Ticket ticket = new Ticket(1, "Phim A", 200 );

    @GetMapping("/ticket")
    public ResponseEntity<Ticket> showTicket(@RequestParam(value = "id1") int id,
                                     @RequestParam(value = "name") String name,
                                     @RequestParam(value = "price") int price){
        Ticket ticket = new Ticket(id, name, price);


        return  ResponseEntity.ok(ticket);
    }
}
