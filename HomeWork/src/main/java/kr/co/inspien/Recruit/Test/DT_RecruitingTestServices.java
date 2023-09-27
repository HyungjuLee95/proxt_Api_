/**
 * DT_RecruitingTestServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.inspien.Recruit.Test;

public class DT_RecruitingTestServices  implements java.io.Serializable {
    private java.lang.String NAME;

    private java.lang.String PHONE_NUMBER;

    private java.lang.String e_MAIL;

    public DT_RecruitingTestServices() {
    }

    public DT_RecruitingTestServices(
           java.lang.String NAME,
           java.lang.String PHONE_NUMBER,
           java.lang.String e_MAIL) {
           this.NAME = NAME;
           this.PHONE_NUMBER = PHONE_NUMBER;
           this.e_MAIL = e_MAIL;
    }


    /**
     * Gets the NAME value for this DT_RecruitingTestServices.
     * 
     * @return NAME
     */
    public java.lang.String getNAME() {
        return NAME;
    }


    /**
     * Sets the NAME value for this DT_RecruitingTestServices.
     * 
     * @param NAME
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }


    /**
     * Gets the PHONE_NUMBER value for this DT_RecruitingTestServices.
     * 
     * @return PHONE_NUMBER
     */
    public java.lang.String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }


    /**
     * Sets the PHONE_NUMBER value for this DT_RecruitingTestServices.
     * 
     * @param PHONE_NUMBER
     */
    public void setPHONE_NUMBER(java.lang.String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }


    /**
     * Gets the e_MAIL value for this DT_RecruitingTestServices.
     * 
     * @return e_MAIL
     */
    public java.lang.String getE_MAIL() {
        return e_MAIL;
    }


    /**
     * Sets the e_MAIL value for this DT_RecruitingTestServices.
     * 
     * @param e_MAIL
     */
    public void setE_MAIL(java.lang.String e_MAIL) {
        this.e_MAIL = e_MAIL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_RecruitingTestServices)) return false;
        DT_RecruitingTestServices other = (DT_RecruitingTestServices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NAME==null && other.getNAME()==null) || 
             (this.NAME!=null &&
              this.NAME.equals(other.getNAME()))) &&
            ((this.PHONE_NUMBER==null && other.getPHONE_NUMBER()==null) || 
             (this.PHONE_NUMBER!=null &&
              this.PHONE_NUMBER.equals(other.getPHONE_NUMBER()))) &&
            ((this.e_MAIL==null && other.getE_MAIL()==null) || 
             (this.e_MAIL!=null &&
              this.e_MAIL.equals(other.getE_MAIL())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNAME() != null) {
            _hashCode += getNAME().hashCode();
        }
        if (getPHONE_NUMBER() != null) {
            _hashCode += getPHONE_NUMBER().hashCode();
        }
        if (getE_MAIL() != null) {
            _hashCode += getE_MAIL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_RecruitingTestServices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://inspien.co.kr/Recruit/Test", "DT_RecruitingTestServices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONE_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PHONE_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_MAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "E_MAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
