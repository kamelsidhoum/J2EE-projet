package com.dauphine.entity.src;

import com.dauphine.entity.src.Annonce;
import com.dauphine.entity.src.ElementMenu;
import com.dauphine.entity.src.HistoriqueReservation;
import com.dauphine.entity.src.Utilisateurparticulier;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(Reservation.class)
public class Reservation_ { 

    public static volatile SingularAttribute<Reservation, Date> resaDate;
    public static volatile SingularAttribute<Reservation, Integer> resaId;
    public static volatile CollectionAttribute<Reservation, HistoriqueReservation> historiqueReservationCollection;
    public static volatile SingularAttribute<Reservation, Utilisateurparticulier> resaUsparId;
    public static volatile CollectionAttribute<Reservation, ElementMenu> elementMenuCollection;
    public static volatile SingularAttribute<Reservation, String> resaHoraire;
    public static volatile CollectionAttribute<Reservation, Annonce> annonceCollection;

}