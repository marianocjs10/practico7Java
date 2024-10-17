import java.util.ArrayList;
import java.util.Scanner;
public class CargaNotas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean salir = true;
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        while(salir){
            System.out.println("Ingrese:\n1) Cargar alumno\n2) Salir");
            int menu = sc.nextInt();
            if(menu == 1){
                alumnos.add(cargaA());
            } else if (menu==2) {
                salir=false;
            }else{
                System.out.println("Opcion invalida o Carga vacia.");
            }
        }
        for(Alumno alum : alumnos){
            System.out.println("-------------------------------");
            System.out.println("Nombre del alumno: "+alum.getNombreCompleto());
            System.out.println("N° de legajo: "+alum.getLegajo());
            System.out.println("Catedra: "+alum.getNota().getCatedra());
            System.out.println("Nota: "+alum.getNota().getNotaExamen());
        }
    }


    public static Alumno cargaA(){
        sc.nextLine();
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno: ");
        alumno.setNombreCompleto(sc.nextLine().toUpperCase());
        System.out.println("Ingrese el legajo del alumno: ");
        alumno.setLegajo(sc.nextLong());
        alumno.setNota(cargaN());
        return alumno;
    }

    public static Nota cargaN(){
        Nota nota = new Nota();
        sc.nextLine();
        System.out.println("Ingrese la catedra: ");
        nota.setCatedra(sc.nextLine());
        System.out.println("Ingrese la nota: ");
        nota.setNotaExamen(sc.nextDouble());
        return nota;
    }
}
