## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Code

- [ApLucro](src/ApLucro.java) Resolve o seguinte problema:
    + + Enem 2013 – PPL) Uma pequena fábrica vende seus bonés em pacotes com quantidades
    de unidades variáveis. O lucro obtido é dado pela expressão L(x)= -x²+ 12x - 20, onde x
    representa a quantidade de bonés contidos no pacote. A empresa pretende fazer um único
    tipo de empacotamento, obtendo um lucro máximo.
    Qual deve ser a quantidade de bonés a fim de se obter o lucro máximo nas vendas?
- [Eq2g](src/Eq2g.java): 
    + + Modela como objeto uma equação de segundo grau a partir dos coeficientes calcula o delta e as raízes utilizando como base a formula de bhaskara por fim calcula o resultado da equação.
- [TestaEq2G](src/TestaEq2g.java): 
    + + testa os metodos do objeto Eq2g.

- `vars`
    + + a: coef. de x²
    + + b: coef. de x
    + + c: coef. numero independente
- `objects`
    + + Eq2g