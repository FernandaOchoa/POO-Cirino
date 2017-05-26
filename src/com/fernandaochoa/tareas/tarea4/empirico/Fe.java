package com.fernandaochoa.tareas.tarea4.empirico;

/**
 * Created by monsh on 04/05/2017.

public class Fe {

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    Date Fecha[] = new Date[100];
    Date actual, fe = null;
    String fecha2, distancia;
    int cuenta = 0, dias = 0, mes, año, num;

    boolean isDate(String fecha) {
        for (int i = 0; i < fecha.length() - 1; i++)
            if (fecha.charAt(i) == '/')
                continue;
            else if (fecha.charAt(i) < '0' || fecha.charAt(i) > '9')
                return false;
        return true;
    }//isDate

    public boolean StringtoDate(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            fe = sdf.parse(fecha);
            Fecha[cuenta] = fe;
            if (!sdf.format(fe).equals(fecha)) {
                d.display("Fecha invalida");
            }//if
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se aceptan valores numéricos");
            return false;
        }//catch
    }//StringtoDate

    void meta() {
        String aux = "Fecha:\n";
        p.out(aux);
        p.setVisible(true);
        String a = "\na)Capturar fechas en un arreglo de apunutadores";
        a += " a objetos con el formato dd/mm/yyyy y sugerir la";
        a += " fecha de hoy como omisión. Si el usuario da enter";
        a += " aceptela fecha actual de otro modo valide la fecha";
        a += " tecleada y acéptelas si es válida terminando la";
        a += " captura usando un dato centinela.";
        a += "\nb)Para cada par de fechas consecutivas en el arreglo";
        a += " determine la distancia en años, meses  y días entre ellas.";
        a += "\nc)Capture un número entero que represente un número de";
        a += " días posterior a cada fecha y con el determine en otro";
        a += " arreglo de fecha un conjunto igual a la fecha posterior";
        a += " transcurrido ese número de días.";
        a += "\nd)Calcule y despliegue el tiempo que se ejecuta la aplicación\n";
        p.out(a);
    }//meta

    void datos() throws ParseException {
        Date a = new Date();
        actual = a;
        String a1 = "Capture su fecha con formato dd/mm/yyyy, o enter";
        a1 += "\npara capturar la fecha actual ";
        fecha2 = d.readString(a1 + " o \"fin\": ");
        Fecha[cuenta] = new Date();
        while (!"fin".equals(fecha2) && cuenta < 100) {
            if ("".equals(fecha2)) {
                Fecha[cuenta] = actual;
                cuenta = cuenta + 1;
            } else if (fecha2.length() != 0 && isDate(fecha2)) {
                if (fecha2.length() == 10) {
                    StringtoDate(fecha2);
                    cuenta = cuenta + 1;
                } else {
                    d.display("Formato invalido");
                }
            } else {
                d.display("Formato invalido");
            }
            fecha2 = d.readString(a1 + " o \"fin\": ");
        }//while
        if (cuenta != 0) {
            String a2 = "Ingrese un número entero para calcular fechas";
            a2 += " posterias a las que fueron ingresadas anteriormente: ";
            num = Integer.parseInt(d.readString("a4"));
        }
    }//datos

    //inciso b
    boolean Bisiesto(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        año = calendar.get(Calendar.YEAR);
        if ((año % 400) == 0 || ((año % 4 == 0) && (año % 100 != 0)))
            return true;
        else return false;
    }//Bisiesto

    int DiaMes(Date fecha) {
        dias = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        mes = calendar.get(Calendar.MONTH);
        switch (mes + 1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (Bisiesto(fecha))
                    dias = 29;
                else
                    dias = 28;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
        }//switch
        return dias;
    }//DiaMes

    String Distancia(Date f, Date fe) {
        int aaño = 0, ddias = 0, mmes = 0, diaMes = 0;
        Calendar ca = Calendar.getInstance();
        ca.setTime(f);
        Calendar cafe = Calendar.getInstance();
        cafe.setTime(fe);

        if (!f.equals(fe))
            if (f.before(fe)) {
                aaño = cafe.get(Calendar.YEAR) - ca.get(Calendar.YEAR);
                if (ca.get(Calendar.MONTH) != cafe.get(Calendar.MONTH))
                    if (ca.get(Calendar.MONTH) < cafe.get(Calendar.MONTH))
                        mmes = cafe.get(Calendar.MONTH) - ca.get(Calendar.MONTH);
                    else {
                        mmes = cafe.get(Calendar.MONTH) + 12 - ca.get(Calendar.MONTH);
                        aaño = aaño - 1;
                    }//else
                else mmes = 0;
                if (ca.get(Calendar.DAY_OF_MONTH) != cafe.get(Calendar.DAY_OF_MONTH)){

                }
            }
    }
}//class Fe

*/