/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo2_crudapp_classes.classes;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents a shop
 * @author Diego Corral
 */
@XmlRootElement
public class Shop implements Serializable{
    
    private static final long serialVersionUID = 1L;

    /**
     * ID of the shop.
     */
    private final SimpleIntegerProperty shopId;

    /**
     * Name of the shop.
     */
    private final SimpleStringProperty name;

    /**
     * URL of the shop.
     */
    private final SimpleStringProperty url;

    /**
     * Image or logo of the shop.
     */
    private byte[] image;
    
    
    public Shop(Integer shopId, String name, String url){
        this.shopId = new SimpleIntegerProperty(shopId);
        this.name = new SimpleStringProperty(name);
        this.url = new SimpleStringProperty(url);
    }
    
    /**
     * @return the shopId
     */
    public Integer getShopId() {
        return this.shopId.get();
    }

    /**
     * @param shopId the shopId to set
     */
    public void setShopId(Integer shopId) {
        this.shopId.set(shopId);
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name.get();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name.set(name);
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.shopId);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.url);
        hash = 83 * hash + Arrays.hashCode(this.image);
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
        final Shop other = (Shop) obj;
        if (!Objects.equals(this.shopId, other.shopId)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Shop{" + "shopId=" + shopId + ", name=" + name + ", url=" + url + ", image=" + image + '}';
    }
    
    
    
}
