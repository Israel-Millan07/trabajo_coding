//¿Cómo harías print/log de la edad de John?
function prueba(users) {
    console.log(users[1].age);
}
prueba([{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }]);

console.log(users.age[1]);
//¿Cómo harías print/log del nombre del primer objeto?
function prueba(users) {
    console.log(users[0].name);
}
var users = [{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }];

//¿Cómo harías print/log del nombre y la edad de cada usuario utilizando un for loop? Tu output debería verse algo como esto
function personas(users) {
    for (i = 0; i < users.length; i++) {
        console.log(users[i].name, users[i].age);
    }
}
z = personas([{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }]);

//¿Cómo harías para imprimir el nombre de los mayores de edad?
function personas(users) {
    for (i = 0; i < users.length; i++) {
        if (users[i].age > 18) {
            console.log(users[i].name);
        }
    }
}
z = personas([{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }]);