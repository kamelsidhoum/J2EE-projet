package com.dauphine.entity.src;

import com.dauphine.entity.src.Restaurant;
import com.dauphine.entity.src.Utilisateurparticulier;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(Notation.class)
public class Notation_ { 

    public static volatile SingularAttribute<Notation, String> notHeure;
    public static volatile SingularAttribute<Notation, Restaurant> notRestoId;
    public static volatile SingularAttribute<Notation, Utilisateurparticulier> notusrPartid;
    public static volatile SingularAttribute<Notation, Integer> notNote;
    public static volatile SingularAttribute<Notation, String> notCommentaire;
    public static volatile SingularAttribute<Notation, Date> notDate;
    public static volatile SingularAttribute<Notation, Integer> notId;

}