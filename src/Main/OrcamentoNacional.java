package Main;

import Controller.CidadeController;
import Model.Estado;
import View.Principal;
import java.util.List;
import javax.swing.JFrame;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class OrcamentoNacional {
    public static void main(String[] args) {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction lx = session.beginTransaction(); 
       JFrame Principal = new Principal();
       Principal.setVisible(true);        
    }
}