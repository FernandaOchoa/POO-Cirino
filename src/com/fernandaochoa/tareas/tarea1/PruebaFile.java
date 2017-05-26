package com.fernandaochoa.tareas.tarea1;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Date;

/* PruebaFile.java
Instituto Tecnológico de León
Ingeniería en Sistemas Computacionales
Programación Orientada a Objetos
Horario: Mar y Jue 7:00 - 8:45
         Vie 7:50 - 8:40
Nombre de la alumna: Guzmán Hernández, Francisco
                     Ibarra Muñoz, Arantxa Patricia
                     Ramírez Ochoa, Fernanda Monserrat
                     Rodríguez Borja, Flor Paulina

Foto digital de la alumna:
Tarea #: 1
Fecha de entrega: indefinida
Fecha de entrega real:
 */
public class PruebaFile {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String a;
    File fi = new File("C://Hola.txt");
    File f = new File("test.txt");
    File f1 = new File("File/test1.txt");
    int menu, boo, r, value, v;
    String path = "", aux;
    boolean bool;
    long b, millisec;
    File f2 = null;

    void inicio() {
        aux = "File";
        aux += ("\nPara mostrar las prestaciones de la clase File.");
        p.out(aux);
        p.setVisible(true);
    }

    void datos() {
        do {
            a = d.readString("Ingresa el nombre del archivo: ");
        } while (a.length() == 0);
    }

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se admiten valores numericos.");
        }
        return false;
    }

    void calculos() {
    }//no hay.

    void showString() throws IOException {
        path = fi.getAbsolutePath();
        d.display("El sendero de busqueda es: " + path);

        path = fi.getCanonicalPath();
        d.display("El canonical path es: " + path);

        path = fi.getName();
        d.display("El nombre del archivo es: " + path);

        path = fi.getParent();
        fi.getParent();
        d.display("El parent del archivo es: " + path);

        path = fi.getPath();
        d.display("El sendero del archivo es: " + path);

        path = fi.toString();
        d.display("El toString del archivo es: " + path);
    }

    void showPredicados() {
        bool = fi.canExecute();
        d.display("¿Es ejecutable?: " + bool);

        bool = fi.canRead();
        d.display("¿Se puede leer?: " + bool);

        bool = fi.canWrite();
        d.display("¿Se puede escribir?: " + bool);

        bool = fi.equals(p);
        d.display("¿Es igual?: " + bool);

        bool = fi.exists();
        d.display("¿Existe el archivo?: " + bool);

        bool = fi.isAbsolute();
        d.display("¿El archivo es absoluto?: " + bool);

        bool = fi.isDirectory();
        d.display("¿Es un directorio?: " + bool);

        bool = fi.isFile();
        d.display("¿Es un archivo?: " + bool);

        bool = fi.isHidden();
        d.display("¿Es un archivo oculto?: " + bool);
    }

    void showMutativos() throws IOException {
        bool = f.createNewFile();
        d.display("¿Se creo el archivo?: " + bool);

        bool = f.delete();
        d.display("¿Se elimino el archivo?: " + bool);

        bool = f.mkdir();
        d.display("¿mkdir() funciono con exito?: " + bool);

        bool = f.mkdirs();
        d.display("¿mkdirs() funciono con exito?: " + bool);

        bool = f.renameTo(fi);
        d.display("¿El archivo fue renombrado con exito?: " + bool);

        bool = f.setExecutable(true, true);
        d.display("¿setExecutable() funciono con exito?: " + bool);

        bool = f.setExecutable(true);
        d.display("¿setExecutable() funciono con exito?: " + bool);

        bool = f.setLastModified(menu);
        d.display("¿setLastModified() funciono con exito?: " + bool);

        bool = f.setReadable(true, true);
        d.display("¿setReadable() funciono con exito?: " + bool);

        bool = f.setReadable(true);
        d.display("¿setReadable() funciono con exito?: " + bool);

        bool = f.setReadOnly();
        d.display("¿setReadble() funciono con exito?: " + bool);

        bool = f.setWritable(true, true);
        d.display("¿setWritable() funciono con exito?: " + bool);

        bool = f.setWritable(true);
        d.display("¿setWritable() funciono con exitoE?: " + bool);
    }

    void showInt() {
        value = f.compareTo(f1);
        d.display("Lexicograficamente, "
                + "\nel nombre del sendero es test.txt");

        v = fi.hashCode();
        d.display("El codigo hash para este sendero es: " + v);
    }

    void showLong() {
        b = f.getFreeSpace();
        d.display("Numero de bytes sin asignacion: " + b);

        b = f.getTotalSpace();
        d.display("Espacio total: " + b);

        b = f.getUsableSpace();
        d.display("Numero de bytes disponibles: " + b);

        millisec = f.lastModified();
        Date dt = new Date(millisec);
        path = f.getPath();
        d.display(path + " fue modificado por ultima vez en: " + dt);

        b = f.length();
        d.display(path + " tiene un tamaño de: " + b);
    }

    void showFile() throws IOException {
        f1 = f.getAbsoluteFile();
        path = f1.getAbsolutePath();
        d.display("¿" + path + " existe?:\n" + bool);

        f1 = f.getCanonicalFile();
        path = f1.getAbsolutePath();
        d.display("¿" + path + " existe?:\n" + bool);

        f1 = f.getParentFile();
        d.display("Sendero del archivo parent : " + v);
    }

    void showMisc() throws IOException {
        String[] paths;
        paths = fi.list();
        if (paths != null)
            for (int i = 0; i < paths.length; i++) {
                System.out.println(paths[i]);
            }

        File[] paths2;
        paths2 = fi.listFiles();
        if (paths2 != null)
            for (int i = 0; i < paths2.length; i++) {
                System.out.println(paths2[i]);
            }

        File f = File.createTempFile("tmp", ".txt");
        System.out.println("Sendero de archivo: " + f.getAbsolutePath());
        f.deleteOnExit();
        f = File.createTempFile("tmp", null);
        System.out.println("Sendero de archivo: " + f.getAbsolutePath());

        System.out.println(fi.toPath());
        System.out.println(fi.toPath().getClass());

        File[] paths3;
        paths3 = File.listRoots();
        for (File path : paths3) {
            System.out.println(path);
        }

        f = new File("c:/java test.txt");
        URI uri;
        bool = f.exists();
        if (bool) {
            uri = f.toURI();
            System.out.println("uri: " + uri);
        }

        File fi3 = new File("c:/a/b/a/test.txt");
        URL url;
        try {
            url = f.toURL();
            System.out.println("url: " + url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    void resultados() throws IOException {
        //depende de la prestacion que sea eligida
    }

    void navegabilidad() throws IOException {
        while (menu != 7) {
            do aux = d.readString(
                    "¿Qué tipo de método deseas probar con el archivo elegido?"
                            + "\n\t1. String"
                            + "\n\t2. Boolean"
                            + "\n\t3. Int"
                            + "\n\t4. Long"
                            + "\n\t5. File"
                            + "\n\t6. Miscelaneo"
                            + "\n\t7. Salir");
            while (!isNum(aux));
            menu = Integer.parseInt(aux);

            switch (menu) {
                case 1:
                    try {
                        showString();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    break;
                case 2:
                    aux = d.readString("¿Qué tipo de método Boolean deseas probar?"
                            + "\n1. Predicado"
                            + "\n2. Mutativo");
                    boo = Integer.parseInt(aux);
                    if (boo == 1) {
                        showPredicados();
                    }
                    if (boo == 2) {
                        try {
                            showMutativos();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    showInt();
                    break;
                case 4:
                    showLong();
                    break;
                case 5:
                    try {
                        showFile();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        showMisc();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        PruebaFile pf = new PruebaFile();

        pf.inicio();
        pf.datos();
        pf.calculos();
        pf.resultados();
        pf.navegabilidad();
    }//main}
}
