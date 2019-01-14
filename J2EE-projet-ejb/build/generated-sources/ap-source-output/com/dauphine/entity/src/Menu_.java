package com.dauphine.entity.src;

import com.dauphine.entity.src.ElementMenu;
import com.dauphine.entity.src.Restaurant;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-14T17:56:40")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, Double> menuPrix;
    public static volatile SingularAttribute<Menu, Integer> menuReduction;
    public static volatile CollectionAttribute<Menu, ElementMenu> elementMenuCollection;
    public static volatile SingularAttribute<Menu, String> menuNom;
    public static volatile SingularAttribute<Menu, Integer> menuId;
    public static volatile SingularAttribute<Menu, Date> menuDateCreation;
    public static volatile SingularAttribute<Menu, Boolean> menuDisponible;
    public static volatile SingularAttribute<Menu, Integer> menuAnnId;
    public static volatile SingularAttribute<Menu, Restaurant> menuResId;
    public static volatile SingularAttribute<Menu, Date> menuDateAjout;

}