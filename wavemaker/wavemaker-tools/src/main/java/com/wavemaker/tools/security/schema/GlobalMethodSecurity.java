//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 01:44:45 PM PST 
//


package com.wavemaker.tools.security.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;choice minOccurs="0">
 *           &lt;element name="pre-post-annotation-handling">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="invocation-attribute-factory">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="pre-invocation-advice">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="post-invocation-advice">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="expression-handler">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="protect-pointcut" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.springframework.org/schema/security}protect-pointcut.attlist"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="after-invocation-provider" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.springframework.org/schema/security}global-method-security.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prePostAnnotationHandling",
    "expressionHandler",
    "protectPointcut",
    "afterInvocationProvider"
})
@XmlRootElement(name = "global-method-security")
public class GlobalMethodSecurity {

    @XmlElement(name = "pre-post-annotation-handling")
    protected GlobalMethodSecurity.PrePostAnnotationHandling prePostAnnotationHandling;
    @XmlElement(name = "expression-handler")
    protected GlobalMethodSecurity.ExpressionHandler expressionHandler;
    @XmlElement(name = "protect-pointcut")
    protected List<GlobalMethodSecurity.ProtectPointcut> protectPointcut;
    @XmlElement(name = "after-invocation-provider")
    protected List<GlobalMethodSecurity.AfterInvocationProvider> afterInvocationProvider;
    @XmlAttribute(name = "pre-post-annotations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prePostAnnotations;
    @XmlAttribute(name = "secured-annotations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String securedAnnotations;
    @XmlAttribute(name = "jsr250-annotations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jsr250Annotations;
    @XmlAttribute(name = "access-decision-manager-ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accessDecisionManagerRef;
    @XmlAttribute(name = "run-as-manager-ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String runAsManagerRef;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String order;
    @XmlAttribute(name = "proxy-target-class")
    protected Boolean proxyTargetClass;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mode;
    @XmlAttribute(name = "metadata-source-ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String metadataSourceRef;
    @XmlAttribute(name = "authentication-manager-ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authenticationManagerRef;

    /**
     * Gets the value of the prePostAnnotationHandling property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMethodSecurity.PrePostAnnotationHandling }
     *     
     */
    public GlobalMethodSecurity.PrePostAnnotationHandling getPrePostAnnotationHandling() {
        return prePostAnnotationHandling;
    }

    /**
     * Sets the value of the prePostAnnotationHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMethodSecurity.PrePostAnnotationHandling }
     *     
     */
    public void setPrePostAnnotationHandling(GlobalMethodSecurity.PrePostAnnotationHandling value) {
        this.prePostAnnotationHandling = value;
    }

    /**
     * Gets the value of the expressionHandler property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMethodSecurity.ExpressionHandler }
     *     
     */
    public GlobalMethodSecurity.ExpressionHandler getExpressionHandler() {
        return expressionHandler;
    }

    /**
     * Sets the value of the expressionHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMethodSecurity.ExpressionHandler }
     *     
     */
    public void setExpressionHandler(GlobalMethodSecurity.ExpressionHandler value) {
        this.expressionHandler = value;
    }

    /**
     * Gets the value of the protectPointcut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectPointcut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectPointcut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalMethodSecurity.ProtectPointcut }
     * 
     * 
     */
    public List<GlobalMethodSecurity.ProtectPointcut> getProtectPointcut() {
        if (protectPointcut == null) {
            protectPointcut = new ArrayList<GlobalMethodSecurity.ProtectPointcut>();
        }
        return this.protectPointcut;
    }

    /**
     * Gets the value of the afterInvocationProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afterInvocationProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfterInvocationProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalMethodSecurity.AfterInvocationProvider }
     * 
     * 
     */
    public List<GlobalMethodSecurity.AfterInvocationProvider> getAfterInvocationProvider() {
        if (afterInvocationProvider == null) {
            afterInvocationProvider = new ArrayList<GlobalMethodSecurity.AfterInvocationProvider>();
        }
        return this.afterInvocationProvider;
    }

    /**
     * Gets the value of the prePostAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePostAnnotations() {
        return prePostAnnotations;
    }

    /**
     * Sets the value of the prePostAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePostAnnotations(String value) {
        this.prePostAnnotations = value;
    }

    /**
     * Gets the value of the securedAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredAnnotations() {
        return securedAnnotations;
    }

    /**
     * Sets the value of the securedAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredAnnotations(String value) {
        this.securedAnnotations = value;
    }

    /**
     * Gets the value of the jsr250Annotations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsr250Annotations() {
        return jsr250Annotations;
    }

    /**
     * Sets the value of the jsr250Annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsr250Annotations(String value) {
        this.jsr250Annotations = value;
    }

    /**
     * Gets the value of the accessDecisionManagerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessDecisionManagerRef() {
        return accessDecisionManagerRef;
    }

    /**
     * Sets the value of the accessDecisionManagerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessDecisionManagerRef(String value) {
        this.accessDecisionManagerRef = value;
    }

    /**
     * Gets the value of the runAsManagerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunAsManagerRef() {
        return runAsManagerRef;
    }

    /**
     * Sets the value of the runAsManagerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunAsManagerRef(String value) {
        this.runAsManagerRef = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the proxyTargetClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProxyTargetClass() {
        return proxyTargetClass;
    }

    /**
     * Sets the value of the proxyTargetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProxyTargetClass(Boolean value) {
        this.proxyTargetClass = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the metadataSourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataSourceRef() {
        return metadataSourceRef;
    }

    /**
     * Sets the value of the metadataSourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataSourceRef(String value) {
        this.metadataSourceRef = value;
    }

    /**
     * Gets the value of the authenticationManagerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationManagerRef() {
        return authenticationManagerRef;
    }

    /**
     * Sets the value of the authenticationManagerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationManagerRef(String value) {
        this.authenticationManagerRef = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AfterInvocationProvider {

        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String ref;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExpressionHandler {

        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String ref;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }


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
     *         &lt;element name="invocation-attribute-factory">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="pre-invocation-advice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="post-invocation-advice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invocationAttributeFactory",
        "preInvocationAdvice",
        "postInvocationAdvice"
    })
    public static class PrePostAnnotationHandling {

        @XmlElement(name = "invocation-attribute-factory", required = true)
        protected GlobalMethodSecurity.PrePostAnnotationHandling.InvocationAttributeFactory invocationAttributeFactory;
        @XmlElement(name = "pre-invocation-advice", required = true)
        protected GlobalMethodSecurity.PrePostAnnotationHandling.PreInvocationAdvice preInvocationAdvice;
        @XmlElement(name = "post-invocation-advice", required = true)
        protected GlobalMethodSecurity.PrePostAnnotationHandling.PostInvocationAdvice postInvocationAdvice;

        /**
         * Gets the value of the invocationAttributeFactory property.
         * 
         * @return
         *     possible object is
         *     {@link GlobalMethodSecurity.PrePostAnnotationHandling.InvocationAttributeFactory }
         *     
         */
        public GlobalMethodSecurity.PrePostAnnotationHandling.InvocationAttributeFactory getInvocationAttributeFactory() {
            return invocationAttributeFactory;
        }

        /**
         * Sets the value of the invocationAttributeFactory property.
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalMethodSecurity.PrePostAnnotationHandling.InvocationAttributeFactory }
         *     
         */
        public void setInvocationAttributeFactory(GlobalMethodSecurity.PrePostAnnotationHandling.InvocationAttributeFactory value) {
            this.invocationAttributeFactory = value;
        }

        /**
         * Gets the value of the preInvocationAdvice property.
         * 
         * @return
         *     possible object is
         *     {@link GlobalMethodSecurity.PrePostAnnotationHandling.PreInvocationAdvice }
         *     
         */
        public GlobalMethodSecurity.PrePostAnnotationHandling.PreInvocationAdvice getPreInvocationAdvice() {
            return preInvocationAdvice;
        }

        /**
         * Sets the value of the preInvocationAdvice property.
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalMethodSecurity.PrePostAnnotationHandling.PreInvocationAdvice }
         *     
         */
        public void setPreInvocationAdvice(GlobalMethodSecurity.PrePostAnnotationHandling.PreInvocationAdvice value) {
            this.preInvocationAdvice = value;
        }

        /**
         * Gets the value of the postInvocationAdvice property.
         * 
         * @return
         *     possible object is
         *     {@link GlobalMethodSecurity.PrePostAnnotationHandling.PostInvocationAdvice }
         *     
         */
        public GlobalMethodSecurity.PrePostAnnotationHandling.PostInvocationAdvice getPostInvocationAdvice() {
            return postInvocationAdvice;
        }

        /**
         * Sets the value of the postInvocationAdvice property.
         * 
         * @param value
         *     allowed object is
         *     {@link GlobalMethodSecurity.PrePostAnnotationHandling.PostInvocationAdvice }
         *     
         */
        public void setPostInvocationAdvice(GlobalMethodSecurity.PrePostAnnotationHandling.PostInvocationAdvice value) {
            this.postInvocationAdvice = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InvocationAttributeFactory {

            @XmlAttribute(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String ref;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRef() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRef(String value) {
                this.ref = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PostInvocationAdvice {

            @XmlAttribute(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String ref;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRef() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRef(String value) {
                this.ref = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.springframework.org/schema/security}ref"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PreInvocationAdvice {

            @XmlAttribute(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String ref;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRef() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRef(String value) {
                this.ref = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.springframework.org/schema/security}protect-pointcut.attlist"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProtectPointcut {

        @XmlAttribute(required = true)
        protected String expression;
        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String access;

        /**
         * Gets the value of the expression property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpression() {
            return expression;
        }

        /**
         * Sets the value of the expression property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpression(String value) {
            this.expression = value;
        }

        /**
         * Gets the value of the access property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccess() {
            return access;
        }

        /**
         * Sets the value of the access property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccess(String value) {
            this.access = value;
        }

    }

}
