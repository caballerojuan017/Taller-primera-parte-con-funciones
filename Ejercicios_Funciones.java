import java.util.Locale;
import java.util.Scanner;

public class Ejercicios {
    
    public static void calcularPromedioEdades() {

        Scanner scanner = new Scanner (System.in);

        int edad1, edad2, edad3;
        int promedio;

        System.out.println("Ingrese la edad de la persona 1: ");
        edad1 = scanner.nextInt();

        System.out.println("Ingrese la edad de la persona 2: ");
        edad2 = scanner.nextInt();

        System.out.println("Ingrese la edad de la persona 3: ");
        edad3 = scanner.nextInt();

        promedio = (edad1 + edad2 + edad3) / 3;


        System.out.println("El promedio de las 3 edades es: " + promedio);


        scanner.close();
    }


    public static void calcularGananciaBanco() {
        Scanner scanner = new Scanner (System.in);

    int inversionMonto = 0;
    int mesesInversion = 0;
    int porcentajeInteres = 2;
    int gananciaTotalInversion = 0;

    System.out.println("Ingrese el monto que desea invertir: " );
    inversionMonto = scanner.nextInt();

    System.out.println("Ingrese meses de inversion: ");
    mesesInversion = scanner.nextInt();


    gananciaTotalInversion = (inversionMonto * porcentajeInteres)/100 * mesesInversion;

    System.out.println("la ganancia total de su inversion es; " + gananciaTotalInversion);

    
    scanner.close();

    }


    public static void calcularComisiones() {

        Scanner scanner = new Scanner(System.in);

        int sueldoBase = 1200000;
        int comision = 10;
        int ventasMes = 0;
        int sueldoTotal = 0;
    
    
        System.out.println("Ingrese ventas realizadas en el mes:" );
        ventasMes = scanner.nextInt();
    
        sueldoTotal = (sueldoBase * comision) / 100 * ventasMes + sueldoBase;
        
        System.out.println("Sueldo total por comisiones: " + sueldoTotal); 
    
        scanner.close();
    }


    public static void calcularDescuento() {

        Scanner scanner = new Scanner(System.in);

        int descuento= 0;
        int totalCompra= 0;
        int totalFinal= 0;
    
        System.out.println("Ingrese monto de compra total: ");
        totalCompra= scanner.nextInt();

        descuento= totalCompra * (15) / 100;
        totalFinal= totalCompra - descuento;
        System.out.println("Valor total de la compra con descuento: " + totalFinal);

        scanner.close();

    }

    public static void calcularNotaFinal() {

        Scanner scanner= new Scanner (System.in);

        double calificacionFinal= 0;
        double primerNota, segundaNota, tercerNota= 0;
        double promedioCalificaciones= 0;
        double calificacionExamenFinal= 0;
        double calificacionTrabajoFinal= 0;

    System.out.println("Ingrese primer nota parcial: ");
    primerNota= scanner.nextDouble();

    System.out.println("Ingrese segunda nota parcial: ");
    segundaNota= scanner.nextDouble();

    System.out.println("Ingrese tercer nota parcial: ");
    tercerNota= scanner.nextDouble();

    promedioCalificaciones= (primerNota + segundaNota + tercerNota) / 3;
    
    System.out.println("Ingrese calificacion de examen final: ");
    calificacionExamenFinal= scanner.nextDouble();
    
    System.out.println("Ingrese calificacion de trabajo final: ");
    calificacionTrabajoFinal= scanner.nextDouble();

    
    calificacionFinal = (promedioCalificaciones * 0.55) + (calificacionExamenFinal * 0.30) + (calificacionTrabajoFinal * 0.15);
    System.out.printf("Su calificación final es: %.1f", calificacionFinal);

        scanner.close();
    }


    public static void calcularPorcentajeHombresMujeres() {

        Scanner scanner = new Scanner (System.in);

        double mujeres= 0;
        double hombres= 0;
        double totalEstudiantes= 0;
        double porcetajeHombre= 0;
        double porcentajeMujer= 0;


        System.out.println("Ingrese numero de estudiantes: ");
        totalEstudiantes= scanner.nextDouble();
        
        System.out.println("Ingrese numero de estudiantes hombres: ");
        hombres= scanner.nextDouble();

        System.out.println("Ingrese numero de estudiantes mujeres: ");
        mujeres= scanner.nextDouble();

        porcentajeMujer= (mujeres/totalEstudiantes) * 100;
        System.out.printf("El porcentaje de mujeres en el aula es de: %.1f%%%n", porcentajeMujer,"%");


        porcetajeHombre= (hombres/totalEstudiantes) * 100;
        System.out.printf("El porcentaje de hombres en el aula es de: %.1f%%%n",  porcetajeHombre,"%");

        scanner.close();

    }


