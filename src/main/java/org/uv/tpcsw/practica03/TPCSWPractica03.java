package org.uv.tpcsw.practica03;

import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPCSWPractica03 {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();

    
        Departamento dep = session.get(Departamento.class, 1L);
        if (dep != null) {
            System.out.println("Clave: " + dep.getClave() + " Nom: " + dep.getNombre());

        
            Empleado empleado = new Empleado();
            empleado.setNombre("Eduardo");
            empleado.setDireccion("Calle 20");
            empleado.setTelefono("2322323");
            empleado.setDepto(dep); 

            Set<Empleado> lstEmpleado = dep.getEmpleados();
            lstEmpleado.add(empleado);

        
            session.save(empleado);

            for (Empleado emp : lstEmpleado) {
                System.out.println("Clave: " + emp.getClave() + " Nombre: " + emp.getNombre());
            }
        }

        // Confirmar la transacción
        t.commit();
    }
}
