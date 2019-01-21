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
public class Altere implements Serializable {
    
    @Id
    @NotNull
    @Column(name = "MAC")
    private String mac;
    @Column(name = "FW_IHM")
    private String fwIhm;
    @Column(name = "FW_UPS")
    private String fwUps;
    @Column(name = "FW_UCP")
    private String fwUcp;
    @Column(name = "N_SERIE")
    private String nSerie;
    @Column(name = "SETUP")
    private String setup;
    @Column(name = "N_RELIGADOR")
    private String nReligador;
    @Column(name = "CIX1")
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
    @Column(name = "BAUD_RATE")
    private String velociade;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getFwIhm() {
        return fwIhm;
    }

    public void setFwIhm(String fwIhm) {
        this.fwIhm = fwIhm;
    }

    public String getFwUps() {
        return fwUps;
    }

    public void setFwUps(String fwUps) {
        this.fwUps = fwUps;
    }

    public String getFwUcp() {
        return fwUcp;
    }

    public void setFwUcp(String fwUcp) {
        this.fwUcp = fwUcp;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

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

    public String getVelociade() {
        return velociade;
    }

    public void setVelociade(String velociade) {
        this.velociade = velociade;
    }

    @Override
    public String toString() {
        return "Altere{" + "mac=" + mac + ", fwIhm=" + fwIhm + ", fwUps=" + fwUps + ", fwUcp=" + fwUcp + ", nSerie=" + nSerie + ", setup=" + setup + ", nReligador=" + nReligador + ", cix1=" + cix1 + ", cix2=" + cix2 + ", cix3=" + cix3 + ", cixn=" + cixn + ", cux1=" + cux1 + ", cux2=" + cux2 + ", cux3=" + cux3 + ", cux4=" + cux4 + ", cux5=" + cux5 + ", cux6=" + cux6 + ", velociade=" + velociade + '}';
    }

   

 
    
    
    
}
