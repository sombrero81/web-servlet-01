package streaming.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import streaming.entity.Lien;
import streaming.entity.Saison;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T14:24:21")
@StaticMetamodel(Episode.class)
public class Episode_ { 

    public static volatile SingularAttribute<Episode, Saison> saison;
    public static volatile SingularAttribute<Episode, String> titre;
    public static volatile SingularAttribute<Episode, Integer> numEpisode;
    public static volatile SingularAttribute<Episode, Long> id;
    public static volatile ListAttribute<Episode, Lien> liens;

}