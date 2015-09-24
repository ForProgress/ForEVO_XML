//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.02 at 01:50:36 PM CEST 
//


package fp.forevo.xml.settings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecentProjects" type="{Settings}xRecentProject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RecentProjectsCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RecentRootDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromptBeforeRemoveItem" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recentProjects"
})
@XmlRootElement(name = "xSettings")
public class XSettings {

    @XmlElement(name = "RecentProjects")
    protected List<XRecentProject> recentProjects;
    @XmlAttribute(name = "RecentProjectsCount")
    protected Integer recentProjectsCount;
    @XmlAttribute(name = "RecentRootDirectory")
    protected String recentRootDirectory;
    @XmlAttribute(name = "PromptBeforeRemoveItem")
    protected Boolean promptBeforeRemoveItem;

    /**
     * Gets the value of the recentProjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recentProjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecentProjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XRecentProject }
     * 
     * 
     */
    public List<XRecentProject> getRecentProjects() {
        if (recentProjects == null) {
            recentProjects = new ArrayList<XRecentProject>();
        }
        return this.recentProjects;
    }

    /**
     * Gets the value of the recentProjectsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecentProjectsCount() {
        return recentProjectsCount;
    }

    /**
     * Sets the value of the recentProjectsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecentProjectsCount(Integer value) {
        this.recentProjectsCount = value;
    }

    /**
     * Gets the value of the recentRootDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentRootDirectory() {
        return recentRootDirectory;
    }

    /**
     * Sets the value of the recentRootDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentRootDirectory(String value) {
        this.recentRootDirectory = value;
    }

    /**
     * Gets the value of the promptBeforeRemoveItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptBeforeRemoveItem() {
        return promptBeforeRemoveItem;
    }

    /**
     * Sets the value of the promptBeforeRemoveItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptBeforeRemoveItem(Boolean value) {
        this.promptBeforeRemoveItem = value;
    }

}
