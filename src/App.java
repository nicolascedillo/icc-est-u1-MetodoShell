import controllers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] array = {-10,0,4,7,2,1,9,6,5};

        //Instancia
        ShellSort sS =  new ShellSort();

        sS.imprimirArreglo(array);
        System.out.println("\nOrden ascendente");
        sS.sort(array,true);
        sS.imprimirArreglo(array);

        System.out.println("\nOrden descendente");
        sS.sort(array, false);
        sS.imprimirArreglo(array);
    }   
}
