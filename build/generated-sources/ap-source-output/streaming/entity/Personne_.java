package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Film;
import streaming.entity.Serie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T14:24:21")
@StaticMetamodel(Personne.class)
public class Personne_ { 

    public static volatile ListAttribute<Personne, Film> filmsJoues;
    public static volatile ListAttribute<Personne, Serie> seriesJoues;
    public static volatile ListAttribute<Personne, Film> filmsRealises;
    public static volatile SingularAttribute<Personne, Long> id;
    public static volatile SingularAttribute<Personne, String> nom;
    public static volatile SingularAttribute<Personne, String> prenom;
    public static volatile ListAttribute<Personne, Serie> seriesRealises;

}