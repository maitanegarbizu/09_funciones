public class main {

// funcion
static boolean es_par(int numero) {
if (numero % 2 == 0) {
return true;
} else {
return false;
}
}

static String concatenar(String st1, String st2) {
return st1 + " " + st2;

}

static String pasar_a_minusculas(String frase) {
return frase.toLowerCase();
}

static boolean es_primo(int numero) {

boolean es_primo = true;

for (int i = 2; i < numero; i++) {

if (numero % i == 0) {
es_primo = false;
}

}

return es_primo;
}



// procedura
static void escribir(String frase) {
System.out.println(frase);
}

static void escribir_en_mayuscula(String frase) {
escribir(frase.toUpperCase());
}



public static void main(String[] args) {

int zenbakia = 10;

if (es_par(zenbakia)) {
escribir(zenbakia + " es par");
} else {
escribir(zenbakia + " no es par");
}

escribir_en_mayuscula(concatenar("hola", "mundo"));

if (es_primo(5)) {
escribir(5 + " es primo");
}
}
}

