/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Main {
    public static void main(String [] args){
       //creacion de temas 
       Temas tema1 = new Temas("Introduccion a la programacion","Aprender lo basico","base1",124,72.0f);
       Temas tema2 = new Temas("Introduccion a la programacion2","Aprender lo basico","base2",378,14.0f);
       Temas tema3 = new Temas("Introducciona a la programacion 3","Aprender lo basico","base3",24,54.0f);
       Temas tema4 = new Temas("Introduccion a la programacion 4","Aprender lo basico","base4",12,74.0f);
       Temas tema5 = new Temas("Introduccion a la programacion 5","Aprender lo basico","base5",72,84.0f);
       Temas tema6 = new Temas("Introduccion a la programacion 6","Aprender lo basico","base6",48,94.0f);
       Temas tema7 = new Temas("Introduccion a la programacion7","Aprender lo basico","base7",12,124.0f);
       
       //creacion de cursos
       
       Curso curso= new Curso("programacion 1");
       curso.addTemas(tema1);
       curso.addTemas(tema2);
       curso.addTemas(tema3);
       Curso curso1= new Curso("programacion 2");
       curso.addTemas(tema1);
       curso.addTemas(tema2);
       curso.addTemas(tema3);
       curso.addTemas(tema4);
       curso.addTemas(tema5);
       
       Curso curso2= new Curso("programacion 3");
       curso.addTemas(tema1);
       curso.addTemas(tema2);
       curso.addTemas(tema3);
       curso.addTemas(tema6);
       curso.addTemas(tema7);
       
       Curso curso3= new Curso("programacion 5");
       
       curso.addTemas(tema1);
       curso.addTemas(tema2);
       curso.addTemas(tema3);
        curso.addTemas(tema4);
       Curso curso4= new Curso("programacion web");
        curso.addTemas(tema1);
       curso.addTemas(tema2);
       curso.addTemas(tema3);
        curso.addTemas(tema4);
        curso.addTemas(tema5);
       
        //creacion de carreras
        
        Carrera carrera1 =new Carrera("Ingenieria de Sistemas","Proyecto de grado");
        carrera1.addCurso(curso);
        carrera1.addCurso(curso1);
        
        Carrera carrera2 =new Carrera("Ingenieria en Ciencias de la Computacion","Proyecto de grado");
        carrera2.addCurso(curso2);
        carrera2.addCurso(curso3);
        
       Carrera carrera3=new Carrera("Ingenieria en TI","Proyecto de grado");
       carrera3.addCurso(curso4);
       
        System.out.println("temas:"+tema1.getCosto()+"Bs"+", Curso"+curso.getCosto()+"Bs"+", Carrera"+carrera1.getCosto()+"Bs");
        System.out.println("***************************************************************");
        System.out.println("temas:"+tema1.getDuracion()+"Hrs"+", Curso"+curso.getDuracion()+"Hrs"+", Carrera"+carrera1.getDuracion()+"Hrs");
        System.out.println("***************************************************************");
       
    }
    
}
