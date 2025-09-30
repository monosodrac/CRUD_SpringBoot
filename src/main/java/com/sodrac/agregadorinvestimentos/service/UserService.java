package com.sodrac.agregadorinvestimentos.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sodrac.agregadorinvestimentos.controller.CreateUserDto;
import com.sodrac.agregadorinvestimentos.controller.UpdateUserDto;
import com.sodrac.agregadorinvestimentos.entity.User;
import com.sodrac.agregadorinvestimentos.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto) {

        //DTO -> Entity
        var entity = new User(
            null,
            createUserDto.username(),
            createUserDto.email(),
            createUserDto.password(),
            null,
            null);

        var userSaved = userRepository.save(entity);

        return userSaved.getUserID();
    }

    public Optional<User> getUserById(String userId) {
        return userRepository.findById(UUID.fromString(userId));
    }

    public List<User> ListUsers() {
        return userRepository.findAll();
    }

    public void updateUserById(String userId, UpdateUserDto updateUserDto) {
        var id = UUID.fromString(userId);

        var userEntity = userRepository.findById(id);

        if (userEntity.isPresent()) {
            var user = userEntity.get();

            if (updateUserDto.username() != null) {
                user.setUsername(updateUserDto.username());
            }

            if (updateUserDto.password() != null) {
                user.setPassword(updateUserDto.password());
            }

            userRepository.save(user);
        }
    }

    public void deleteById(String userId) {
        var id = UUID.fromString(userId);

        var userExists = userRepository.existsById(id);
        
        if (userExists) {
            userRepository.deleteById(id);
        }
    }
}
