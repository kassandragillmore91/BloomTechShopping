package com.bloomshoppingcomplex.Models.Request;

import java.util.Objects;

public class CreateAccountRequest {
    private String userId;
    //private List<String> favorites;
    private String username;
    private String password;
    private String email;

    public CreateAccountRequest(String userId, String username, String password, String email) {
        this.userId = userId;
<<<<<<< HEAD
        this.name = name;
=======
        //this.favorites = favorites;
        this.username = username;
        this.password = password;
>>>>>>> a9d66749d7ed2e2574cfc99cf48c4bdb806bed2f
        this.email = email;
    }

    public CreateAccountRequest() {}

    public CreateAccountRequest(Builder builder) {
<<<<<<< HEAD
        this.userId = builder.userId;
        this.name = builder.name;
=======
        this.userId = builder().userId;
        this.username = builder.username;
        this.password = builder.password;
>>>>>>> a9d66749d7ed2e2574cfc99cf48c4bdb806bed2f
        this.email = builder.email;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

<<<<<<< HEAD
    public String getName() {
        return name;
=======

//    public List<String> getFavorites() {
//        return favorites;
//    }

//    public void setFavorites(List<String> favorites) {
//        this.favorites = favorites;
//    }

    public String getUsername() {
        return username;
>>>>>>> a9d66749d7ed2e2574cfc99cf48c4bdb806bed2f
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateAccountRequest)) return false;
        CreateAccountRequest that = (CreateAccountRequest) o;
        return Objects.equals(getUserId(), that.getUserId()) && Objects.equals(getUsername(), that.getUsername()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUsername(), getPassword(), getEmail());
    }

    @Override
    public String toString() {
        return "CreateAccountRequest{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String userId;
        private String username;
        private String password;
        private String email;

        private Builder() {

        }

        public Builder withUserId(String userIdToUse) {
            this.userId = userIdToUse;
            return this;
        }

        public Builder withUsername(String usernameToUse) {
            this.username = usernameToUse;
            return this;
        }

        public Builder withPassword(String passwordToUse) {
            this.password = passwordToUse;
            return this;
        }

        public Builder withEmail(String emailToUse) {
            this.email = emailToUse;
            return this;
        }

        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        }
    }
}