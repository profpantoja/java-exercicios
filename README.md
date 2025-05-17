## Diagrama de Classes - Sistema de Gerenciamento de Times e Partidas

Segue o diagrama UML que modela as principais entidades do sistema:

### Pessoa e Heranças
- A classe `Pessoa` é uma superclasse com atributos comuns como `nome`, `cpf`, `dataNascimento` e listas de contatos.
- Heranças:
  - `Jogador`: possui atributos como `altura`, `posição`, `camisa`, e está vinculado a um `Time`.
  - `Funcionario`: tem `salário`, `função` e uma lista de `endereços`.

### Contato e Tipos
- A classe `Contato` usa uma enumeração `TipoContato` para diferenciar entre e-mail, celular, Instagram etc.

### Endereço
- Relacionado com `Funcionario`, permite múltiplos endereços para cada funcionário.

### Time
- Armazena listas de jogadores titulares e reservas, além de informações como `nome`, `dataCriacao` e `cidade`.
- Possui métodos para adicionar, remover e listar jogadores.

### Partida
- Representa um jogo entre dois times (`casa` e `visitante`) com informações como `data`, `golsCasa`, `golsVisitante` e o `vencedor`.

Imagem do Diagrama Abaixo:
![image](https://github.com/user-attachments/assets/351ec110-b47a-4cdb-b480-e51a8952d54f)