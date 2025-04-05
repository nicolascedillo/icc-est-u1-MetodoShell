package controllers;

public class ShellSort{
    public void sort(int[] array, boolean isDes) {

        int n = array.length;
        int contCambios = 0;
        for (int gap = (n/2); gap>0; gap /= 2){
            System.out.println("Gap: " + gap);

            //Insercción
            for(int i = gap; i<n ; i++){
                int temp = array[i];
                int j = i;
                //Se desplaza temp a su posicion correcta en el gap
                if(isDes){
                    while (j>=gap && array[j-gap]>temp) {
                        array[j] = array[j-gap];
                        j -= gap;
                        contCambios++;
                    }
                }else{
                    while (j>=gap && array[j-gap]<temp) {
                        array[j] = array[j-gap];
                        j -= gap;
                        contCambios++;
                    }
                }
                array[j] = temp;
            }
            System.out.println(contCambios+" Cambios en gap " + gap);
            imprimirArreglo(array);
            contCambios = 0;
        }
    }

    public void imprimirArreglo(int[] array){
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i] + " , ");
        }
        System.out.println(" ");
    }
}