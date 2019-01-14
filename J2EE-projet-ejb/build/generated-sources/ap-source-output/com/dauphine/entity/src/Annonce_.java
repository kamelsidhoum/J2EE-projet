package com.dauphine.entity.src;

import com.dauphine.entity.src.Reservation;
import com.dauphine.entity.src.UtilisateurProfessionnel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(Annonce.class)
public class Annonce_ { 

    public static volatile SingularAttribute<Annonce, Integer> annPlaceDispo;
    public static volatile SingularAttribute<Annonce, UtilisateurProfessionnel> annUsproId;
    public static volatile SingularAttribute<Annonce, Integer> annId;
    public static volatile SingularAttribute<Annonce, Date> annDateCreation;
    public static volatile SingularAttribute<Annonce, Reservation> annResId;

}