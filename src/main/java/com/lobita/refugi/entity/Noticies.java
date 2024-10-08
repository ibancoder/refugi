package com.lobita.refugi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table
public class Noticies {
    @Id
    private Long id;
    @Column
    private Date dataNoticia;
    @Column
    private String titol;
    @Column
    private String descripcio;
    @Column
    private String foto;
    @Column
    private Boolean activa;
    @Column
    private String urlNoticia;
    @Column
    private String nomBoto;

    // default Constructor
    public Noticies() {

    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataNoticia() {
        return dataNoticia;
    }

    public void setDataNoticia(Date dataNoticia) {
        this.dataNoticia = dataNoticia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public String getUrlNoticia() {
        return urlNoticia;
    }

    public void setUrlNoticia(String urlNoticia) {
        this.urlNoticia = urlNoticia;
    }

    public String getNomBoto() {
        return nomBoto;
    }

    public void setNomBoto(String nomBoto) {
        this.nomBoto = nomBoto;
    }

    

}
