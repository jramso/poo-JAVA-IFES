## Folder Structure


- `src`: diretorio de codigos
- sem dependencias não basicas.

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Code

- [Automovel](src/Automovel.java): Modelo abstrato de um automovel
- - Variaveis

+ + //Variaveis fixas

+ + + `private double comprimento`; // comprimento do automovel
+ + + `private double altura`;  // altura do auto
+ + + `private double maxCarg`; // maximo de carga em kg que o auto leva
+ + + `private double maxGas`; // maximo de gasolina em L
+ + + `private int maxPsg`; // maximo de pessoas / passageiros

+ +  //Variaveis relativas
+ + +    `private double peso`; // peso do carro
+ + +    `private int curPsg`; // qtd atual de passageiros
+ + +    `private double curGas`; // qtd atual de gasolina
+ + +    `private boolean ligado`; // auto On/Off 
+ + +    `private double velAtual`; //velocidade atual do auto
+ + +    `private String message`; //mensagens de aviso

- [TestaAutomovel](src/TestaAutomovel.java): Teste da maioria das funcionalidades do automovel

- - Vars
+ + + Objeto car1 (exemplo de automovel carro): `type`: Automovel
