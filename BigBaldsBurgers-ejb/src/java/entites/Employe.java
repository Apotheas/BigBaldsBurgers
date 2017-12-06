
package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Employe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String login;

    @ManyToMany
    private Collection<Droits> typeDroit;
  
    public Employe() {
        typeDroit = new ArrayList<>();
    }

    public Employe(int matricule, String nom, String prenom, String telephone, String email, String login) {
        this();
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
    }

    public Collection<Droits> getTypeDroit() {
        return typeDroit;
    }

    public void setTypeDroit(Collection<Droits> typeDroit) {
        this.typeDroit = typeDroit;
    }
   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    

    @Override
    public String toString() {
        return "Employé matricule : " + matricule + "Nom, Prenom : " + nom + " " + prenom;
    }
    
}
