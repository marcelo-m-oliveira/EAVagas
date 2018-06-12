var minhaFuncao;
num = 10;
if (num == 0) {

    minhaFuncao = function (n, m) {
        console.log(n * m)

    }
}
else {
    minhaFuncao = function (n, m) {

        console.log(n + m);
        alert('A soma é: ' + (n + m))
    }
}

minhaFuncao(2, 3);

function fatorial(n) {
    if ((n == 0) || (n == 1))
        return 1;
    else
        return (n * fatorial(n - 1));
}

console.log(fatorial(5));
alert('A soma é: ' + (fatorial(5)));

function getScore() {
    var num1 = 2, num2 = 3;

    function add() {
        var nome = "Batata";
        return nome + " scored " + (num1 + num2);
    }

    return add();
}
alert(getScore());

//Atv 1
function Atv1(aux)
{
    aux = [];
    var list2;
    for (var i = 1; i < 101; i++)
    {
        aux.push(i);
    }
    console.log(aux);
    list2 = aux.slice(0).reverse();
    return list2;
}
console.log(Atv1());

// Atv 2 tá dando merda ainda

function Atv2(A, B, C)
{
    A = [1, 4, 5, 9, 0, 2];
    B = [14, 4, 10, 100, 9];
    C.exec(A, B);
    return C;
}
console.log(Atv2());

// Atv 3

function Atv3(A, B, D)
{
    A = [1, 4, 5, 8, 9];
    B = [10, 20, 30, 50];
    D = [];
    console.log(A, B);
    total = D.concat(A, B);
    return total;
}
console.log(Atv3());

// Atv 4

function Atv4(aux)
{
    aux = [7,10];
    total = ((aux[0] + aux[1]) /2);
    return total;
}
console.log(Atv4());

// Atv 5

function Atv5(A)
{
    A = [2, 3, -4, 1, 4, 5, 0];
    let result;
    result = Math.min.apply(null, A);
    return result;
}
console.log(Atv5());

// Atv 6

function Atv6(aux)
{
    aux = [15, 40];
    var result = Math.min.apply(null, aux);
    var result1 = Math.max.apply(null, aux);
    var M = ((aux[0] + aux[1]) / 2);
    console.log("Menor temperatura: ", result);
    console.log("Maior temperatura: ", result1);
    return M;
}
console.log("Media da temperatura: ", Atv6());

// Atv 7 tá dando merda ainda

function Atv7(A)
{
    A = 2;
    var aux = [A*A];
    for (var i = 1; i < 15; i ++)
    {
        aux.push(i);
        for (A = 2; A*A;)
        {
            console.log(aux);
        }
    }
    return aux;
}
console.log(Atv7());

var num = 2;
    function mult(num)
{
    value = [];
    for (var i = 0; i < 15; i++)
    {
        value[i] = num*i;
    }
    return value;
}
console.log(mult(num));

var pessoa = function () {} // criando a classe
var meuCarro = []; // "Criando um object"

meuCarro = new object ();
meuCarro.nome = "Fofs";
console.log(meuCorro.nome);

var Animal = {
    tipo: "inverterbrados",
    qualTipo: function () { //metodo
        console.log(this.tipo);
    }
}
var animal1 = Object.create(Animal);
animal1.qualTipo();
var peixe = Object.create(Animal);
peixe.tipo = "Preixes";
peixe.qualTipo();

// Construtor //
var Pessoa = function ()
{
    console.log("Exemplar criado!");
}
var Batata = function ()
{
    alert("Batatinha fofs!");
    console.log("Batatinha fofs!");
}
var pessoa1 = new Pessoa();
var pessaoa2 = new Batata();


var Pessoa = function (Nome, Idade, Nascionalidade)
{
    this.nome = Nome;
    this.idade = Idade;
    this.nasc = Nascionalidade;
}
console.log('Exemplar de Pessoa criada\n\n');
var pessoa1 = new Pessoa('Alice','20', 'Batatilandia');
var pessoa2 = new Pessoa('Goku', '21', 'Nanananana');
pessoa1 ["nome"] = "Karla"; // alterar propriedades
console.log('Pessoa 1 é: ' + pessoa1.nome + '\nIdade da Pessoa 1: ' + pessoa1.idade + '\nNacionalidade da pessoa 1: ' + pessoa2.nasc + '\n');
console.log('\n' + 'Pessoa 2 é ' + pessoa2.nome +  '\nIdade da Pessoa 2: ' + pessoa2.idade + '\nNacionalidade da pessoa 1: ' + pessoa2.nasc);

var Pessoa = function (genero)
{
    this.genero = genero;
    alert('Pessoa instanciada');
}
Pessoa.prototype.dizerOla = function ()
{
    alert ('Hello');
};
var pessoa1 = new Pessoa('Masculino');
pessoa1.dizerOla();

//Array
var arr = [42];
var arr = Array (42);
console.log(arr);
alert (arr);

var arr = [];
arr.length = 42;
alert(arr);
alert(arr.length);


var gatos = ['Dusty', 'Misty', 'Twiggy'];
console.log(gatos.length);

gatos.length = 2;
console.log(gatos);

gatos.length = 0;
console.log(gatos);

gatos.length = 3;
console.log(gatos);

var arr = [3, 5, 7, 9, 2, 4, 6, 5];
for (let i of arr){
    console.log(i);
}


var cores = ['Vermelho', 'Verde', 'Azul'];
cores.forEach(function (cor) {
    console.log(cor);

});

cores[3] = "Roxo";

console.log(cores);


var myArray = new Array('1', '2', '3');
myArray = myArray.concat('a', 'b', 'c');
console.log(myArray);

var myArray = new Array('Vento', 'Chuva', 'e');
var lista = myArray.join(', ');
myArray[3] = "Fogo";
console.log(myArray);
console.log(lista);

var myArray = new Array('1', '2', '3', '4', '5');
myArray.splice(1,3, 'a','b','c', 'd');
var list = myArray.join(' - ');
console.log(list);


var a = [10, 20, 30];
var total = a.reduce(function (primeiro, segundo) {

    return primeiro + segundo;
}, 0);
console.log(total);

C = [2];
result = Math.floor((Math.random(C) * 100));
console.log(result);

function mult(num)
{
    value = 2;
    num = [];
    for (var i = 0; i < 15; i++)
    {
        num[i] = value*i;
    }
    return num;
}
console.log(mult());