package com.ejercicio3;

import javax.persistence.*;

//para almacenar en una base de datos
@Entity
@Table (name="Empleado")
public class Empleado {
        //atributos

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private Long id;
        @Column
        private String Nombre;
        @Column
        private String direccion;
        @Column
        private String poblacion;
        @Column
        private int codigo_postal;
        @Column
        private int tel;
        @Column
        private String puesto;
        @Column
        private String seccion;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        //constructores
        public Empleado() {
        }

        public Empleado(String nombre, String direccion, String poblacion,
                        int codigo_postal, int tel, String puesto, String seccion) {
                Nombre = nombre;
                this.direccion = direccion;
                this.poblacion = poblacion;
                this.codigo_postal = codigo_postal;
                this.tel = tel;
                this.puesto = puesto;
                this.seccion = seccion;
        }

        //getter y setter

        public String getNombre() {
                return Nombre;
        }

        public void setNombre(String nombre) {
                Nombre = nombre;
        }

        public String getDireccion() {
                return direccion;
        }

        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }

        public String getPoblacion() {
                return poblacion;
        }

        public void setPoblacion(String poblacion) {
                this.poblacion = poblacion;
        }

        public int getCodigo_postal() {
                return codigo_postal;
        }

        public void setCodigo_postal(int codigo_postal) {
                this.codigo_postal = codigo_postal;
        }

        public int getTel() {
                return tel;
        }

        public void setTel(int tel) {
                this.tel = tel;
        }

        public String getPuesto() {
                return puesto;
        }

        public void setPuesto(String puesto) {
                this.puesto = puesto;
        }

        public String getSeccion() {
                return seccion;
        }

        public void setSeccion(String seccion) {
                this.seccion = seccion;
        }
}
