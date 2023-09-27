/**
 * DT_RecruitingTestServicesResponseDB_CONN_INFO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.inspien.Recruit.Test;

public class DT_RecruitingTestServicesResponseDB_CONN_INFO  implements java.io.Serializable {
    private java.lang.String HOST;

    private java.lang.String PORT;

    private java.lang.String SID;

    private java.lang.String USER;

    private java.lang.String PASSWORD;

    private java.lang.String TABLENAME;

    public DT_RecruitingTestServicesResponseDB_CONN_INFO() {
    }

    public DT_RecruitingTestServicesResponseDB_CONN_INFO(
           java.lang.String HOST,
           java.lang.String PORT,
           java.lang.String SID,
           java.lang.String USER,
           java.lang.String PASSWORD,
           java.lang.String TABLENAME) {
           this.HOST = HOST;
           this.PORT = PORT;
           this.SID = SID;
           this.USER = USER;
           this.PASSWORD = PASSWORD;
           this.TABLENAME = TABLENAME;
    }


    /**
     * Gets the HOST value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @return HOST
     */
    public java.lang.String getHOST() {
        return HOST;
    }


    /**
     * Sets the HOST value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @param HOST
     */
    public void setHOST(java.lang.String HOST) {
        this.HOST = HOST;
    }


    /**
     * Gets the PORT value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @return PORT
     */
    public java.lang.String getPORT() {
        return PORT;
    }


    /**
     * Sets the PORT value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @param PORT
     */
    public void setPORT(java.lang.String PORT) {
        this.PORT = PORT;
    }


    /**
     * Gets the SID value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @return SID
     */
    public java.lang.String getSID() {
        return SID;
    }


    /**
     * Sets the SID value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @param SID
     */
    public void setSID(java.lang.String SID) {
        this.SID = SID;
    }


    /**
     * Gets the USER value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @return USER
     */
    public java.lang.String getUSER() {
        return USER;
    }


    /**
     * Sets the USER value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @param USER
     */
    public void setUSER(java.lang.String USER) {
        this.USER = USER;
    }


    /**
     * Gets the PASSWORD value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @return PASSWORD
     */
    public java.lang.String getPASSWORD() {
        return PASSWORD;
    }


    /**
     * Sets the PASSWORD value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @param PASSWORD
     */
    public void setPASSWORD(java.lang.String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }


    /**
     * Gets the TABLENAME value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @return TABLENAME
     */
    public java.lang.String getTABLENAME() {
        return TABLENAME;
    }


    /**
     * Sets the TABLENAME value for this DT_RecruitingTestServicesResponseDB_CONN_INFO.
     * 
     * @param TABLENAME
     */
    public void setTABLENAME(java.lang.String TABLENAME) {
        this.TABLENAME = TABLENAME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_RecruitingTestServicesResponseDB_CONN_INFO)) return false;
        DT_RecruitingTestServicesResponseDB_CONN_INFO other = (DT_RecruitingTestServicesResponseDB_CONN_INFO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HOST==null && other.getHOST()==null) || 
             (this.HOST!=null &&
              this.HOST.equals(other.getHOST()))) &&
            ((this.PORT==null && other.getPORT()==null) || 
             (this.PORT!=null &&
              this.PORT.equals(other.getPORT()))) &&
            ((this.SID==null && other.getSID()==null) || 
             (this.SID!=null &&
              this.SID.equals(other.getSID()))) &&
            ((this.USER==null && other.getUSER()==null) || 
             (this.USER!=null &&
              this.USER.equals(other.getUSER()))) &&
            ((this.PASSWORD==null && other.getPASSWORD()==null) || 
             (this.PASSWORD!=null &&
              this.PASSWORD.equals(other.getPASSWORD()))) &&
            ((this.TABLENAME==null && other.getTABLENAME()==null) || 
             (this.TABLENAME!=null &&
              this.TABLENAME.equals(other.getTABLENAME())));
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
        if (getHOST() != null) {
            _hashCode += getHOST().hashCode();
        }
        if (getPORT() != null) {
            _hashCode += getPORT().hashCode();
        }
        if (getSID() != null) {
            _hashCode += getSID().hashCode();
        }
        if (getUSER() != null) {
            _hashCode += getUSER().hashCode();
        }
        if (getPASSWORD() != null) {
            _hashCode += getPASSWORD().hashCode();
        }
        if (getTABLENAME() != null) {
            _hashCode += getTABLENAME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_RecruitingTestServicesResponseDB_CONN_INFO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://inspien.co.kr/Recruit/Test", ">DT_RecruitingTestServicesResponse>DB_CONN_INFO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PORT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "USER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PASSWORD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PASSWORD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TABLENAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TABLENAME"));
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
