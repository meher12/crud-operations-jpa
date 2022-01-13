package org.mk.jpacrud.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.mk.jpacrud.entity.BankAccount;
import org.mk.jpacrud.hibernate.JPAUtil;;

/**
 *  JPA CRUD Operations
 * @author Meher Khemiri
 *
 */
public class CRUDOperations {
	
	
	
    public void insertEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        System.out.println("********** Insert Entity ********** ");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("Moul");
        bankAccount.setSalary(2000);
        entityManager.persist(bankAccount);
        entityManager.getTransaction().commit();
        entityManager.close();
       
    }

    public void findEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        
        System.out.println("********** Find Entity ********** ");
        BankAccount bankAccount = entityManager.find(BankAccount.class, 11);
        System.out.println("account id :: " + bankAccount.getId());
        System.out.println("account name :: " + bankAccount.getName());
        System.out.println("account balance :: " + bankAccount.getSalary());
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        
        System.out.println("********** Update Entity ********** ");
        BankAccount bankAccount = entityManager.find(BankAccount.class, 9);
        System.out.println("account id :: " + bankAccount.getId());
        System.out.println("account name :: " + bankAccount.getName());
        System.out.println("account balance :: " + bankAccount.getSalary());

        // The entity object is physically updated in the database when the transaction
        // is committed
        bankAccount.setName("Ronaldo");
        bankAccount.setSalary(3000);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        
        System.out.println("********** Remove Entity ********** ");
        BankAccount bankAccount = entityManager.find(BankAccount.class, 12);
        System.out.println("account id :: " + bankAccount.getId());
        System.out.println("account name :: " + bankAccount.getName());
        System.out.println("account balance :: " + bankAccount.getSalary());
        entityManager.remove(bankAccount);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}