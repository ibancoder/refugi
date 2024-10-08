package com.lobita.refugi.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table
public class Animals {
    @Id
    private int id;
    @Column
    private String nomAnimal;
    @Column
    private Date dataEntrada;
    @Column
    private int idTipusAnimal;
    @Column
    private int idTipusRaca;
    @Column
    private int idEstatSalut;
    @Column
    private int idEstatAnimal;
    @Column
    private Date dataAdopcio;
    @Column
    private Date dataApadrinament;
    @Column
    private String color;
    @Column
    private float edat;
    @Column
    private float pes;
    @Column
    private String mida;
    @Column
    private Date dataNaixament;
    @Column
    private int esterilitzat;
    @Column
    private int vacunat;
    @Column
    private String xip;
    @Column
    private int idComportament;
    @Column
    private String necessitats;
    @Column
    private String fotoUrl;
    @Column
    private String observacions;

    //default Constructor
    public Animals(){

    }

    //Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getIdTipusAnimal() {
        return idTipusAnimal;
    }

    public void setIdTipusAnimal(int idTipusAnimal) {
        this.idTipusAnimal = idTipusAnimal;
    }

    public int getIdTipusRaca() {
        return idTipusRaca;
    }

    public void setIdTipusRaca(int idTipusRaca) {
        this.idTipusRaca = idTipusRaca;
    }

    public int getIdEstatSalut() {
        return idEstatSalut;
    }

    public void setIdEstatSalut(int idEstatSalut) {
        this.idEstatSalut = idEstatSalut;
    }

    public int getIdEstatAnimal() {
        return idEstatAnimal;
    }

    public void setIdEstatAnimal(int idEstatAnimal) {
        this.idEstatAnimal = idEstatAnimal;
    }

    public Date getDataAdopcio() {
        return dataAdopcio;
    }

    public void setDataAdopcio(Date dataAdopcio) {
        this.dataAdopcio = dataAdopcio;
    }

    public Date getDataApadrinament() {
        return dataApadrinament;
    }

    public void setDataApadrinament(Date dataApadrinament) {
        this.dataApadrinament = dataApadrinament;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEdat() {
        return edat;
    }

    public void setEdat(float edat) {
        this.edat = edat;
    }

    public float getPes() {
        return pes;
    }

    public void setPes(float pes) {
        this.pes = pes;
    }

    public String getMida() {
        return mida;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public Date getDataNaixament() {
        return dataNaixament;
    }

    public void setDataNaixament(Date dataNaixament) {
        this.dataNaixament = dataNaixament;
    }

    public int getEsterilitzat() {
        return esterilitzat;
    }

    public void setEsterilitzat(int esterilitzat) {
        this.esterilitzat = esterilitzat;
    }

    public int getVacunat() {
        return vacunat;
    }

    public void setVacunat(int vacunat) {
        this.vacunat = vacunat;
    }

    public String getXip() {
        return xip;
    }

    public void setXip(String xip) {
        this.xip = xip;
    }

    public int getIdComportament() {
        return idComportament;
    }

    public void setIdComportament(int idComportament) {
        this.idComportament = idComportament;
    }

    public String getNecessitats() {
        return necessitats;
    }

    public void setNecessitats(String necessitats) {
        this.necessitats = necessitats;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }
}
