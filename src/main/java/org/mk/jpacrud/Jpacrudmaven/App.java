package org.mk.jpacrud.Jpacrudmaven;

import org.mk.jpacrud.hibernate.CRUDOperations;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  CRUDOperations crudOperations = new CRUDOperations();
    	  crudOperations.insertEntity();
    	  crudOperations.findEntity();
    	  crudOperations.updateEntity();
    	  crudOperations.removeEntity();
    	 
    }
}
