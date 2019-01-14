package com.dauphine.entity.src;

import com.dauphine.entity.src.Menu;
import com.dauphine.entity.src.Reservation;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(ElementMenu.class)
public class ElementMenu_ { 

    public static volatile SingularAttribute<ElementMenu, Reservation> elemnResId;
    public static volatile SingularAttribute<ElementMenu, Double> elemnPrix;
    public static volatile SingularAttribute<ElementMenu, Boolean> elemnDisponibilite;
    public static volatile SingularAttribute<ElementMenu, Integer> elemnId;
    public static volatile SingularAttribute<ElementMenu, String> elemnNom;
    public static volatile SingularAttribute<ElementMenu, Menu> elemnMnId;
    public static volatile SingularAttribute<ElementMenu, Date> elemnDate;

}