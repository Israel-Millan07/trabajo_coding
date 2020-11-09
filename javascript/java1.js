//primero
function a() {
    return 35; // 35
}
console.log(a()) //35

//segundo
function a() {
    return 4; // 4
}
console.log(a() + a()); // a (4) + (4) = 8

//tercero
function a(b) {
    return b; // b
}
console.log(a(2) + a(4)); //6

//cuarto
function a(b) {    
    console.log(b); // 3
    return b * 3; // 3*3 = 9
}
console.log(a(3)); //9
// console.log = 3,9

//quinto
function a(b) { // a(10)
    return b * 4; //10*4 = 40
    console.log(b); // no entra
}
console.log(a(10)); // 40

//secto
function a(b) { // a(15)
    if (b < 10) { // 15<10 
        return 2; // undefine
    }    
    else {
        return 4; //4
    }
    console.log(b); //no entra
}
console.log(a(15)); //4

//septimo
function a(b, c) { //a(3,10)
    return b * c; //3*10 =30
}
console.log(10, 3); // 10,3
console.log(a(3, 10)); // 30

//octavo
function a(b) { // a(b)
    for (var i = 0; i < 10; i++) { //0;0<10; 0+1=1.....
        console.log(i); //0,1,2,3,4,5,6,7,8,9
    }
    return i; //9
}
console.log(3); //3
console.log(4); //4

//noveno
function a() {
    for (var i = 0; i < 10; i++) { // 0-> 2+1=3->5+1=6->8+1=9->11+1=12
        i = i + 2; // 0= 0+2 -> 3+2->6+2->9+2
        console.log(i); //2,5,8,11
    }
}
a();

//decimo
function a(b, c) { // a(0,10)
    for (var i = b; i < c; i++) { // 0; 0<10 ->1<10->2<10->3<10->4<10->5<10->6<10->7<10->8<10->9<10->10<10
        console.log(i); //0,1,2,3,4,5,6,7,8,9 | 0,1,2,3,4,5,6,7,8,9
    }
    return b * c; //0*10
}
a(0, 10); //0
console.log(a(0, 10)); //0

//decimo-primero
function a() {
    for (var i = 0; i < 10; i++) {
        for (var j = 0; j < 10; j++) {
            console.log(j); //undefined
        }
        console.log(i); //undefined
    }
}

//decimo-segundo
function a() {
    for (var i = 0; i < 10; i++) {
        for (var j = 0; j < 10; j++) {
            console.log(i, j); //undefined
        }
        console.log(j, i); ////undefined
    }
}

//decimo-tercero
var z = 10;

function a() {
    var z = 15;
    console.log(z); //undefined
}
console.log(z); //10

//decimo-cuarto
var z = 10;

function a() {
    var z = 15;
    console.log(z); //15
}
a();
console.log(z); //10

//decimo-quinto
var z = 10;

function a() {
    var z = 15;
    console.log(z); // 15
    return z; //15
}
z = a(); //15
console.log(z); //15