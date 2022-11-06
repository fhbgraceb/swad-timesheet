package com.swad.timesheet.timesheet_db.service.mapper;


import com.swad.timesheet.timesheet_db.entity.User;
import dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper <User, UserDto> {


    @Override
    public UserDto mapToDto(User user) {
        return UserDto.builder()
                .uid(user.getUid())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }

    @Override
    public User mapToEntity(UserDto userDto) {
        return User.builder()
                .uid(userDto.getUid())
                .username(userDto.getUsername())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .build();
    }
}
