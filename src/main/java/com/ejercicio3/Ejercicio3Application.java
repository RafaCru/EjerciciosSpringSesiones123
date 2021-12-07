package com.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
public class Ejercicio3Application {

	private static Object Sort;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);
		EmpleadoRepository repository=context.getBean(EmpleadoRepository.class);

		Empleado direccion =new Empleado("Rafael Garcia",
				"C/Vicente Blasco Ibañez 10",
				"Alcazar de San Juan", 46750, 963589575,
				"Secretario de direccion", "Administracion");

		Empleado produccion =new Empleado("Juan De Dios Garcia",
				"C/Aviacion 12",
				"San Juan", 44750, 985559575,
				"Ensamblador", "Ensamblaje");

		repository.save(direccion);

		repository.save(produccion);
		System.out.println("\n"+"El num de trabajadores en base de datos es: "+repository.count()+"\n");
		for (Empleado empleado:repository.findAll()){
			System.out.println(
					empleado.getNombre()
							+"\n"+empleado.getDireccion()
							+"\n"+empleado.getPoblacion()
							+"\n"+empleado.getCodigo_postal()
							+"\n"+empleado.getPuesto()
							+"\n"+empleado.getTel()
							+"\n"+empleado.getPuesto()
							+"\n\n"
			);
		}





	}
}