    public static void conversionPulgadasPies() {

        Scanner scanner = new Scanner(System.in);

        double pulgadas = 39.27; 
        double pies = 12;
        int Metros = 0;
        double resultado1 = 0;
        double resultado2 = 0;

        System.out.print("Ingrese el número de metros a convertir a pulgadas y pies: ");
        Metros = scanner.nextInt();

        resultado1 = Metros * pulgadas; 
        resultado2 = resultado1 / pies;

        System.out.println(Metros + " metros son " +  resultado2 + " pies y " + (resultado1) + " pulgadas");

        scanner.close();
    }


    public static void calcularAreaTriangulo() {

        Scanner scanner = new Scanner (System.in);

        double a= 0;
        double b= 0;
        double c= 0;
        double p= 0;
        double resultadoMultipliacion= 0;
        double areaTriangulo= 0;
        
        System.out.println("Ingrese la primera longuitud de uno de los lados: ");
        a= scanner.nextDouble();

        System.out.println("Ingrese la segunda longuitud de uno de los lados: ");
        b= scanner.nextDouble();

        System.out.println("Ingrese la tercera longuitud de uno de los lados: ");
        c= scanner.nextDouble();

        p= (a+b+c) / 2;
        resultadoMultipliacion= p * (p-a) * (p-b) * (p-c);
        areaTriangulo= Math.sqrt(resultadoMultipliacion);

        System.out.printf("El area del triangulo es  %.2f cm²%n", areaTriangulo);

        scanner.close();
    }


    public static void calcularSalarioNeto() {

        Scanner scanner =new Scanner (System.in);

        int numeroHoras= 0;
        int precioHora= 0;
        int descuentoFijo= 20;
        int salario= 0;
        int salarioNeto= 0;

        System.out.println("Ingrese numero de horas trabajadas: ");
        numeroHoras= scanner.nextInt();

        System.out.println("Ingrese numero de precio de hora trabajada: ");
        precioHora= scanner.nextInt();

        salario= numeroHoras * precioHora;
        salarioNeto= salario - (salario * descuentoFijo / 100);
        
        System.out.println("El salario neto del trabajador es: " + salarioNeto);

        scanner.close();

    }


    public static void calcularCambioDivisas() {

        Scanner scanner =new Scanner (System.in);


        double precioChelinesAustriacos= 9568.71;
        double precioDolar= 122499;
        double precioDracmaGriegos= 886.07;
        //double precioFrancosBelgas= 3327.28;//
        double precioFrances= 20110;
        //double precioLibraEsterlina= 178938;//
        double precioLirasItalianas= 92.89;
        int chelinesPesetas= 0;
        double dracmaFrancos= 0;
        double pesetasItaliana= 0;
        double pesetasDolar= 0;
        double chelinesPesetasR, dracmaFrancosR, pesetasDolarR, pesetasItalianaR ;

        System.out.println("Ingrese chelines austriacos a convertir a pesetas: ");
        chelinesPesetas= scanner.nextInt();

        chelinesPesetasR= precioChelinesAustriacos * chelinesPesetas; 
        System.out.printf("%d chelines austriacos son %.2f pesetas%n", chelinesPesetas, chelinesPesetasR);

        System.out.print("Ingrese cantidad de dracmas griegos a convertir a franco frances: ");
        dracmaFrancos = scanner.nextDouble();

        dracmaFrancosR = precioDracmaGriegos / precioFrances * dracmaFrancos;
        System.out.printf("%.2f dracmas griegos equivalen a %.2f francos franceses%n", dracmaFrancos, dracmaFrancosR);

        System.out.print("\nIngrese cantidad de pesetas a convertir a dólares y liras italianas: ");
        pesetasDolar = scanner.nextDouble();

        pesetasDolarR = pesetasDolar / precioDolar;
        pesetasItalianaR = (pesetasItaliana * 100) / precioLirasItalianas;
        System.out.printf("%.2f pesetas equivalen a %.2f dólares%n", pesetasDolar, pesetasDolarR);
        System.out.printf("%.2f pesetas equivalen a %.2f liras italianas%n", pesetasItaliana, pesetasItalianaR);

        scanner.close();
    }


