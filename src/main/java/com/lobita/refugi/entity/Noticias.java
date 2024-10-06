package com.lobita.refugi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Noticias {
    @Id
    private Long id;
    @Column(name = "dataNoticia")
    private Date dataNoticia;
    @Column (name = "titol")
    private String titol;
    @Column (name = "descripcio")
    private String descripcio;
    @Column (name = "foto")
    private String foto;
    @Column (name = "activa")
    private Boolean activa;
    @Column (name = "urlNoticia")
    private String urlNoticia;
    @Column (name = "nomBoto")
    private String nomBoto;

    // default Constructor
    public Noticias() {

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
