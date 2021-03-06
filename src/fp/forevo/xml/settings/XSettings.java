//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.11 at 10:14:19 AM CET 
//


package fp.forevo.xml.settings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="recentProjects" type="{Settings}xRecentProject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="recentProjectsCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="recentRootDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="promptBeforeRemoveItem" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="askForImageFileName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="windowLeft" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="windowTop" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="windowWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="windowHeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="verticalSashLimit" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="verticalSashPercent" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="horizontalSashLimit" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="horizontalSashPercent" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="delayBeforeCapture" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="defaultParentClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="robotFrameworkIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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

    protected List<XRecentProject> recentProjects;
    @XmlAttribute(name = "recentProjectsCount")
    protected Integer recentProjectsCount;
    @XmlAttribute(name = "recentRootDirectory")
    protected String recentRootDirectory;
    @XmlAttribute(name = "promptBeforeRemoveItem")
    protected Boolean promptBeforeRemoveItem;
    @XmlAttribute(name = "askForImageFileName")
    protected Boolean askForImageFileName;
    @XmlAttribute(name = "windowLeft")
    protected Integer windowLeft;
    @XmlAttribute(name = "windowTop")
    protected Integer windowTop;
    @XmlAttribute(name = "windowWidth")
    protected Integer windowWidth;
    @XmlAttribute(name = "windowHeight")
    protected Integer windowHeight;
    @XmlAttribute(name = "verticalSashLimit")
    protected Integer verticalSashLimit;
    @XmlAttribute(name = "verticalSashPercent")
    protected Integer verticalSashPercent;
    @XmlAttribute(name = "horizontalSashLimit")
    protected Integer horizontalSashLimit;
    @XmlAttribute(name = "horizontalSashPercent")
    protected Integer horizontalSashPercent;
    @XmlAttribute(name = "delayBeforeCapture")
    protected Integer delayBeforeCapture;
    @XmlAttribute(name = "defaultParentClass")
    protected String defaultParentClass;
    @XmlAttribute(name = "robotFrameworkIntegration")
    protected Boolean robotFrameworkIntegration;

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

    /**
     * Gets the value of the askForImageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAskForImageFileName() {
        return askForImageFileName;
    }

    /**
     * Sets the value of the askForImageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAskForImageFileName(Boolean value) {
        this.askForImageFileName = value;
    }

    /**
     * Gets the value of the windowLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWindowLeft() {
        return windowLeft;
    }

    /**
     * Sets the value of the windowLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWindowLeft(Integer value) {
        this.windowLeft = value;
    }

    /**
     * Gets the value of the windowTop property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWindowTop() {
        return windowTop;
    }

    /**
     * Sets the value of the windowTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWindowTop(Integer value) {
        this.windowTop = value;
    }

    /**
     * Gets the value of the windowWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWindowWidth() {
        return windowWidth;
    }

    /**
     * Sets the value of the windowWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWindowWidth(Integer value) {
        this.windowWidth = value;
    }

    /**
     * Gets the value of the windowHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWindowHeight() {
        return windowHeight;
    }

    /**
     * Sets the value of the windowHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWindowHeight(Integer value) {
        this.windowHeight = value;
    }

    /**
     * Gets the value of the verticalSashLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerticalSashLimit() {
        return verticalSashLimit;
    }

    /**
     * Sets the value of the verticalSashLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerticalSashLimit(Integer value) {
        this.verticalSashLimit = value;
    }

    /**
     * Gets the value of the verticalSashPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerticalSashPercent() {
        return verticalSashPercent;
    }

    /**
     * Sets the value of the verticalSashPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerticalSashPercent(Integer value) {
        this.verticalSashPercent = value;
    }

    /**
     * Gets the value of the horizontalSashLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorizontalSashLimit() {
        return horizontalSashLimit;
    }

    /**
     * Sets the value of the horizontalSashLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorizontalSashLimit(Integer value) {
        this.horizontalSashLimit = value;
    }

    /**
     * Gets the value of the horizontalSashPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorizontalSashPercent() {
        return horizontalSashPercent;
    }

    /**
     * Sets the value of the horizontalSashPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorizontalSashPercent(Integer value) {
        this.horizontalSashPercent = value;
    }

    /**
     * Gets the value of the delayBeforeCapture property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayBeforeCapture() {
        return delayBeforeCapture;
    }

    /**
     * Sets the value of the delayBeforeCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayBeforeCapture(Integer value) {
        this.delayBeforeCapture = value;
    }

    /**
     * Gets the value of the defaultParentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultParentClass() {
        return defaultParentClass;
    }

    /**
     * Sets the value of the defaultParentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultParentClass(String value) {
        this.defaultParentClass = value;
    }

    /**
     * Gets the value of the robotFrameworkIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRobotFrameworkIntegration() {
        return robotFrameworkIntegration;
    }

    /**
     * Sets the value of the robotFrameworkIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRobotFrameworkIntegration(Boolean value) {
        this.robotFrameworkIntegration = value;
    }

}