    public static void calcularAsignacionesDeducciones() {
        System.out.println("Función para calcular asignaciones, deducciones y sueldo neto.");

        Scanner scanner =new Scanner (System.in);


        int horasTrabajo= 204;
        int precioHoraNormal= 7000;
        int sueldoBase; 
        int horasExtras= 60;
        int actualizacionAcademica= 25000;
        int bonificaciónHijo= 17300;
        int primaHogar= 18000;
        int paroForzoso, politicaHabitacional, cajaAhorro;
        int asiganciones, deducciones, sueldoNeto;
        
        sueldoBase= horasTrabajo * precioHoraNormal;
        
        horasExtras= (precioHoraNormal * 25 / 100) * horasExtras; 
        
        asiganciones= horasExtras + actualizacionAcademica + bonificaciónHijo + primaHogar;

        paroForzoso= sueldoBase * 5 / 100;

        politicaHabitacional= sueldoBase * 2 / 100;

        cajaAhorro= sueldoBase * 7 / 100;

        deducciones= paroForzoso + politicaHabitacional + cajaAhorro;
        
        sueldoNeto= sueldoBase + asiganciones - deducciones;

        System.out.println("Sueldo neto del trabajador  " + sueldoNeto);

        System.out.println("Deducciones totales sobre sueldo base del trabajador  " + deducciones);

        System.out.println("Asignaciones totales sobre sueldo base del trabajador   " + asiganciones);

        scanner.close();
    }


    public static void calcularPromedioMaterias() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        System.out.println("Ingrese la nota del examen de Matemáticas: ");
        double examenMat = scanner.nextDouble();

        System.out.println("Ingrese las 3 notas de tareas de Matemáticas: ");

        System.out.println("Ingrese la 1 nota: ");
        double tarea1 = scanner.nextDouble();
        System.out.println("Ingrese la 2 nota: ");
        double tarea2 = scanner.nextDouble();
        System.out.println("Ingrese la 3 nota: ");
        double tarea3 = scanner.nextDouble();

        double promedioTareasMat = (tarea1 + tarea2 + tarea3) / 3;
        double promedioMat = (examenMat * 0.90) + (promedioTareasMat * 0.10);

        System.out.println("Ingrese la nota del examen de Física: ");
        double examenFis = scanner.nextDouble();

        System.out.println("Ingrese las 2 notas de tareas de Física: ");

        System.out.println("Ingrese la 1 nota: ");
        double tareaFis1 = scanner.nextDouble();
        System.out.println("Ingrese la 2 nota: ");
        double tareaFis2 = scanner.nextDouble();

        double promedioTareasFis = (tareaFis1 + tareaFis2) / 2;
        double promedioFis = (examenFis * 0.80) + (promedioTareasFis * 0.20);

        System.out.print("Ingrese la nota del examen de Química: ");
        double examenQui = scanner.nextDouble();

        System.out.println("Ingrese las 3 notas de tareas de Química: ");

        System.out.println("Ingrese la 1 nota: ");
        double tareaQui1 = scanner.nextDouble();
        System.out.println("Ingrese la 2 nota: ");
        double tareaQui2 = scanner.nextDouble();
        System.out.println("Ingrese la 3 nota: ");
        double tareaQui3 = scanner.nextDouble();

        double promedioTareasQui = (tareaQui1 + tareaQui2 + tareaQui3) / 3;
        double promedioQui = (examenQui * 0.85) + (promedioTareasQui * 0.15);

        double promedioGeneral = (promedioMat + promedioFis + promedioQui) / 3;

        System.out.printf("Promedio de Matemáticas: %.1f%n", promedioMat);
        System.out.printf("Promedio de Física: %.1f%n", promedioFis);
        System.out.printf("Promedio de Química: %.1f%n", promedioQui);
        System.out.printf("Promedio general: %.1f%n", promedioGeneral);

