package org.uv.tpcsw.practica03;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DAODepartamento implements IDAOGeneral<Departamento, Long> {

    @Override
    public boolean save(Departamento pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            session.save(pojo);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Departamento depto = session.get(Departamento.class, id);
            if (depto != null) {
                session.delete(depto);
                t.commit();
                return true;
            } else {
                t.rollback();
                return false;
            }
        } catch (Exception e) {
            t.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(Departamento pojo, Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Departamento depto = session.get(Departamento.class, id);
            if (depto != null) {
                depto.setNombre(pojo.getNombre());
                depto.setEmpleados(pojo.getEmpleados()); 

                session.update(depto);
                t.commit();
                return true;
            } else {
                t.rollback();
                return false;
            }
        } catch (Exception e) {
            t.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Departamento> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();
    Transaction t = session.beginTransaction();

    try {
      List<Departamento> departamentos = session.createQuery("from Departamento", Departamento.class).list();
        t.commit();
        return departamentos;
    } catch (Exception e) {
        if (t != null) t.rollback();
        e.printStackTrace(); 
        return null;
    } finally {
        session.close();
    }
    }

    @Override
    public Departamento findById(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Departamento depto = session.get(Departamento.class, id);
            t.commit();
            return depto;
        } catch (Exception e) {
            t.rollback();
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
}
