## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## About the code
- `src`:
    [Ponto2D](src/Ponto2D.java)
    O projeto desse codigo é definir um ponto no plano cartesiano como um objeto, calcular a distancia entre 2 pontos e conferir se 2 pontos sao iguais
    [Aplicação](src/TestaPonto2D.java)
    Testar os métodos do Ponto2D.
- `Atributos`:
    x: linha horizontal
    y: linha vertical
    (x,y)
- `Objeto`:
    Ponto2D: o ponto formado por x e Y