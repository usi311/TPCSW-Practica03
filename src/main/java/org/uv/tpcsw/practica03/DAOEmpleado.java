/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcsw.practica03;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author iker
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Long> {

    @Override
    public boolean save(Empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        session.save(pojo);
        t.commit();
        return true;
    }

    @Override
    public boolean delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    try {
        Empleado empleado = session.get(Empleado.class, id);
        if (empleado != null) {
            session.delete(empleado);
            tx.commit();
            return true;
        }
        return false;
    } catch (Exception e) {
        tx.rollback();
        e.printStackTrace();
        return false;
    } finally {
        session.close();
    }
    }

    @Override
    public boolean update(Empleado pojo, Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Empleado empleado = session.get(Empleado.class, id);
            if (empleado != null) {
                empleado.setClave(pojo.getClave());
                empleado.setNombre(pojo.getNombre()); // Aquí puedes modificar según los campos que necesites actualizar
                empleado.setDireccion(pojo.getDireccion());
                empleado.setTelefono(pojo.getTelefono());

                session.update(empleado);
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
    public List<Empleado> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Query<Empleado> query = session.createQuery("FROM Empleado", Empleado.class);
            List<Empleado> empleados = query.getResultList();
            t.commit();
            return empleados;
        } catch (Exception e) {
            t.rollback();
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }

    @Override
    public Empleado findById(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Empleado empleado = session.get(Empleado.class, id);
            t.commit();
            return empleado;
        } catch (Exception e) {
            t.rollback();
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

}