        scanner.close();

    }



    public static void calcularDineroBanco() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de billetes de 50000: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 20000: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 10000: ");
        int n3 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 5000: ");
        int n4 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 2000: ");
        int n5 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 1000: ");
        int n6 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 500: ");
        int n7 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 100: ");
        int n8 = scanner.nextInt();

        int total = (n1 * 50000) + (n2 * 20000) + (n3 * 10000) + (n4 * 5000) +
                    (n5 * 2000) + (n6 * 1000) + (n7 * 500) + (n8 * 100);

        System.out.println("El total de dinero en el banco es: " + total);

        scanner.close();
    }



    public static void resolverEcuacionLineal() {
        System.out.println("Función para resolver una ecuación lineal.");

        double a = 2, b = 3, c = 5, d = 4, e = 6, f = 7;
        double denominator = a * e - b * d;
        
        
        if (denominator == 0) {
            System.out.println("El sistema no tiene solución única.");
            return;
        }

        double x = (c * e - b * f) / denominator;
        double y = (a * f - c * d) / denominator;
        System.out.println("X = " + x + ", Y = " + y);

    }


    public static void cacularPiezasDesperdicio() {
        double laminaLargo= 4;
        double laminaAncho= 1.5;
        double piezaConsumoLargo= 0.5;
        double piezaConsumoAncho= 0.5;        


        double areaLamina= laminaLargo * laminaAncho;
        double areaPieza= piezaConsumoLargo * piezaConsumoAncho;
        int totaLPiezas= (int) (areaLamina / areaPieza);

        double desperdicio = areaLamina % areaPieza; 

        System.out.println("El total de piezas que sale en una lamina con " + laminaLargo + " m largo " + "y " + laminaAncho + " m ancho son: " + totaLPiezas + " piezas");
        System.out.println("El total de desperdicio es " + desperdicio + "m");
    }


    public static void calcularPorcentajeDescuento() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio de venta al público (PVP): ");
        double pvp = scanner.nextDouble();

        System.out.print("Ingrese el precio final pagado: ");
        double precioFinal = scanner.nextDouble();

        double descuento = ((pvp - precioFinal) / pvp) * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + descuento + "%");

        scanner.close();
    }

    public static void calcularCostoGasolina() {
        System.out.print("Ingrese numero de galones: ");
        Scanner scanner = new Scanner(System.in);
        double galones= scanner.nextDouble();
        
        double litrosPorGalon = 3.785;
        double precioPorLitro = 100;
        double costoTotal = galones * litrosPorGalon * precioPorLitro;

        System.out.println("Total a cobrar: " + costoTotal + " Bolívares");

        scanner.close();

    }



    public static void calcularPresupuesto() {


            Scanner scanner = new Scanner(System.in);
    
            double presupuestoTotal;
            double ginecologia, traumatologia, pediatria;
    
            System.out.print("Ingrese el monto total del presupuesto anual: ");
            presupuestoTotal = scanner.nextDouble();
    
            ginecologia = presupuestoTotal * 40 / 100;
            traumatologia = presupuestoTotal * 30 / 100;
            pediatria = presupuestoTotal * 30 / 100;
    
            System.out.println("Distribución del presupuesto:");
            System.out.println("Ginecología: $" + ginecologia);
            System.out.println("Traumatología: $" + traumatologia);
            System.out.println("Pediatría: $" + pediatria);
    
            scanner.close();
    }



    public static void calcularInteresesAnuales() {


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el capital prestado (X): ");
        double capital = scanner.nextDouble();
        
        System.out.print("Ingrese el interés pagado (Y): ");
        double interesPagado = scanner.nextDouble();
        
        int tiempo = 4;
        double tasaInteres = (interesPagado * 100) / (capital * tiempo);
        
        System.out.println("La tasa de interés anual es: " + tasaInteres + "%");
        
        scanner.close();

    }



    public static void calcularPorcentajeGanancia() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de naranjas compradas (X): ");
        int cantidadNaranjas = scanner.nextInt();
        
        System.out.print("Ingrese el precio por docena (Y): ");
        double precioPorDocena = scanner.nextDouble();
        
        System.out.print("Ingrese el dinero obtenido de la venta (K): ");
        double dineroObtenido = scanner.nextDouble();
        
        double costoTotal = (cantidadNaranjas / 12.0) * precioPorDocena;
        double ganancia = ((dineroObtenido - costoTotal) / costoTotal) * 100;
        
        System.out.println("El porcentaje de ganancia obtenido es: " + ganancia + "%");
        
        scanner.close();
    }
    
    

    public static void calcularPorcentajeRecargo() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio al contado del computador: ");
        double precioContado = scanner.nextDouble();

        System.out.print("Ingrese el valor de la cuota mensual: ");
        double cuotaMensual = scanner.nextDouble();

        double precioCuotas = cuotaMensual * 12;

        double recargo = ((precioCuotas - precioContado) / precioContado) * 100;

        System.out.println("El precio total por cuotas es: " + precioCuotas + " Bolívares");
        System.out.println("El porcentaje de recargo es: " + recargo + "%");

        scanner.close();
    }


    public static void calcularIngresoTotalVenta(){

        Scanner scanner =new Scanner(System.in);

        int m, n ;
        int bulto= 24;
        double cajaAceite= 15;
        double precioBulto= 132;
        double precioAceite= 180;
        double precioBultoDetal= 7.50;
        double precioAceiteDetal= 14.50;
    
        System.out.print("Ingrese la cantidad de kilogramos de harina obtenidos: " );
        m= scanner.nextInt();
    
        System.out.print("Ingrese la cantidad de litros de aceite obtenidos: " );
        n= scanner.nextInt();
        
    
        int sobranteBulto= (m % bulto);
        System.out.println(sobranteBulto);
    
        double sobranteAceite= (n % cajaAceite);
        int totalBultosXMayor= (int) Math.floor(m / bulto);
        System.out.println(totalBultosXMayor);
        int totalAceiteXMayor=  (int) Math.floor(n / cajaAceite);
        System.out.println(totalAceiteXMayor);
    
    
        double TotalIngresoBulto= (totalBultosXMayor * precioBulto) + (sobranteBulto * precioBultoDetal); 
        double totalIngresoAceite= (totalAceiteXMayor * precioAceite) + (sobranteAceite * precioAceiteDetal);
        double totalIngresosProduccion= totalIngresoAceite + TotalIngresoBulto;
    
        System.out.println(TotalIngresoBulto);
        System.out.println(totalIngresoAceite);
    
    
        System.out.print("El ingreso total por venta de produccion: " + totalIngresosProduccion);
    
        scanner.close();
    }

        public static void main (String[] args){
            Scanner scanner =new Scanner(System.in);
            int opcionUsuario;


            do{     
                
                System.out.println("1. Calcular promedio");
                System.out.println("2. Calcular ganancia del banco");
                System.out.println("3. Calcular comisiones");
                System.out.println("4. Calcular descuento");
                System.out.println("5. Calcular nota final");
                System.out.println("6. Calcular porcentaje de hombres y mujeres");
                System.out.println("7. Conversión de pulgadas a pies");
                System.out.println("8. Calcular área de un triángulo");
                System.out.println("9. Calcular salario neto");
                System.out.println("10. Calcular cambio de divisas");
                System.out.println("11. Calcular asignaciones y deducciones");
                System.out.println("12. Calcular promedio de materias");
                System.out.println("13. Calcular dinero en el banco");
                System.out.println("14. Resolver ecuación lineal");
                System.out.println("16. Calcular piezas y desperdicio de lamina");
                System.out.println("17. Calcular porcentaje de descuento");
                System.out.println("18. Calcular costo de gasolina");
                System.out.println("19. Calcular presupuesto");
                System.out.println("20. Calcular intereses anuales");
                System.out.println("21. Calcular porcentaje de ganancia");
                System.out.println("22. Calcular recargo");
                System.out.println("23. Calcular ingreso total por venta");

                System.out.println("Ingrese opcion a elegir: ");
                opcionUsuario= scanner.nextInt(); 

             
                                    
                    switch (opcionUsuario) {
                        case 1: calcularPromedioEdades();
                        break;
                        case 2: calcularGananciaBanco(); 
                        break;
                        case 3: calcularComisiones(); 
                        break;
                        case 4: calcularDescuento(); 
                        break;
                        case 5: calcularNotaFinal();
                        break;
                        case 6: calcularPorcentajeHombresMujeres(); 
                        break;
                        case 7: conversionPulgadasPies(); 
                        break;
                        case 8: calcularAreaTriangulo(); 
                        break;
                        case 9: calcularSalarioNeto(); 
                        break;
                        case 10: calcularCambioDivisas(); 
                        break;
                        case 11: calcularAsignacionesDeducciones(); 
                        break;
                        case 12: calcularPromedioMaterias(); 
                        break;
                        case 13: calcularDineroBanco(); 
                        break;
                        case 14: resolverEcuacionLineal(); 
                        break;
                        case 16: cacularPiezasDesperdicio(); 
                        break;
                        case 17: calcularPorcentajeDescuento(); 
                        break;
                        case 18: calcularCostoGasolina(); 
                        break;
                        case 19: calcularPresupuesto(); 
                        break;
                        case 20: calcularInteresesAnuales(); 
                        break;
                        case 21: calcularPorcentajeGanancia(); 
                        break;
                        case 22: calcularPorcentajeRecargo(); 
                        break;
                        case 23: calcularIngresoTotalVenta(); 
                        break;
                        case 0: System.out.println("Saliendo del programa..."); 
                        break;
                        default: System.out.println("Opción no válida.");
                    }
            } while (opcionUsuario != 0);
    
            scanner.close();
        }
    }

