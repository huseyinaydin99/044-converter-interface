/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

/**
 *
 * @author husey
 */
public class SiteAdresiPOJO {
    String siteAdi;

    public SiteAdresiPOJO(String siteAdi) {
        this.siteAdi = siteAdi;
    }

    public String getSiteAdi() {
        return siteAdi;
    }

    public void setSiteAdi(String siteAdi) {
        this.siteAdi = siteAdi;
    }

    @Override
    public String toString() {
        return siteAdi;
    }
    
    
}
