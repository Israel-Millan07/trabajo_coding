//Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255.
function a(x) {
    conteo = [];
    for (i = 1; i <= 255; i++) {
        conteo.push(i);
    }
    return conteo;
}
console.log(a(255));

//Consigue pares hasta 1000: Escribe una función que entregue 
//la suma de todos los números pares del 1 al 1000 - Puedes
//usar un operador de módulo para este ejercicio. 
function pares(x) {
    suma = 0;
    for (i = 1; i <= x; i++) {
        if (i % 2 == 0) {
            suma = suma + i;
        }
    }
    return suma;
}
z = pares(1000);
console.log(z);

//Suma impares hasta 5000: Escribe una función que devuelva
//la suma de todos los números impares entre 1 y 5000 
//(ej: 1+3+5+...+4997+4999).
function impares(x) {
    suma = 0;
    for (i = 1; i <= x; i++) {
        if (i % 2 == 1) {
            suma = suma + i;
        }
    }
    return suma;
}
z = impares(5000);
console.log(z);

//Itera un array: Escribe una función que devuelva la suma de 
//todos los valores dentro de un array 
//(ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14).
function sumar(x) {
    suma = 0;
    for (i = 0; i < x.length; i++) {
        suma = suma + x[i];
    }
    return suma;
}
z = sumar([2, 10, 6, 2]);
console.log(z);

//Encuentra el mayor (max): Dado un array con múltiples 
//valores, escribe una función que devuelva el número mayor 
//(ej: para [-3,3,5,7] el número mayor (max) es 7).
function mayor(x) {
    mayor = [0];
    for (i = 0; i < x.length; i++) {
        if (x[i] > mayor) {
            mayor = x[i];
        }
    }
    return mayor;
}
z = mayor([2, 10, 6, 20]);
console.log(z);

//Encuentra el promedio (avg): Dado un array con múltiples 
//valores, escribe una función que devuelva el promedio de 
//los valores (ej: para [1,3,5,7,20] el promedio es 7.2).
function promedio(a) {
    avg = 0;
    sum = 0;
    for (i = 0; i < a.length; i++) {
        sum = sum + a[i];
    }
    avg = sum / a.length;
    return avg;
}
z = promedio([1, 3, 5, 7, 20]);
console.log(z);

//Array de impares: Escribe una función que devuelva un 
//array de todos los números impares entre 1 y 50 
//(ej: [1,3,5, …, 47,49]). Pista: Usa el método ‘push’.
function impares(x) {
    impar = [];
    for (i = 1; i <= x; i++) {
        if (i % 2 == 1) {
            impar.push(i);
        }
    }
    return impar;
}
z = impares(50);
console.log(z);

//Mayor que Y: Dado un valor Y, escribe una función que toma 
//un array y devuelve los valores mayores que Y. 
//Por ejemplo, si arr = [1,3,5,7] y Y = 3, 
//tu función devolverá 2 (hay 2 números en el array mayores 
//que 3, esto son 5 y 7). 
function mayor(x, Y) {
    cantidad = 0;
    for (i = 0; i < x.length; i++) {
        if (x[i] > Y) {
            cantidad++;
        }
    }
    return cantidad;
}
z = mayor([1, 3, 5, 7], 3);
console.log(z);

//Cuadrados: Dado un array con múltiples valores, 
//escribe una función que reemplace cada valor por el 
//cuadrado del mismo valor (ej: [1,5,10,-2] 
//será [1,25,100,4]).
function a(x) {
    nuevo = [];
    for (i = 0; i < x.length; i++) {
        nuevo.push(x[i] * x[i]);

    }
    return nuevo;
}
z = a([1, 5, 10, -2]);
console.log(z);

//Negativos: Dado un array con múltiples valores, escribe 
//una función que reemplace cualquier número negativo dentro 
//del array por 0. Cuando el programa esté listo, el array 
//no debiera contener números negativos (ej: [1,5,10,-2] 
//se convertirá en [1,5,10,0]).
function reemplazarNegativos(y) {
    var arreglo = [];
    for (var i = 0; i < y.length; i++) {
        if (y[i] < 0) {
            arreglo.push(0);
        } else {
            arreglo.push(y[i]);
        }
    }
    return arreglo;
}
z = reemplazarNegativos([1, 5, 10, -2]);
console.log(z);

//Max/Min/Avg: Dado un array con múltiples valores, escribe 
//una función que devuelva un nuevo array que solo contenga 
//el valor mayor (max), menor (min) y promedio (avg) del 
//array original (ej: [1,5,10,-2] devolverá [10,-2,3.5]).
function calculo(a) {
    max = 0;
    min = 0;
    avg = 0;
    arr = []
    sum = 0;
    for (i = 0; i < a.length; i++) {
        sum = sum + a[i];
        if (a[i] > max) {
            max = a[i];
        } else if (a[i] < min) {
            min = a[i];
        }
    }
    avg = sum / a.length;
    arr = [max, min, avg];
    return arr;
}
z = calculo([1, 5, 10, -2]);
console.log(z);

//Intercambia Valores: Escribe una función que intercambie 
//el primer y el último valor de cualquier array. La extensión 
//mínima predeterminada del array es 2 (ej: [1,5,10,-2] 
//será [-2,5,10,1]).
function intercambiar(a) {
    arreglo = []
    for (i = 0; i < a.length; i++) {
        arreglo.push(a[i]);
        if (i == 0) {
            arreglo[i] = (a[a.length - 1]);
        } else if (i == a.length - 1) {
            arreglo[i] = a[0];
        }
    }
    return arreglo;
}
z = intercambiar([1, 5, 10, -2])
console.log(z);

//De Número a String: Escribe una función que tome un array 
//de números y reemplace cualquier valor negativo por el 
//string ‘Dojo’. Por ejemplo, dado el array = [-1,-3,2], 
//tu función devolverá [‘Dojo’,‘Dojo’,2].
function reemplazarNegativos(y) {
    var arreglo = [];
    for (var i = 0; i < y.length; i++) {
        if (y[i] < 0) {
            arreglo.push("Dojo");
        } else {
            arreglo.push(y[i]);
        }
    }
    return arreglo;
}
z = reemplazarNegativos([-5, 10, 15, -20, 3, -4]);
console.log(z);