package aed;

class Funciones {
    int cuadrado(int x) {
        // COMPLETAR
        return x*x;
    }

    double distancia(double x, double y) {
        // COMPLETAR
        return Math.sqrt(x*x + y * y);
    }

    boolean esPar(int n) {
        // COMPLETAR
        return (n % 2 == 0);
    }

    boolean esBisiesto(int n) {
        // COMPLETAR
        return (((n % 4 == 0) && !(n % 100 == 0)) || (n % 400 == 0));
    }

    int factorialIterativo(int n) {
        // COMPLETAR
        int res = 1;
        while (n > 1) {
            res *= n;
            n--;
        }
        return res;
    }

    int factorialRecursivo(int n) {
        // COMPLETAR
        int res;
        if (n == 0) {
            res = 1;
        } else if (n == 1) {
            res = 1;
        } else {
            res = n * factorialRecursivo(n - 1);
        }
        return res;
    }

    boolean esPrimo(int n) {
        // COMPLETAR
        return Primo(n);
    }

    boolean Primo(int n) {
        int cantidad_divisores = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) 
                cantidad_divisores++;
        }
        return cantidad_divisores == 2;
    }

    int sumatoria(int[] numeros) {
        // COMPLETAR
        int res = 0;
        for(int i = 0; i < numeros.length; i++) {
            res += numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        // COMPLETAR
        int index_buscado = 0;

        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                index_buscado = i;
            }
        }
        return index_buscado;
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        boolean res = false;
        for(int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                res = true;
            }
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        boolean res = true;
        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                res = false;
            }
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        boolean res = true;
        for(int i = 0; i < s1.length(); i++) {
            if (i >= s2.length() || s2.charAt(i) != s1.charAt(i)) {
                res = false;
            }
        }
        return res;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR

        return esPrefijo(dar_vuelta_string(s1), dar_vuelta_string(s2));
    }

    String dar_vuelta_string(String str) {
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            res = str.charAt(i) + res;
        }
        return res;
    }
}
