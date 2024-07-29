# Sistema de Gerenciamento de Biblioteca

Um sistema de gerenciamento de biblioteca que permite gerenciar livros, usuários e empréstimos de forma eficiente. O sistema facilita a administração dos recursos de uma biblioteca, oferecendo funcionalidades para adicionar, remover e listar livros e usuários, além de controlar o empréstimo e devolução de livros.

## Funcionalidades

- **Gerenciamento de Livros**:
  - Adicionar, remover e listar livros disponíveis na biblioteca.
  - Cada livro possui título, autor e ISBN.

- **Gerenciamento de Usuários**:
  - Adicionar, remover e listar usuários da biblioteca.
  - Cada usuário possui nome, ID e número de livros emprestados.

- **Gerenciamento de Empréstimos**:
  - Permitir que usuários emprestem e devolvam livros.
  - Controlar o número de livros que um usuário pode ter emprestado (limite definido).

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada para implementar o sistema.
- **JUnit**: Utilizado para testes unitários (se implementado).
- **PlantUML**: Para a geração de diagramas UML.

## Estrutura do Projeto

/Gerenciamendo de biblioteca<br>
├── src<br>
│ ├── Livro.java<br>
│ ├── Usuario.java<br>
│ ├── Emprestimo.java<br>
│ └── Biblioteca.java<br>
├── diagrams<br>
│ └── diagram.puml<br>
└── README.md<br>


## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/DemosthensCavalcanti/Gerenciamento_de_biblioteca

2. Navegue até a pasta do projeto:
   ```bash
   cd seu-projeto

3. Compile os arquivos Java:
   ```bash
   javac src/*.java

4. Execute o programa (se houver um ponto de entrada):
   ```bash
   java src/Main

Contribuições<br><br>
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias ou correções.<br><br>
Licença<br><br>
Este projeto está licenciado sob a MIT License.<br><br>
Autor<br><br>
Demosthens Cavalcanti<br>
https://www.linkedin.com/in/demosthens-cavalcanti-4a0b9627b/ | demosthenscf@gmail.com

