package org.meridian.dto.request;

public class UserLoginRequestDTO {
    private String userName;
    private String password;

    public UserLoginRequestDTO(){}

    public UserLoginRequestDTO(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

    //Setters
    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(){
        this.password = password;
    }

    //Getters
    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

}
