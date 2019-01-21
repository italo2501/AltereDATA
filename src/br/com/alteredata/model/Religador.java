/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alteredata.model;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author italo
 */

@Entity
public class Religador implements Serializable {
    
    @Id
    @NotNull
    private String nReligador;
    private String cix1;
    private String cix2;
    private String cix3;
    private String cixn;
    private String cux1;
    private String cux2;
    private String cux3;
    private String cux4;
    private String cux5;
    private String cux6;

    public String getnReligador() {
        return nReligador;
    }

    public void setnReligador(String nReligador) {
        this.nReligador = nReligador;
    }

    public String getCix1() {
        return cix1;
    }

    public void setCix1(String cix1) {
        this.cix1 = cix1;
    }

    public String getCix2() {
        return cix2;
    }

    public void setCix2(String cix2) {
        this.cix2 = cix2;
    }

    public String getCix3() {
        return cix3;
    }

    public void setCix3(String cix3) {
        this.cix3 = cix3;
    }

    public String getCixn() {
        return cixn;
    }

    public void setCixn(String cixn) {
        this.cixn = cixn;
    }

    public String getCux1() {
        return cux1;
    }

    public void setCux1(String cux1) {
        this.cux1 = cux1;
    }

    public String getCux2() {
        return cux2;
    }

    public void setCux2(String cux2) {
        this.cux2 = cux2;
    }

    public String getCux3() {
        return cux3;
    }

    public void setCux3(String cux3) {
        this.cux3 = cux3;
    }

    public String getCux4() {
        return cux4;
    }

    public void setCux4(String cux4) {
        this.cux4 = cux4;
    }

    public String getCux5() {
        return cux5;
    }

    public void setCux5(String cux5) {
        this.cux5 = cux5;
    }

    public String getCux6() {
        return cux6;
    }

    public void setCux6(String cux6) {
        this.cux6 = cux6;
    }
    
    
    
    
}
