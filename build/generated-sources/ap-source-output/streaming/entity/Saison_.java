package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Episode;
import streaming.entity.Serie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T14:24:21")
@StaticMetamodel(Saison.class)
public class Saison_ { 

    public static volatile SingularAttribute<Saison, Serie> serie;
    public static volatile SingularAttribute<Saison, Long> id;
    public static volatile SingularAttribute<Saison, Integer> numSaison;
    public static volatile ListAttribute<Saison, Episode> episodes;

}