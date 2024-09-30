API de Áudio 🎵

Este projeto foi desenvolvido como parte de um desafio proposto no meu curso de programação. O desafio consistia em praticar conceitos de herança, encapsulamento e modelagem orientada a objetos. O objetivo era criar uma aplicação simples que simulasse o funcionamento de uma plataforma de músicas e podcasts, permitindo reproduzir e gerenciar os conteúdos de áudio.

Desafio 🎯

O desafio proposto foi o seguinte:

Crie uma aplicação que permita escutar áudio, com uma superclasse chamada Áudio e suas heranças, como Músicas e Podcasts. A superclasse deve conter atributos como título, duração, total de reproduções, curtidas e classificação. Além disso, encapsule os métodos para curtir, reproduzir e gerenciar esses áudios, garantindo que a classe principal não tenha acesso direto aos atributos internos.

Funcionalidades 🚀
A aplicação possui as seguintes funcionalidades:

Gerenciamento de Áudios: A superclasse Áudio contém atributos comuns, como título, duração, reproduções e curtidas.
Herança e Polimorfismo: As classes Música e Podcast herdam os comportamentos da classe Áudio, com possíveis especializações.
Encapsulamento: A manipulação dos atributos é feita de maneira segura por meio de métodos como curtir() e reproduzir(), sem acesso direto aos atributos pelas classes externas.
Controle de Favoritos: Uma classe especial gerencia músicas e podcasts favoritos do usuário, permitindo fácil acesso a eles.
Estrutura do Projeto 🛠️
Audio (Superclasse):

Atributos:
título
duração
totalReproducoes
curtidas
classificacao
Métodos:
reproduzir()
curtir()
Musica (Subclasse de Audio):

Atributo específico:
artista
Podcast (Subclasse de Audio):

Atributo específico:
host
Classe de controle:

Gerencia uma lista de músicas e podcasts preferidos.
