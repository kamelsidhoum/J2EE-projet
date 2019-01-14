package com.dauphine.entity.src;

import com.dauphine.entity.src.Annonce;
import com.dauphine.entity.src.HistoriqueReservation;
import com.dauphine.entity.src.Restaurant;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(UtilisateurProfessionnel.class)
public class UtilisateurProfessionnel_ { 

    public static volatile SingularAttribute<UtilisateurProfessionnel, Date> usproDate;
    public static volatile SingularAttribute<UtilisateurProfessionnel, String> usproMotPasse;
    public static volatile SingularAttribute<UtilisateurProfessionnel, String> usproNom;
    public static volatile CollectionAttribute<UtilisateurProfessionnel, HistoriqueReservation> historiqueReservationCollection;
    public static volatile CollectionAttribute<UtilisateurProfessionnel, Restaurant> restaurantCollection;
    public static volatile SingularAttribute<UtilisateurProfessionnel, String> usproMail;
    public static volatile SingularAttribute<UtilisateurProfessionnel, String> usproSiret;
    public static volatile SingularAttribute<UtilisateurProfessionnel, String> usproAdresse;
    public static volatile SingularAttribute<UtilisateurProfessionnel, Integer> usproId;
    public static volatile CollectionAttribute<UtilisateurProfessionnel, Annonce> annonceCollection;
    public static volatile SingularAttribute<UtilisateurProfessionnel, String> usproNumeroTel;
    public static volatile SingularAttribute<UtilisateurProfessionnel, String> usproPrenom;

}