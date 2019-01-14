package com.dauphine.entity.src;

import com.dauphine.entity.src.Reservation;
import com.dauphine.entity.src.Restaurant;
import com.dauphine.entity.src.UtilisateurProfessionnel;
import com.dauphine.entity.src.Utilisateurparticulier;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(HistoriqueReservation.class)
public class HistoriqueReservation_ { 

    public static volatile SingularAttribute<HistoriqueReservation, UtilisateurProfessionnel> histUserproId;
    public static volatile SingularAttribute<HistoriqueReservation, String> histHeure;
    public static volatile SingularAttribute<HistoriqueReservation, Restaurant> histRestoId;
    public static volatile SingularAttribute<HistoriqueReservation, Integer> histId;
    public static volatile SingularAttribute<HistoriqueReservation, Date> histDate;
    public static volatile SingularAttribute<HistoriqueReservation, Integer> histnbPersonne;
    public static volatile SingularAttribute<HistoriqueReservation, Reservation> histResaId;
    public static volatile SingularAttribute<HistoriqueReservation, Utilisateurparticulier> histUserparId;

}