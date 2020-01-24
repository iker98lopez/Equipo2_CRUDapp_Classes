/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo2_crudapp_classes.classes;

import equipo2_crudapp_classes.enumerators.SoftwareType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity for Software.
 *
 * @author iker lopez carrillo
 */
@XmlRootElement
public class Software implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID for the software.
     */
    private Integer softwareId;

    /**
     * Name of the software.
     */
    private final SimpleStringProperty name;

    /**
     * Publisher of the software.
     */
    private String publisher;

    /**
     * Description of the software.
     */
    private String description;

    /**
     * Release date of the software
     */
    private Date releaseDate;

    /**
     * Type of the software. It can be PROGRAM, GAME or EXTENSION
     */

    private SoftwareType softwareType;

    /**
     * List with the offers of the software.
     */
    private List<Offer> offers;

    /**
     * Parent software. This attribute is only needed when the SoftwareType is
     * EXTENSION and it refers to the software extended by this one.
     */
    private Software parentSoftware;

    public Software() {
        this.name = null;
    }
    
    public Software(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public Software(Integer softwareId, String name, String publisher, String description, Date releaseDate, SoftwareType softwareType, List<Offer> offers, Software parentSoftware) {
        this.softwareId = softwareId;
        this.name = new SimpleStringProperty(name);
        this.publisher = publisher;
        this.description = description;
        this.releaseDate = releaseDate;
        this.softwareType = softwareType;
        this.offers = offers;
        this.parentSoftware = parentSoftware;
    }
    
    

    
    /**
     * @return the softwareId
     */
    public Integer getSoftwareId() {
        return softwareId;
    }

    /**
     * @param softwareId the softwareId to set
     */
    public void setSoftwareId(Integer softwareId) {
        this.softwareId = softwareId;
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
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the releaseDate
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the softwareType
     */
    public SoftwareType getSoftwareType() {
        return softwareType;
    }

    /**
     * @param softwareType the softwareType to set
     */
    public void setSoftwareType(SoftwareType softwareType) {
        this.softwareType = softwareType;
    }

    /**
     * @return the offers
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

    /**
     * @return the parentSoftware
     */
    public Software getParentSoftware() {
        return parentSoftware;
    }

    /**
     * @param parentSoftware the parentSoftware to set
     */
    public void setParentSoftware(Software parentSoftware) {
        this.parentSoftware = parentSoftware;
    }

    @Override
    public String toString() {
        return "Software{" + "softwareId=" + softwareId + ", name=" + name + ", publisher=" + publisher + ", description=" + description + ", releaseDate=" + releaseDate + ", softwareType=" + softwareType + ", offers=" + offers + ", parentSoftware=" + parentSoftware + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.softwareId);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.publisher);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.releaseDate);
        hash = 97 * hash + Objects.hashCode(this.softwareType);
        hash = 97 * hash + Objects.hashCode(this.offers);
        hash = 97 * hash + Objects.hashCode(this.parentSoftware);
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
        final Software other = (Software) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.publisher, other.publisher)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.softwareId, other.softwareId)) {
            return false;
        }
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        if (this.softwareType != other.softwareType) {
            return false;
        }
        if (!Objects.equals(this.offers, other.offers)) {
            return false;
        }
        if (!Objects.equals(this.parentSoftware, other.parentSoftware)) {
            return false;
        }
        return true;
    }
    
    /**
     * Get name property as StringProperty
     */
    public SimpleStringProperty getNameProperty () {
        return name;
    }
    
}
