package dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class UserDto {
    private int uid;
    private String username;
    private String firstname;
    private String lastname;
    private String email;



}
