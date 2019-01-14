package com.dauphine.entity.src;

import com.dauphine.entity.src.HistoriqueReservation;
import com.dauphine.entity.src.Menu;
import com.dauphine.entity.src.Notation;
import com.dauphine.entity.src.UtilisateurProfessionnel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(Restaurant.class)
public class Restaurant_ { 

    public static volatile SingularAttribute<Restaurant, UtilisateurProfessionnel> resUsproId;
    public static volatile SingularAttribute<Restaurant, String> resNom;
    public static volatile CollectionAttribute<Restaurant, Notation> notationCollection;
    public static volatile SingularAttribute<Restaurant, String> resAdresse;
    public static volatile SingularAttribute<Restaurant, String> resEmail;
    public static volatile SingularAttribute<Restaurant, Integer> resCodePostal;
    public static volatile SingularAttribute<Restaurant, Integer> resId;
    public static volatile SingularAttribute<Restaurant, Integer> resNumeroTel;
    public static volatile SingularAttribute<Restaurant, Integer> resNbCouvert;
    public static volatile CollectionAttribute<Restaurant, HistoriqueReservation> historiqueReservationCollection;
    public static volatile SingularAttribute<Restaurant, String> resVille;
    public static volatile SingularAttribute<Restaurant, Date> resDateInscription;
    public static volatile SingularAttribute<Restaurant, Integer> resNbImg;
    public static volatile CollectionAttribute<Restaurant, Menu> menuCollection;

}