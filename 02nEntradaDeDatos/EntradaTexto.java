//esto es un comentario

/**
 * Todo programa en java debe tener el nombre de la clase tal cual como el
 * archivo
 */

class EntradaTexto {
   // los limites de la clase

   // toda la clase debe tener un metodo principal
   // **Vamos a realizar un programa mediante el cual podemos introducir texto a
   // nuestra conveniencia */
   public static void main(String[] args) {
      // tipo de dato
      String nombre;
      // el ; es el fin de la linea
      int edad;
      // Instancia

      System.out.println("Por favor introducte tu nombre asi bien kawaii");

      // vamos a obtener el nombre del usuario

      nombre = System.console().readLine();
      System.out.println("Hola " + nombre + " bienvenido a tu programita");

      System.out.println("Por favor introduce tu edad");

      edad = Integer.parseInt(System.console().readLine());

      System.out.println("Hola " + nombre + " bienvenido a tu programita tienes " + edad);
   }

}