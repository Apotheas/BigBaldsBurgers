/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Tofi
 */
@Entity
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    private float prix;
    private String image;
    private String description;

    public Produit() {
    }

    public Produit(String nom, float prix, String image, String description) {
        this.nom = nom;
        this.prix = prix;
        this.image = image;
        this.description = description;
    }

    public String getNomProduit() {
        return nom;
    }

    public void setNomProduit(String nom) {
        this.nom = nom;
    }

    public float getPrixProduit() {
        return prix;
    }

    public void setPrixProduit(float prix) {
        this.prix = prix;
    }

    public String getImageProduit() {
        return image;
    }

    public void setImageProduit(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return "entites.Produit[ "+nom+" "+prix+"]";
    }
    
}
