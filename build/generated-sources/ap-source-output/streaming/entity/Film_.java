package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Genre;
import streaming.entity.Lien;
import streaming.entity.Pays;
import streaming.entity.Personne;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T14:24:21")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile ListAttribute<Film, Personne> realisateurs;
    public static volatile SingularAttribute<Film, String> titre;
    public static volatile SingularAttribute<Film, Genre> genre;
    public static volatile SingularAttribute<Film, Integer> duree;
    public static volatile SingularAttribute<Film, Long> id;
    public static volatile SingularAttribute<Film, String> synopsis;
    public static volatile SingularAttribute<Film, Integer> annee;
    public static volatile ListAttribute<Film, Personne> acteurs;
    public static volatile ListAttribute<Film, Lien> liens;
    public static volatile ListAttribute<Film, Pays> pays;

}