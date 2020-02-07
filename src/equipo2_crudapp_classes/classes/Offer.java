/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo2_crudapp_classes.classes;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents an offer
 *
 * @author Diego Corral
 */
@XmlRootElement
public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID of the offer.
     */
    private Integer offerId;

    /**
     * URL of the offer.
     */
    private String url;

    /**
     * Date of expiration for the offer.
     */
    private Date expiringDate;

    /**
     * Base price of the offer.
     */
    private Double basePrice;

    /**
     * Discounted price of the offer.
     */
    private Double dicountedPrice;

    /**
     * Percentage of discount of the offer.
     */
    private Integer discount;

    /**
     * Shop providing the offer.
     */
    private Shop shop;

    /**
     * Set of comments of the offer.
     */
    private Set<Comment> comments;

    /**
     * The user that has created the offer
     */
    private User user;
    
    /**
     * @return the offerId
     */
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * @param offerId the offerId to set
     */
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the expiringDate
     */
    public Date getExpiringDate() {
        return expiringDate;
    }

    /**
     * @param expiringDate the expiringDate to set
     */
    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }

    /**
     * @return the basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return the dicountedPrice
     */
    public Double getDicountedPrice() {
        return dicountedPrice;
    }

    /**
     * @param dicountedPrice the dicountedPrice to set
     */
    public void setDicountedPrice(Double dicountedPrice) {
        this.dicountedPrice = dicountedPrice;
    }

    /**
     * @return the discount
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * @return the shop
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param shop the shop to set
     */
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    /**
     * @return the comments
     */
    public Set<Comment> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
    
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.offerId);
        hash = 29 * hash + Objects.hashCode(this.url);
        hash = 29 * hash + Objects.hashCode(this.expiringDate);
        hash = 29 * hash + Objects.hashCode(this.basePrice);
        hash = 29 * hash + Objects.hashCode(this.dicountedPrice);
        hash = 29 * hash + Objects.hashCode(this.discount);
        hash = 29 * hash + Objects.hashCode(this.shop);
        hash = 29 * hash + Objects.hashCode(this.comments);
        hash = 29 * hash + Objects.hashCode(this.user);
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
        final Offer other = (Offer) obj;
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.offerId, other.offerId)) {
            return false;
        }
        if (!Objects.equals(this.expiringDate, other.expiringDate)) {
            return false;
        }
        if (!Objects.equals(this.basePrice, other.basePrice)) {
            return false;
        }
        if (!Objects.equals(this.dicountedPrice, other.dicountedPrice)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        if (!Objects.equals(this.shop, other.shop)) {
            return false;
        }
        if (!Objects.equals(this.comments, other.comments)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Offer{" + "offerId=" + offerId + ", url=" + url + ", expiringDate=" + expiringDate + ", basePrice=" + basePrice + ", dicountedPrice=" + dicountedPrice + ", discount=" + discount + ", shop=" + shop + ", comments=" + comments + ", user=" + user + '}';
    }
}
