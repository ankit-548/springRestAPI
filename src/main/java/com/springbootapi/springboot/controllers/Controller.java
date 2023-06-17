package com.springbootapi.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapi.springboot.entities.Load;
import com.springbootapi.springboot.services.LoadService;

@RestController
public class Controller {
    @Autowired
    private LoadService loadService;
     
    @GetMapping("/home")
    public String home() {
        return "Welcome to homepage";
    }
    @GetMapping("/load")
    public List<Load> getLoads() {
        return loadService.getLoads();
    }

     @GetMapping("/load/{shipperId}")
    public Load GetLoad(@PathVariable String shipperId) {
        return this.loadService.getLoad(Long.parseLong(shipperId));
    }

    @PostMapping("/load")
    public Load addLoad(@RequestBody Load load) {
        return this.loadService.addLoad(load);
    }
     @PutMapping("/load") 
    public Load updataLoad(@RequestBody Load load) {
        return this.loadService.updateLoad(load);
    }
    @DeleteMapping("/load/{shipperId}")
    public ResponseEntity<HttpStatus> deletLoad(@PathVariable String shipperId) {
        try {
            this.loadService.deletLoad(Long.parseLong(shipperId));            
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
