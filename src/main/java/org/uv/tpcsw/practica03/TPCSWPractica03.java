package org.uv.tpcsw.practica03;

import java.util.List;
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
            empleado.setNombre("Evelia");
            empleado.setDireccion("Calle 22");
            empleado.setTelefono("2322344");
            empleado.setDepto(dep); 

            Set<Empleado> lstEmpleado = dep.getEmpleados();
            lstEmpleado.add(empleado);
            
                session.save(empleado);

            for (Empleado emp : lstEmpleado) {
                System.out.println("Clave: " + emp.getClave() + " Nombre: " + emp.getNombre());
            }
           
//              DAOEmpleado daoEmpleado = new DAOEmpleado();
//
//                Long idEmpleado = empleado.getClave();
//            Empleado empleadoEncontrado = daoEmpleado.findById(idEmpleado);
//
//            
//            if (empleadoEncontrado != null) {
//                System.out.println("Empleado encontrado: " + empleadoEncontrado.getNombre());
//            } else {
//                System.out.println("Empleado no encontrado.");
//            }
//            
//              System.out.println("Lista de empleados del departamento:");
//            for (Empleado emp : lstEmpleado) {
//                System.out.println("Clave: " + emp.getClave() + " Nombre: " + emp.getNombre());
//            }
//
//           
//            System.out.println("\nLista de todos los empleados registrados:");
//            List<Empleado> todosEmpleados = daoEmpleado.findAll();
//
//            if (todosEmpleados != null && !todosEmpleados.isEmpty()) {
//                for (Empleado emp : todosEmpleados) {
//                    System.out.println("ID: " + emp.getClave() + ", Nombre: " + emp.getNombre() +
//                                       ", Dirección: " + emp.getDireccion() + ", Teléfono: " + emp.getTelefono());
//                }
//            } else {
//                System.out.println("No hay empleados registrados.");
//            }
//        } else {
//            System.out.println("Departamento no encontrado.");
//        }
//         Departamento departamento=new Departamento();
//        departamento.setNombre("Administracion");
//        SessionFactory sf=HibernateUtil.getSessionFactory();
//        Session session=sf.getCurrentSession();
//        Transaction t = session.beginTransaction();
//        session.save(departamento);
//        t.commit();
//        
        
        
        }

        // Confirmar la transacción
        t.commit();
    }
}
