/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo2_crudapp_classes.classes;

import java.io.Serializable;
import java.util.Objects;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author Adrián García
 */


public class Wish implements Serializable{
    private static final long  serialVersionUID = 1L;
    
    /**
     * The id of wish
     */
    private Integer id;
    /**
     * The software in the wish
     */
    private final SimpleObjectProperty<Software> software;
    /**
     * Minimum price to be notified when software drops its price
     */
    private SimpleDoubleProperty minPrice;

    public Wish(){
        this.software = null;
    }
    public Wish(Integer id, Software software, Double minPrice) {
        this.id = id;
        this.software = new SimpleObjectProperty<Software>(software);
        this.minPrice = new SimpleDoubleProperty(minPrice);
    }
    public Wish(Software software, Double minPrice) {
        this.software = new SimpleObjectProperty<Software>(software);
        this.minPrice = new SimpleDoubleProperty(minPrice);
    }
    
    
    
    /**
     * 
     * @return the wish id
     */
    public Integer getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the software
     */
    public Software getSoftware() {
        return this.software.get();
    }

    /**
     * @param software the software to set
     */
    public void setSoftware(Software software) {
        this.software.set(software);
    }

    /**
     * @return the minPrice
     */
    public Double getMinPrice() {
        return this.minPrice.get();
    }

    /**
     * @param minPrice the minPrice to set
     */
    public void setMinPrice(Double minPrice) {
        this.minPrice.set(minPrice);
    }

    @Override
    public String toString() {
        return "Wish{" + "id=" + id + ", software=" + software + ", minPrice=" + minPrice + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.software);
        hash = 89 * hash + Objects.hashCode(this.minPrice);
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
        final Wish other = (Wish) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.software, other.software)) {
            return false;
        }
        if (!Objects.equals(this.minPrice, other.minPrice)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
