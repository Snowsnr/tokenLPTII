import java.util.Scanner;
public class Datos {
    public String nom, ra, ti, lad, col;
    public int vid, ed, op;
    public double sal, lar;
    public Scanner entrada = new Scanner (System.in);
    public void menu(){


        System.out.println("Que desea agregar");
        System.out.println("1. Gato");
        System.out.println("2. Perro");
        System.out.println("3. Conejo");
        System.out.println("4. Hamster");
        System.out.println("5. Huron");
        op = entrada.nextInt();
        switch(op){
            case 1:
            datosgato();
            break;
            case 2:
            datosperro();
            break;
            case 3:
            datosconejo();
            break;
            case 4:
            datoshamster();
            break;
            case 5:
            datoshuron();
            break;
            default:
            break;
        }
    }
    public void datosgato(){
        System.out.println("Introduce el nombre del gato");
        nom = entrada.next();
        System.out.println("Introduce la raza del gato");
        ra = entrada.next();
        System.out.println("Introduce el tipo de alimento del gato");
        ti=entrada.next();
        System.out.println("Introduce la edad del gato");
        ed = entrada.nextInt();
        System.out.println("Introduce las vidas del gato");
        vid = entrada.nextInt();
        Gato gato = new Gato();
        gato.setNombre(nom);
        gato.setEdad(ed);
        gato.setNum_vidas(vid);
        gato.setTipo_alimento(ti);
        gato.setRaza(ra);
        gato.mostrarGato();

    }
    public void datosperro(){
        System.out.println("Introduce el nombre del perro");
        nom = entrada.next();
        System.out.println("Introduce la raza del perro");
        ra = entrada.next();
        System.out.println("Introduce el tipo de alimento del perro");
        ti=entrada.next();
        System.out.println("Introduce la edad del perro");
        ed = entrada.nextInt();
        System.out.println("Introduce el tipo ladrido del perro");
        lad = entrada.next();
        Perro perro = new Perro();
        perro.setEdad(ed);
        perro.setLadrido(lad);
        perro.setNombre(nom);
        perro.setRaza(ra);
        perro.setTipo_alimento(ti);
        perro.mostrarPerro();
    }
    public void datosconejo(){
        System.out.println("Introduce el nombre del conejo");
        nom = entrada.next();
        System.out.println("Introduce la raza del conejo");
        ra = entrada.next();
        System.out.println("Introduce el tipo de alimento del conejo");
        ti=entrada.next();
        System.out.println("Introduce la edad del conejo");
        ed = entrada.nextInt();
        System.out.println("Introduce que tan alto salta el conejo en metros");
        sal = entrada.nextDouble();
        Conejo conejo = new Conejo();
        conejo.setEdad(ed);
        conejo.setNombre(nom);
        conejo.setRaza(ra);
        conejo.setSalto(sal);
        conejo.setTipo_alimento(ti);
        conejo.mostrarConejo();
    }
    public void datoshamster(){
        System.out.println("Introduce el nombre del hamster");
        nom = entrada.next();
        System.out.println("Introduce la raza del hamster");
        ra = entrada.next();
        System.out.println("Introduce el tipo de alimento del hamster");
        ti=entrada.next();
        System.out.println("Introduce la edad del hamster");
        ed = entrada.nextInt();
        System.out.println("Introduce el color del hamster");
        col = entrada.next();
        Hamster hamster = new Hamster();
        hamster.setColor(col);
        hamster.setEdad(ed);
        hamster.setNombre(nom);
        hamster.setRaza(ra);
        hamster.setTipo_alimento(ti);
        hamster.mostrarHamster();
    }
    public void datoshuron(){
        System.out.println("Introduce el nombre del huron");
        nom = entrada.next();
        System.out.println("Introduce la raza del huron");
        ra = entrada.next();
        System.out.println("Introduce el tipo de alimento del huron");
        ti=entrada.next();
        System.out.println("Introduce la edad del huron");
        ed = entrada.nextInt();
        System.out.println("Introduce cuanto mide el huron");
        lar = entrada.nextDouble();
        Huron huron = new Huron();
        huron.setEdad(ed);
        huron.setNombre(nom);
        huron.setRaza(ra);
        huron.setSalto(lar);
        huron.setTipo_alimento(ti);
        huron.mostrarHuron();
    }
}
