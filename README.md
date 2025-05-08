# java-exercicios
Repositório das listas de exercícios da disciplina <strong>Linguagens e Técnicas de Programação II</strong> e <strong>Introdução a Orientação a Objetos</Strong>.

## Sumário
- [Como Contribuir](#como-contribuir-nesse-repositório)
- [Instruções de Branch](#instruções-úteis)
- [Clone e Fork](#clonagem-e-fork)
- [Abrir Pull Request](#criar-um-pull-request)

## Como Contribuir Nesse Repositório

- **Requisitos**: você precisa ser aluno ou monitor da disciplina ou, ainda, trabalhar em algum projeto de pesquisa.
- **Criar uma Branch**: após clonar o projeto em alguma IDE, é preciso criar uma branch baseada em algumas das categorias abaixo, de acordo com a funcionalidade desenvolvida.

| Category        | Meaning                                                                     |
| --------------- | --------------------------------------------------------------------------- |
| `wip`           | for a work in progress                                                      |
| `feature`       | for adding, removing or modifying a feature                                 |
| `experimental`  | for experimenting something which is not an issue                           |
| `hotfix`        | for quickly fixing critical issues, usually with a temporary solution Cell  |
| `bugfix`        | for fixing a bug                                                            |

> Exemplo de criação de uma branch para resolução de uma lista de exercícios:
  ```
  git checkout -b wip-seunome-exercicios-14-ao-20
  ```

- **Adicionar os arquivos**: após a implementação das funcionalidades, adicione os arquivos alterados para prepará-los para confirmação e envio a este repositório.
> Exemplo de adição de todos os arquivos modificados:
  ```
  git add .
  ```

- **Realizar o commit localmente**: confirmar as modificações que precisam ser enviadas para serem avaliadas pelo responsável do repositório. Sempre adicione uma mensagem sobre o que foi realizado na confirmação.  
> Exemplo de um commit com uma mensagem:
  ```
  git commit -m "Uploading the new branch for the fixing a bug."
  ```

- **Efetuar o push**: envie suas modificações sempre que quiseres que tuas modificações sejam persistidas on-line no repositório e na branch criada anteriormente.
> Exemplo de como enviar as modificações confirmadas quando a branch ainda não existir no repositório:
  ```
  git push --set-upstream origin wip-exercícios-14-ao-20
  ```

> Exemplo de como enviar as modificações confirmadas para o repositório:
  ```
  git push
  ```

- **Solicitar mesclagem**: para que as modificações sejam refletidas no branch principal (`main`), é necessaŕio realizar um `pull request`. Esta solicitação é responsável por informar a outras pessoas sobre as alterações feitas em uma ramificação de um repositório. 
> Utilize o GitHub para realizar esta etapa.

## Instruções Úteis

- **Criar uma branch a partir de uma outra**: se enventualmente modificações ocorreram em uma branch e é preciso levar essas modificações para uma outra branch.
> Exemplo de como criar a branch wip-nova-branch a partir da branch atual.
```
git checkout -b wip-nova-branch
```
## Clonagem e Fork

O fork cria uma cópia do repositório para a sua conta no GitHub, permitindo que você faça alterações que poderão ser implementadas nesse repositório através do [Pull Request](#criar-um-pull-request).

- **Como criar um Fork**:
  <ul>
    <li>No canto superior direito do repositório, clique no botão "Fork".</li>
    <li>Escolha a sua conta para criar a cópia do repositório. Ele será copiado para o seu perfil.</li>
  </ul>

 - **Clonar o Repositório Forkado**
  Agora que você tem sua cópia do repositório, você precisa cloná-la para o seu computador para poder fazer alterações.
  Abra o terminal no seu computador e use o comando abaixo para clonar o repositório:
```
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```
```
cd nome-do-repositorio
```
- **Criar uma Nova Branch**
Antes de fazer alterações, é uma boa prática criar uma nova branch para trabalhar, seguindo a [nomenclatura do projeto](#como-contribuir-nesse-repositório).
Criada a branch, implemente o código com as novas funcionalidades do projeto.

- **Enviar as Alterações para o GitHub (Push)**
Agora, envie a sua branch com as alterações para o seu repositório no GitHub.

## Criar um Pull Request
Agora que as alterações estão no seu repositório no GitHub, é hora de abrir um Pull Request para que o dono do repositório original possa revisar e, possivelmente, aceitar as mudanças.
    
1.  Clique na aba "Pull Requests"
2.  Clique no botão "Novo Pull Request"
3.  Selecione a branch do seu fork (a que você fez o push) e a branch main do repositório do projeto
4.  Adicione uma descrição clara sobre as mudanças que você fez
5.  Clique em "Criar Pull Request"

### Exemplo de PR
- Título: ```Adicionar Teste na Avaliação The Boys```
- Descrição:
  > Adicionando branch que satisfaz a solicitação da Issue [ número da issue ] - [ descrição da issue ]
  > A branch implementa os arquivos na pasta [ adicionar o caminho da pasta que foi modificada, em caso de código, como testes unitários, por exemplo ]
