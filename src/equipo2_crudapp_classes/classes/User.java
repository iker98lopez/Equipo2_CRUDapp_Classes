/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo2_crudapp_classes.classes;

import equipo2_crudapp_classes.enumerators.UserPrivilege;
import equipo2_crudapp_classes.enumerators.UserStatus;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents an user
 * @author Diego Corral
 */
@XmlRootElement
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;

    /**
     * The user id
     */
    private Integer userId;

    /**
     * The login of the user
     */
    private String login;

    /**
     * The password of the user account
     */
    private String password;

    /**
     * The full name of the user
     */
    private String fullName;

    /**
     * The email of the user
     */
    private String email;

    /**
     * The date of the las password change
     */
    private Date lastPasswordChange;

    /**
     * The last time the user logged in
     */
    private Date lastLogin;

    /**
     * The privilege of the user. It can be USER or ADMIN
     */
    private UserPrivilege privilege;

    /**
     * The user status. It can be ENABLED or DISABLED
     */
    private UserStatus status;

    /**
     * Profile image of the user
     */
    private byte[] image;

    /**
     * A set with all the wishes of the user
     */
    private Set<Wish> wishList;

    /**
     * A list with all the comments of the user
     */
    private List<Comment> comments;

    /**
     * A list with all the offers of the user
     */
    private List<Offer> offers;
    
    /**
     * No-args constructor
     */
    public User() {
        
    }
    
    /**
     * Constructor with some basic information
     * @param login
     * @param password
     * @param fullName
     * @param email 
     */
    public User(String login, String password, String fullName, String email) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
    }
    
    
    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the lastPasswordChange
     */
    public Date getLastPasswordChange() {
        return lastPasswordChange;
    }

    /**
     * @param lastPasswordChange the lastPasswordChange to set
     */
    public void setLastPasswordChange(Date lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    /**
     * @return the lastLogin
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return the privilege
     */
    public UserPrivilege getPrivilege() {
        return privilege;
    }

    /**
     * @param privilege the privilege to set
     */
    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    /**
     * @return the status
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * @return the image
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(byte[] image) {
        this.image = image;
    }

    /**
     * @return the wishList
     */
    public Set<Wish> getWishList() {
        return wishList;
    }

    /**
     * @param wishList the wishList to set
     */
    public void setWishList(Set<Wish> wishList) {
        this.wishList = wishList;
    }

    /**
     * @return a list with the comments
     */
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    /**
     * @return a list with all the offers
     */
    public List<Offer> getOffers() {
        return offers;
    }

    /**
     * @param offers the offers to set
     */
    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.userId);
        hash = 79 * hash + Objects.hashCode(this.login);
        hash = 79 * hash + Objects.hashCode(this.password);
        hash = 79 * hash + Objects.hashCode(this.fullName);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.lastPasswordChange);
        hash = 79 * hash + Objects.hashCode(this.lastLogin);
        hash = 79 * hash + Objects.hashCode(this.privilege);
        hash = 79 * hash + Objects.hashCode(this.status);
        hash = 79 * hash + Arrays.hashCode(this.image);
        hash = 79 * hash + Objects.hashCode(this.wishList);
        hash = 79 * hash + Objects.hashCode(this.comments);
        hash = 79 * hash + Objects.hashCode(this.offers);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        if (!Objects.equals(this.lastPasswordChange, other.lastPasswordChange)) {
            return false;
        }
        if (!Objects.equals(this.lastLogin, other.lastLogin)) {
            return false;
        }
        if (this.privilege != other.privilege) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.wishList, other.wishList)) {
            return false;
        }
        if (!Objects.equals(this.comments, other.comments)) {
            return false;
        }
        if (!Objects.equals(this.offers, other.offers)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", login=" + login + ", password=" + password + ", fullName=" + fullName + ", email=" + email + ", lastPasswordChange=" + lastPasswordChange + ", lastLogin=" + lastLogin + ", privilege=" + privilege + ", status=" + status + ", image=" + image + ", wishList=" + wishList + ", comments=" + comments + ", offers=" + offers + '}';
    }
    
    
    
}
