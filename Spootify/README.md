## Desafio Proposto

- Para uma aplicação do tipo Spotify, um conteúdo pode ser uma música, um podcast ou
um audiolivro. Todo conteúdo possui um título e uma duração, em segundos. Uma
música possui como atributos uma lista com os nomes dos compositores e uma lista
com os nomes dos intérpretes, além de um texto que identifica o gênero da música
(latino, samba, erudito, etc.). Um podcast possui como atributos o nome do
apresentador, o texto contendo o título do tema do podcast e um texto contendo uma
resenha do episódio do podcast. Já um audiolivro possui o título da obra (escrita), uma
lista com os nomes dos autores, o nome da editora, o nome do narrador e um texto com
uma sinopse (resumo) da obra.
- Uma playlist é uma coleção de conteúdos. Toda playlist possui um nome e é capaz de
informar o seu tempo de duração total, em horas, minutos e segundos. Além disso, toda
playlist é capaz de retornar uma lista contendo apenas os conteúdos do tipo música. O
mesmo para podcast e audiolivros.
- Construa uma aplicação Java com três funcionalidades: i) preencher uma playlist com
conteúdos contendo dados vindos do teclado (apenas 1 playlist); ii) listar as músicas; iii)
listas os podecasts; iv) listar os audiolivros; v) exibir a duração total da playlist.
- Construa um menu simples baseado em caracteres.
- Não é obrigatório, mas é interessante para adquirir conhecimento em OO: A tela
principal de menu e as telas das funcionalidades podem ser objetos de classes que
representam telas e menus.
- Construa as classes necessárias para implementar as informar descritas no enunciado.
- Crie os métodos (gets e sets incluídos) necessários para cumprir os requisitos da
aplicação
## Folder Structure

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `img`: the folder to maintain icons

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Classes

- [Conteudo: Classe de Conteúdos `Superclasse` Musicas, AudioLivros e Podcasts](./src/Conteudo.java)
- [AudioLivro: Classe de livros - subclasse de Conteudo](./src/AudioLivro.java)
- [Musica: Classe de Musicas - subclasse de Conteudo](./src/Musica.java)
- [Podcast: Classe de Podcasts - subclasse de Conteudo](./src/Podcast.java)
- [Playlist: Classe formada de `Collections` de `Conteudo`](./src/Playlist.java)
- [Spootify: Classe Main de execução do proposto pelo exercício](./src/Spootify.java)


