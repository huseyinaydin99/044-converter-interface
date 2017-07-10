/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.validator.UrlValidator;

/**
 *
 * @author husey
 */
@FacesConverter("husoCevirisi")
public class SiteAdresiTanimlamaSinifi implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uıc, String value) {
        String HTTP = "http://";
        StringBuilder url = new StringBuilder();
        if(!value.startsWith(HTTP, 0)){
            url.append(HTTP);
        }
        url.append(value);
        UrlValidator urlValidator = new UrlValidator();
        if(!urlValidator.isValid(url.toString())){
            FacesMessage facesMessage = new FacesMessage("URL Tamamlama Hatası","Geçersiz url girildi");
            facesMessage.setSeverity(facesMessage.SEVERITY_ERROR);
            System.out.println("HATA VAR");
            throw new ConverterException(facesMessage);
        }
        System.out.println("DEVAMI GELDİ.!");
        SiteAdresiPOJO adresiPOJO = new SiteAdresiPOJO(url.toString());
        return adresiPOJO;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uıc, Object o) {
        return o.toString();
    }
    
}
