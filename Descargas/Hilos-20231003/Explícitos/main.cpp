#include <iostream>
#include "explicitos.h"

using namespace std;


int main() {

    cout << "Opciones:" << endl;
    cout << "    1- Ejemplo 1" << endl;
    cout << "    2- Ejemplo 2" << endl;
    cout << "    3- Ejemplo 3" << endl;
    cout << "    4- Ejemplo 4" << endl;
    cout << "    Opción:";
    unsigned i ;
    cin >> i;
    switch (i) {
        case 1:
            test_threads1();
            break;
        case 2:
            test_threads2();
            break;
        case 3:
            test_threads1A();
            break;
        case 4:
            test_async();
            break;
        default:
            cout << "Opción desconocida";
    }
    return 0;
}
