package com.heroku.spacey.dto.user;

import com.heroku.spacey.utils.EmailConstraint;
import com.heroku.spacey.utils.PasswordConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRegisterDto {

    @EmailConstraint
    private String email;
    @PasswordConstraint
    private String password;

    private String name;
    private String surname;

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
