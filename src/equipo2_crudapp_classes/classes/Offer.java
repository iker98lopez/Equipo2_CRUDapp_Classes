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
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents an offer
 * @author Diego Corral
 */
@XmlRootElement
public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID of the offer.
     */
    private SimpleIntegerProperty offerId;

    /**
     * URL of the offer.
     */
    private SimpleStringProperty url;

    /**
     * Date of expiration for the offer.
     */
    private SimpleObjectProperty<Date> expiringDate;

    /**
     * Base price of the offer.
     */
    private SimpleDoubleProperty basePrice;

    /**
     * Discounted price of the offer.
     */
    private SimpleDoubleProperty dicountedPrice;

    /**
     * Percentage of discount of the offer.
     */
    private SimpleIntegerProperty discount;

    /**
     * Shop providing the offer.
     */
    private SimpleObjectProperty<Shop> shop;

    /**
     * Set of comments of the offer.
     */
    private Set<Comment> comments;

    /**
     * @return the offerId
     */
    public Integer getOfferId() {
        return this.offerId.get();
    }

    /**
     * @param offerId the offerId to set
     */
    public void setOfferId(Integer offerId) {
        this.offerId.set(offerId);
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return this.url.get();
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url.set(url);
    }

    /**
     * @return the expiringDate
     */
    public Date getExpiringDate() {
        return expiringDate.get();
    }

    /**
     * @param expiringDate the expiringDate to set
     */
    public void setExpiringDate(Date expiringDate) {
        this.expiringDate.set(expiringDate);
    }

    /**
     * @return the basePrice
     */
    public Double getBasePrice() {
        return this.basePrice.get();
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice.set(basePrice);
    }

    /**
     * @return the dicountedPrice
     */
    public Double getDicountedPrice() {
        return this.dicountedPrice.get();
    }

    /**
     * @param dicountedPrice the dicountedPrice to set
     */
    public void setDicountedPrice(Double dicountedPrice) {
        this.dicountedPrice.set(dicountedPrice);
    }

    /**
     * @return the discount
     */
    public Integer getDiscount() {
        return this.discount.get();
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Integer discount) {
        this.discount.set(discount);
    }

    /**
     * @return the shop
     */
    public Shop getShop() {
        return this.shop.get();
    }

    /**
     * @param shop the shop to set
     */
    public void setShop(Shop shop) {
        this.shop.set(shop);
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.offerId);
        hash = 19 * hash + Objects.hashCode(this.url);
        hash = 19 * hash + Objects.hashCode(this.expiringDate);
        hash = 19 * hash + Objects.hashCode(this.basePrice);
        hash = 19 * hash + Objects.hashCode(this.dicountedPrice);
        hash = 19 * hash + Objects.hashCode(this.discount);
        hash = 19 * hash + Objects.hashCode(this.shop);
        hash = 19 * hash + Objects.hashCode(this.comments);
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
        if (!Objects.equals(this.offerId, other.offerId)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
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
        return true;
    }
    
    @Override
    public String toString() {
        return "Offer{" + "offerId=" + offerId + ", url=" + url + ", expiringDate=" + expiringDate + ", basePrice=" + basePrice + ", dicountedPrice=" + dicountedPrice + ", discount=" + discount + ", shop=" + shop + ", comments=" + comments + '}';
    }
    
}
