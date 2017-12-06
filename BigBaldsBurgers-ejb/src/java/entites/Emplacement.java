
package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Emplacement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String numero;
    @Column(nullable = false)
    private int nbrePlaces;

    
    @OneToMany(mappedBy = "numTable")
    private Collection<Commande> commande;
    @ManyToOne
    private Status dispoTable;
    
    public Emplacement() {
        commande = new ArrayList();
    }

    public Emplacement(String numero, int nbrePlaces) {
        this();
        this.numero = numero;
        this.nbrePlaces = nbrePlaces;
    }

    public Collection<Commande> getCommande() {
        return commande;
    }

    public void setCommande(Collection<Commande> commande) {
        this.commande = commande;
    }

    public Status getDispoTable() {
        return dispoTable;
    }

    public void setDispoTable(Status dispoTable) {
        this.dispoTable = dispoTable;
    }
        
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNbrePlaces() {
        return nbrePlaces;
    }

    public void setNbrePlaces(int nbrePlaces) {
        this.nbrePlaces = nbrePlaces;
    }

      

    @Override
    public String toString() {
        return "Numéro de table : " + numero + ". " + "Nombre places : " + nbrePlaces;
    }
    
}
