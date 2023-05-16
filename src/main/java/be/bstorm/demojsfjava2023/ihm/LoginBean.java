package be.bstorm.demojsfjava2023.ihm;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@Named // loginBean
@SessionScoped
public class LoginBean implements Serializable {

    private String login;

    private String email;

    private String password;

    public String returnAction(){

        return this.password.equals("toto") ? "success" : "failure";
    }
}
