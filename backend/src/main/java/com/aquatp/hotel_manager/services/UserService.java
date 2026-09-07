package com.aquatp.hotel_manager.services;

import com.aquatp.hotel_manager.converters.UserResponseDTO;
import com.aquatp.hotel_manager.entities.User;
import com.aquatp.hotel_manager.exceptions.UserNotFoundException;
import com.aquatp.hotel_manager.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository ur;

    public User find(long id) throws UserNotFoundException {
        Optional<User> optionalUser = ur.findById(id);

        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException("Couldn't find a user.");
        }

        return optionalUser.get();
    }

    public UserResponseDTO findById(Long id) {
        return new UserResponseDTO(find(id));
    }

    public UserResponseDTO createUser(User user) {

        User newUser = new User(
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getPassword()
        );
        newUser.setPassword(encodePassword(user.getPassword()));
        User savedUser = ur.save(newUser);

        return new UserResponseDTO(savedUser);
    }

    public UserResponseDTO editUser(User user) throws UserNotFoundException {

        User currentUser = find(user.getId());

        currentUser.setFirstName(user.getFirstName());
        currentUser.setLastName(user.getLastName());
        currentUser.setEmail(user.getEmail());
        currentUser.setPhoneNumber(user.getPhoneNumber());

        ur.save(currentUser);

        return new UserResponseDTO(currentUser);
    }

    public boolean deleteUser(long id) {
        User user = find(id);
        ur.delete(user);
        return true;
    }

    private String encodePassword(String password) {
        PasswordEncoder pe = new BCryptPasswordEncoder();
        return pe.encode(password);
    }

    @Autowired
    public void setUr(UserRepository ur) {
        this.ur = ur;
    }
}
