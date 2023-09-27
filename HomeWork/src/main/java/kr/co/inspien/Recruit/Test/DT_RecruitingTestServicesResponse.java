/**
 * DT_RecruitingTestServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.inspien.Recruit.Test;

public class DT_RecruitingTestServicesResponse  implements java.io.Serializable {
    private java.lang.String XML_DATA;

    private java.lang.String JSON_DATA;

    private kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseDB_CONN_INFO DB_CONN_INFO;

    private kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseFTP_CONN_INFO FTP_CONN_INFO;

    public DT_RecruitingTestServicesResponse() {
    }

    public DT_RecruitingTestServicesResponse(
           java.lang.String XML_DATA,
           java.lang.String JSON_DATA,
           kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseDB_CONN_INFO DB_CONN_INFO,
           kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseFTP_CONN_INFO FTP_CONN_INFO) {
           this.XML_DATA = XML_DATA;
           this.JSON_DATA = JSON_DATA;
           this.DB_CONN_INFO = DB_CONN_INFO;
           this.FTP_CONN_INFO = FTP_CONN_INFO;
    }


    /**
     * Gets the XML_DATA value for this DT_RecruitingTestServicesResponse.
     * 
     * @return XML_DATA
     */
    public java.lang.String getXML_DATA() {
        return XML_DATA;
    }


    /**
     * Sets the XML_DATA value for this DT_RecruitingTestServicesResponse.
     * 
     * @param XML_DATA
     */
    public void setXML_DATA(java.lang.String XML_DATA) {
        this.XML_DATA = XML_DATA;
    }


    /**
     * Gets the JSON_DATA value for this DT_RecruitingTestServicesResponse.
     * 
     * @return JSON_DATA
     */
    public java.lang.String getJSON_DATA() {
        return JSON_DATA;
    }


    /**
     * Sets the JSON_DATA value for this DT_RecruitingTestServicesResponse.
     * 
     * @param JSON_DATA
     */
    public void setJSON_DATA(java.lang.String JSON_DATA) {
        this.JSON_DATA = JSON_DATA;
    }


    /**
     * Gets the DB_CONN_INFO value for this DT_RecruitingTestServicesResponse.
     * 
     * @return DB_CONN_INFO
     */
    public kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseDB_CONN_INFO getDB_CONN_INFO() {
        return DB_CONN_INFO;
    }


    /**
     * Sets the DB_CONN_INFO value for this DT_RecruitingTestServicesResponse.
     * 
     * @param DB_CONN_INFO
     */
    public void setDB_CONN_INFO(kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseDB_CONN_INFO DB_CONN_INFO) {
        this.DB_CONN_INFO = DB_CONN_INFO;
    }


    /**
     * Gets the FTP_CONN_INFO value for this DT_RecruitingTestServicesResponse.
     * 
     * @return FTP_CONN_INFO
     */
    public kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseFTP_CONN_INFO getFTP_CONN_INFO() {
        return FTP_CONN_INFO;
    }


    /**
     * Sets the FTP_CONN_INFO value for this DT_RecruitingTestServicesResponse.
     * 
     * @param FTP_CONN_INFO
     */
    public void setFTP_CONN_INFO(kr.co.inspien.Recruit.Test.DT_RecruitingTestServicesResponseFTP_CONN_INFO FTP_CONN_INFO) {
        this.FTP_CONN_INFO = FTP_CONN_INFO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_RecruitingTestServicesResponse)) return false;
        DT_RecruitingTestServicesResponse other = (DT_RecruitingTestServicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XML_DATA==null && other.getXML_DATA()==null) || 
             (this.XML_DATA!=null &&
              this.XML_DATA.equals(other.getXML_DATA()))) &&
            ((this.JSON_DATA==null && other.getJSON_DATA()==null) || 
             (this.JSON_DATA!=null &&
              this.JSON_DATA.equals(other.getJSON_DATA()))) &&
            ((this.DB_CONN_INFO==null && other.getDB_CONN_INFO()==null) || 
             (this.DB_CONN_INFO!=null &&
              this.DB_CONN_INFO.equals(other.getDB_CONN_INFO()))) &&
            ((this.FTP_CONN_INFO==null && other.getFTP_CONN_INFO()==null) || 
             (this.FTP_CONN_INFO!=null &&
              this.FTP_CONN_INFO.equals(other.getFTP_CONN_INFO())));
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
        if (getXML_DATA() != null) {
            _hashCode += getXML_DATA().hashCode();
        }
        if (getJSON_DATA() != null) {
            _hashCode += getJSON_DATA().hashCode();
        }
        if (getDB_CONN_INFO() != null) {
            _hashCode += getDB_CONN_INFO().hashCode();
        }
        if (getFTP_CONN_INFO() != null) {
            _hashCode += getFTP_CONN_INFO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_RecruitingTestServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://inspien.co.kr/Recruit/Test", "DT_RecruitingTestServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XML_DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XML_DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JSON_DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JSON_DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DB_CONN_INFO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DB_CONN_INFO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://inspien.co.kr/Recruit/Test", ">DT_RecruitingTestServicesResponse>DB_CONN_INFO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTP_CONN_INFO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTP_CONN_INFO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://inspien.co.kr/Recruit/Test", ">DT_RecruitingTestServicesResponse>FTP_CONN_INFO"));
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
