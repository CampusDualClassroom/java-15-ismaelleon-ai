package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    protected Date expirationDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getSpecificData() {

        return "La localización es: " + getLocation() + " y la caducidad es: " + sdf.format(getExpirationDate());

    }

    public void printSpecificData() {
        System.out.println(getSpecificData());;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
    public String getFormattedDate(Date date){
        return sdf.format(date);
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
}
