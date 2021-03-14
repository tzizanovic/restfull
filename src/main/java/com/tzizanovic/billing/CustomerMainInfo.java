package com.tzizanovic.billing;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class CustomerMainInfo {
    String errorMessage = null;
    String tip;
    String accountNumber;
    String contractNumber;
    String odnosId;
    String status;
    Timestamp SetupDate; //2000-09-17 08:25:42
    String ime;
    String prezime;
    String firma;
    String adr1;
    String adresa;
    int postanskiBroj;
    String mjesto;
    String adr4;
    String  jmbg;
    String isPrivate;
    String idCard;

    public CustomerMainInfo() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getOdnosId() {
        return odnosId;
    }

    public void setOdnosId(String odnosId) {
        this.odnosId = odnosId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getSetupDate() {
        return SetupDate;
    }

    public void setSetupDate(Timestamp setupDate) {
        SetupDate = setupDate;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getAdr1() {
        return adr1;
    }

    public void setAdr1(String adr1) {
        this.adr1 = adr1;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public String getAdr4() {
        return adr4;
    }

    public void setAdr4(String adr4) {
        this.adr4 = adr4;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public CustomerMainInfo(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CustomerMainInfo(String tip, String accountNumber, String contractNumber, String odnosId, String status, Timestamp setupDate, String ime, String prezime, String firma, String adr1, String adresa, int postanskiBroj, String mjesto, String adr4, String jmbg, String isPrivate, String idCard) {
        this.tip = tip;
        this.accountNumber = accountNumber;
        this.contractNumber = contractNumber;
        this.odnosId = odnosId;
        this.status = status;
        SetupDate = setupDate;
        this.ime = ime;
        this.prezime = prezime;
        this.firma = firma;
        this.adr1 = adr1;
        this.adresa = adresa;
        this.postanskiBroj = postanskiBroj;
        this.mjesto = mjesto;
        this.adr4 = adr4;
        this.jmbg = jmbg;
        this.isPrivate = isPrivate;
        this.idCard = idCard;

    }
}
