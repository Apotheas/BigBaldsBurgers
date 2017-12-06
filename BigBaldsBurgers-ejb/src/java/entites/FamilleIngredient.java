/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import com.sun.istack.Nullable;
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
public class FamilleIngredient implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ingredientFamille;

    public FamilleIngredient() {
    }

    public FamilleIngredient(String ingredientFamille) {
        this.ingredientFamille = ingredientFamille;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getIngredientFamille() {
        return ingredientFamille;
    }

    public void setIngredientFamille(String ingredientFamille) {
        this.ingredientFamille = ingredientFamille;
    }
    
    
    
    @Override
    public String toString() {
        return "entites.FamilleIngredient[ " + ingredientFamille + " ]";
    }
    
}