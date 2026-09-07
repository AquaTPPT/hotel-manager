package com.aquatp.hotel_manager.controllers;

import com.aquatp.hotel_manager.converters.UserResponseDTO;
import com.aquatp.hotel_manager.entities.User;
import com.aquatp.hotel_manager.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel_manager/user")
public class UserController {


    private UserService us;

    @PostMapping("/new")
    public ResponseEntity<UserResponseDTO> addUser(@RequestBody User newUser) {
        try {
            UserResponseDTO urd = us.createUser(newUser);
            return new ResponseEntity<>(urd, HttpStatus.OK);
        } catch (RuntimeException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(us.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeUser(@PathVariable Long id) {
        return new ResponseEntity<>(us.deleteUser(id), HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<UserResponseDTO> editUser(@RequestBody User user) {
        return new ResponseEntity<>(us.editUser(user), HttpStatus.OK);
    }
}
