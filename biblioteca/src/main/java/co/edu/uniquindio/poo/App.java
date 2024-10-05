package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Privada", "Cra22", "3158257895");
        Biblioteca.mostrarMensaje(biblioteca.toString()); 

        // Crear bibliotecarios (3 en total)
        Bibliotecario bibliotecario1 = new Bibliotecario("Juan Escobar", "123456", "3001234567", "juan@mail.com", 1000, 1);
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario1);
        Biblioteca.mostrarMensaje(bibliotecario1.toString()); 

        Bibliotecario bibliotecario2 = new Bibliotecario("Ruben Garcia", "9800937","3166167200", "RG@gmail.com", 1000, 3); 
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario2);
        Biblioteca.mostrarMensaje(bibliotecario2.toString());

        Bibliotecario bibliotecario3 = new Bibliotecario("Ana", "24675412", "3158869571", "AnaBiblioteca@gmail.com", 1200, 5);
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario3);
        Biblioteca.mostrarMensaje(bibliotecario3.toString());


        // Crear estudiantes (3 en total)
        Estudiante estudiante1 = new Estudiante("YEIMY", "1235", "3172732552", "JSJSJ@Gmail", "ingenieria", 4);
        biblioteca.agregarEstudianteABiblioteca(estudiante1);
        Biblioteca.mostrarMensaje(estudiante1.toString());

        Estudiante estudiante2 = new Estudiante("Michael Ruiz", "985475632", "3225764852", "MichaelR@gmail.com", "Medicina", 5); 
        biblioteca.agregarEstudianteABiblioteca(estudiante2);
        Biblioteca.mostrarMensaje(estudiante2.toString());

        Estudiante estudiante3  = new Estudiante("Daniel Felipe", "246754822", "31587456633", "DanielF@gmail.com", "Ingenieria", 2);
        biblioteca.agregarEstudianteABiblioteca(estudiante3);
        Biblioteca.mostrarMensaje(estudiante3.toString()); 

        // Crear libros (3 en total)
        Libro libro1 = new Libro("123", "LL8930L22L7551", "yizack", "¿No puedes olvidar a tu ex? Yo te enseño", LocalDate.now(), 15,0);
        biblioteca.agregarLibroABiblioteca(libro1);
        Biblioteca.mostrarMensaje(libro1.toString());

        Libro libro2 = new Libro("888554", "8455ASSDC65W5", "Daniela", "Psicologia Oscura", LocalDate.of(12, 3, 24), 15, 5); 
        biblioteca.agregarLibroABiblioteca(libro2);
        Biblioteca.mostrarMensaje(libro2.toString());

        Libro libro3 = new Libro("7899633", "AWE589A6S5A62", "Gabriel Montoya", "Tu mentalidad, tu victoria", LocalDate.of(22, 4, 24), 4, 3);
        biblioteca.agregarLibroABiblioteca(libro3);
        Biblioteca.mostrarMensaje(libro3.toString());


        // Crear un préstamo
        Prestamo prestamo1 = new Prestamo(estudiante1, 4, bibliotecario1);
        prestamo1.adicionarLibro(libro1);
        Biblioteca.mostrarMensaje(prestamo1.toString());

        Prestamo prestamo2 = new Prestamo(estudiante2, 2, bibliotecario2); 
        prestamo2.adicionarLibro(libro2);
        Biblioteca.mostrarMensaje(prestamo2.toString());
    
        
        
    }

 }