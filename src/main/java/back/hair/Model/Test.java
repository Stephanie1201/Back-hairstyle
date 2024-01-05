package back.hair.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Personne")
public class Test {

    public Test(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PersonID;
    private  String Nom;
    private String Prenom;
    private String Adresse;
    private String Ville;



    public Long getPersonId() {
        return PersonID;
    }

    public void setPersonId(long personId) {
        this.PersonID = personId;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        this.Ville = ville;
    }

    public Test(Long personId, String nom, String prenom, String adresse, String ville) {
        this.PersonID = personId;
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
        this.Ville = ville;
    }
}
