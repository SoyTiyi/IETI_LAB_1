package edu.eci.project.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.project.data.User;
import edu.eci.project.dto.UserDto;
import edu.eci.project.service.UserService;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<?> all(){
        try {
            return new ResponseEntity<>(userService.all(),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<?> findById(@PathVariable AtomicInteger id){
        try {
            return new ResponseEntity<>(userService.findById(id),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto )
     {
          //TODO implement this method using UserService
         return null;
     }
}
