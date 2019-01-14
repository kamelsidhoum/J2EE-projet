package com.dauphine.entity.src;

import com.dauphine.entity.src.HistoriqueReservation;
import com.dauphine.entity.src.Notation;
import com.dauphine.entity.src.Reservation;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(Utilisateurparticulier.class)
public class Utilisateurparticulier_ { 

    public static volatile SingularAttribute<Utilisateurparticulier, Integer> usparId;
    public static volatile SingularAttribute<Utilisateurparticulier, String> usparMail;
    public static volatile CollectionAttribute<Utilisateurparticulier, Notation> notationCollection;
    public static volatile CollectionAttribute<Utilisateurparticulier, HistoriqueReservation> historiqueReservationCollection;
    public static volatile SingularAttribute<Utilisateurparticulier, String> usparMotPasse;
    public static volatile SingularAttribute<Utilisateurparticulier, Date> usparDate;
    public static volatile SingularAttribute<Utilisateurparticulier, String> usparNumeroTel;
    public static volatile SingularAttribute<Utilisateurparticulier, String> usparNom;
    public static volatile CollectionAttribute<Utilisateurparticulier, Reservation> reservationCollection;
    public static volatile SingularAttribute<Utilisateurparticulier, String> usparPrenom;

}