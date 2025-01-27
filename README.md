# 1.4_testing

### **Exercici 1: Gestió d'una Biblioteca**
Crea una classe Java per gestionar una col·lecció de llibres en una biblioteca. Aquesta classe ha d'incloure les següents funcionalitats:
- Afegir llibres a la col·lecció.
- Recuperar la llista completa de llibres.
- Obtenir el títol d'un llibre donada una posició específica.
- Afegir un llibre en una posició específica.
- Eliminar un llibre pel seu títol.

#### Verificacions amb JUnit
1. Verifica que la llista de llibres no és nul·la després de crear un nou objecte.
2. Comprova que la llista té la mida esperada després d'afegir diversos llibres.
3. Assegura que es pot recuperar el títol d'un llibre per la seva posició.
4. Comprova que no hi ha llibres duplicats.
5. Valida que afegir i eliminar llibres modifica correctament la mida de la llista.
6. Confirma que la llista es manté ordenada alfabèticament després d'afegir o eliminar llibres.

---

### **Exercici 2: Càlcul de la Lletra del DNI**
Crea una classe anomenada `CalculoDni` que calculi la lletra del DNI donat el número com a paràmetre.

#### Verificacions amb JUnit
- Crea una classe de test parametritzada que:
  - Utilitzi un conjunt de dades predefinides (10 números de DNI).
  - Validarà que el càlcul de la lletra és correcte.

---

### **Exercici 3: Excepció ArrayIndexOutOfBoundsException**
Crea una classe que contingui un mètode que llanci una **ArrayIndexOutOfBoundsException** de manera controlada.

#### Verificacions amb JUnit
- Verifica que es llança l'excepció quan es crida al mètode corresponent.

---

## Nivell 2: AssertJ

### **Exercici 1: Igualtat d'Objectes**
- Escriu assercions per demostrar:
  1. Que el valor de dos objectes sencers és igual.
  2. Que el valor de dos objectes sencers no és igual.

### **Exercici 2: Referència d'Objectes**
- Escriu assercions per:
  1. Comprovar que la referència de dos objectes és la mateixa.
  2. Comprovar que la referència de dos objectes és diferent.

### **Exercici 3: Igualtat d'Arrays**
- Escriu una asserció que indiqui que dos arrays d'enters són idèntics.

### **Exercici 4: Verificacions amb ArrayList**
1. Crea un `ArrayList` amb objectes de diversos tipus.
2. Escriu assercions per:
   - Verificar l'ordre dels objectes segons la seva inserció.
   - Comprovar que la llista conté els objectes en qualsevol ordre.
   - Verificar que un objecte s'ha afegit només una vegada.
   - Assegurar que un objecte no present no es troba a la llista.

### **Exercici 5: Verificació amb Maps**
- Crea un `Map` i verifica que conté una clau específica.

### **Exercici 6: Excepcions**
- Provoca una **ArrayIndexOutOfBoundsException** i escriu una asserció per validar que aquesta s'ha llançat.

### **Exercici 7: Objectes Optional**
- Crea un objecte `Optional` buit.
- Escriu una asserció per verificar que està efectivament buit.

---

## Nivell 3: TDD

### **Exercici 1: Classe Calculadora**
Crea una classe anomenada `Calculadora` que implementi mètodes per realitzar operacions matemàtiques bàsiques: **suma**, **resta**, **multiplicació** i **divisió**.

#### Procés de TDD:
1. **Escriure les proves abans de la implementació:**
   - Crea la classe de test `CalculadoraTest`.
   - Escriu proves per validar cada mètode de la classe (`sumar`, `restar`, `multiplicar`, `dividir`).
2. **Executar les proves:**
   - Les proves inicials haurien de fallar, ja que la classe encara no està implementada.
3. **Implementar la classe:**
   - Crea la classe `Calculadora` amb els mètodes necessaris.
4. **Executar i iterar:**
   - Torna a executar les proves fins que passin.
   - Refactoritza el codi si és necessari.

---

## Requisits
- **Java 8 o superior**
- **JUnit 5** per a la realització de proves.
- **AssertJ** per a assercions més avançades i llegibles.

## Com executar
1. Clona aquest repositori:
   ```bash
   git clone <URL-del-repositori>
