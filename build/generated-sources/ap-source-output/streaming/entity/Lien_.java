package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Episode;
import streaming.entity.Film;
import streaming.entity.Lien.Langue;
import streaming.entity.Lien.Qualite;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T14:24:21")
@StaticMetamodel(Lien.class)
public class Lien_ { 

    public static volatile SingularAttribute<Lien, Episode> episode;
    public static volatile SingularAttribute<Lien, Long> id;
    public static volatile SingularAttribute<Lien, Qualite> qualite;
    public static volatile SingularAttribute<Lien, Langue> langue;
    public static volatile SingularAttribute<Lien, Film> film;
    public static volatile SingularAttribute<Lien, String> url;

}