package com.retina.nypd;

public class Event {

    private String CMPLNT_NUM;
    private String CMPLNT_FR_DT;
    private String CMPLNT_FR_TM;
    private String CMPLNT_TO_DT;
    private String CMPLNT_TO_TM;
    private String RPT_DT;
    private String KY_CD;
    private String OFNS_DESC;
    private String PD_CD;
    private String PD_DESC;
    private String CRM_ATPT_CPTD_CD;
    private String LAW_CAT_CD;
    private String JURIS_DESC;
    private String BORO_NM;
    private String ADDR_PCT_CD;
    private String LOC_OF_OCCUR_DESC;
    private String PREM_TYP_DESC;
    private String PARKS_NM;
    private String HADEVELOPT;
    private String X_COORD_CD;
    private String Y_COORD_CD;
    private String Latitude;
    private String Longitude;

    public Event(String CMPLNT_NUM, String KY_CD) {
        this.CMPLNT_NUM = CMPLNT_NUM;
        this.KY_CD = KY_CD;
    }

    public void setCMPLNT_NUM(String CMPLNT_NUM) {
        this.CMPLNT_NUM = CMPLNT_NUM;
    }

    public void setCMPLNT_FR_DT(String CMPLNT_FR_DT) {
        this.CMPLNT_FR_DT = CMPLNT_FR_DT;
    }

    public void setCMPLNT_FR_TM(String CMPLNT_FR_TM) {
        this.CMPLNT_FR_TM = CMPLNT_FR_TM;
    }

    public void setCMPLNT_TO_DT(String CMPLNT_TO_DT) {
        this.CMPLNT_TO_DT = CMPLNT_TO_DT;
    }

    public void setCMPLNT_TO_TM(String CMPLNT_TO_TM) {
        this.CMPLNT_TO_TM = CMPLNT_TO_TM;
    }

    public void setRPT_DT(String RPT_DT) {
        this.RPT_DT = RPT_DT;
    }

    public void setKY_CD(String KY_CD) {
        this.KY_CD = KY_CD;
    }

    public void setOFNS_DESC(String OFNS_DESC) {
        this.OFNS_DESC = OFNS_DESC;
    }

    public void setPD_CD(String PD_CD) {
        this.PD_CD = PD_CD;
    }

    public void setPD_DESC(String PD_DESC) {
        this.PD_DESC = PD_DESC;
    }

    public void setCRM_ATPT_CPTD_CD(String CRM_ATPT_CPTD_CD) {
        this.CRM_ATPT_CPTD_CD = CRM_ATPT_CPTD_CD;
    }

    public void setLAW_CAT_CD(String LAW_CAT_CD) {
        this.LAW_CAT_CD = LAW_CAT_CD;
    }

    public void setJURIS_DESC(String JURIS_DESC) {
        this.JURIS_DESC = JURIS_DESC;
    }

    public void setBORO_NM(String BORO_NM) {
        this.BORO_NM = BORO_NM;
    }

    public void setADDR_PCT_CD(String ADDR_PCT_CD) {
        this.ADDR_PCT_CD = ADDR_PCT_CD;
    }

    public void setLOC_OF_OCCUR_DESC(String LOC_OF_OCCUR_DESC) {
        this.LOC_OF_OCCUR_DESC = LOC_OF_OCCUR_DESC;
    }

    public void setPREM_TYP_DESC(String PREM_TYP_DESC) {
        this.PREM_TYP_DESC = PREM_TYP_DESC;
    }

    public void setPARKS_NM(String PARKS_NM) {
        this.PARKS_NM = PARKS_NM;
    }

    public void setHADEVELOPT(String HADEVELOPT) {
        this.HADEVELOPT = HADEVELOPT;
    }

    public void setX_COORD_CD(String x_COORD_CD) {
        X_COORD_CD = x_COORD_CD;
    }

    public void setY_COORD_CD(String y_COORD_CD) {
        Y_COORD_CD = y_COORD_CD;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getCMPLNT_NUM() {
        return CMPLNT_NUM;
    }

    public String getCMPLNT_FR_DT() {
        return CMPLNT_FR_DT;
    }

    public String getCMPLNT_FR_TM() {
        return CMPLNT_FR_TM;
    }

    public String getCMPLNT_TO_DT() {
        return CMPLNT_TO_DT;
    }

    public String getCMPLNT_TO_TM() {
        return CMPLNT_TO_TM;
    }

    public String getRPT_DT() {
        return RPT_DT;
    }

    public String getKY_CD() {
        return KY_CD;
    }

    public String getOFNS_DESC() {
        return OFNS_DESC;
    }

    public String getPD_CD() {
        return PD_CD;
    }

    public String getPD_DESC() {
        return PD_DESC;
    }

    public String getCRM_ATPT_CPTD_CD() {
        return CRM_ATPT_CPTD_CD;
    }

    public String getLAW_CAT_CD() {
        return LAW_CAT_CD;
    }

    public String getJURIS_DESC() {
        return JURIS_DESC;
    }

    public String getBORO_NM() {
        return BORO_NM;
    }

    public String getADDR_PCT_CD() {
        return ADDR_PCT_CD;
    }

    public String getLOC_OF_OCCUR_DESC() {
        return LOC_OF_OCCUR_DESC;
    }

    public String getPREM_TYP_DESC() {
        return PREM_TYP_DESC;
    }

    public String getPARKS_NM() {
        return PARKS_NM;
    }

    public String getHADEVELOPT() {
        return HADEVELOPT;
    }

    public String getX_COORD_CD() {
        return X_COORD_CD;
    }

    public String getY_COORD_CD() {
        return Y_COORD_CD;
    }

    public String getLatitude() {
        return Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }
}
