
# Agenda Contato
## Alunos:
    Alana Sampaio Pinto
        . <a href="https://github.com/AlanaSampaio">Alana Sampaio</a> 

    Allana Cristina Diniz Mendes de Ávila
        . https://github.com/allanaavila

    Luiz Otávio Ferreira
        . https://github.com/dev-luizotavio

    Matheus Toscano Vidal
        . https://github.com/toscanomatheus

    Marina Guimarães Vieira
        . https://github.com/marinagv95
    


## Link do Repositório:
    https://github.com/allanaavila/projeto-final-agenda/tree/main


Este projeto é uma aplicação em Java que simula uma agenda de contatos. A aplicação permite adicionar, detalhar, alterar, excluir e listar contatos, oferecendo uma interface simples para o gerenciamento dos dados.

## Requisitos Funcionais

### 1. Adicionar Contatos:
Neste processo de implementação da funcionalidade de adição de contatos, foi desenvolvido um fluxo que garante a integridade e a exclusividade dos dados na agenda. O usuário fornece os dados do novo contato, como nome, sobrenome, telefone e e-mail. O sistema então realiza uma verificação para assegurar que o telefone informado ainda não esteja associado a nenhum outro contato. Caso o telefone já exista na agenda, uma mensagem de erro é exibida, impedindo a duplicação de contatos. Se os dados fornecidos forem válidos e o telefone não estiver em uso, o contato é adicionado com sucesso à agenda. Dessa forma, a funcionalidade assegura que cada contato na agenda tenha um telefone único, evitando inconsistências e garantindo a confiabilidade das informações armazenadas.

### 2. Detalhar Contatos:
Esta função tem como objetivo detalhar o contato de acordo com o telefone adicionado durante o cadastro. O programa faz a verificação do número e retorna todos os detalhes como Nome, Telefone e Email. Caso o usuário não retorne um número válido, o programa exibirá uma mensagem de erro "O contato não existe na agenda".

### 3. Alterar Contatos:
Permite modificar as informações de um contato existente na agenda. O processo de alteração envolve os seguintes passos:

O usuário informa o telefone do contato que deseja alterar.
O sistema solicita os novos dados do contato (nome, sobrenome, telefone e e-mail).
Se o telefone informado já estiver associado a outro contato, o sistema exibirá uma mensagem de erro.
Caso o telefone não seja encontrado na agenda, uma exceção é lançada.
Se os novos dados forem válidos, o contato é atualizado com sucesso.


### 4. Excluir Contatos:
A opção de excluir contato permite que o usuário remova permanentemente um contato da agenda. Para evitar que um contato errado seja removido, a exclusão é realizada por meio do número de telefone do contato, uma vez que é um identificador exclusivo e não permite duplicidade.
Funcionamento: o sistema solicita que o usuário informe o número de telefone do contato, o qual deseja excluir. Se o contabilizador for encontrado, o mesmo é removido da lista de contatos, e o sistema exibe uma mensagem de sucesso. Caso contrário, o sistema informa ao usuário que o número de telefone informado não foi identificado. Além disso, o sistema implementa uma tratativa de erros usando try-catch de Java para tratar problemas imprevistos durante a operação de remoção. Desta forma, se ocorrer um problema ao tentar manipular a lista de contatos na operação de exclusão, o sistema corretamente exibe uma mensagem ao usuário e encerra a operação de exclusão do contato, mantendo a consistência da uso da aplicação e estabilidade do programa.
Importância da Funcionalidade: a funcionalidade de excluir contatos é importante para manter a agenda organizada e limpa, removendo contatos indesejados e não utilizados. Dessa forma, essa opção evita possíveis confusões ou espaços não utilizados na aplicação, prevenindo falhas e desconforto aos usuários. A opção de exclusão só é executada após a confirmação do número de telefone, o que impede exclusões acidentais. 
Por fim, o tratamento de erros aumenta a segurança e robustez da aplicação, diminuindo a possibilidade de falhas inesperadas.

### 5. Listar Contatos:
Mostra no terminal todos os contatos cadastrados na agenda. Funciona da seguinte forma: 
Ao ser solicitada essa opção no menu, todos os contatos armazenados na agenda são exibidos. Primeiro, verifica se a lista está vazia e, se estiver, lança uma exceção para indicar que não há contatos para exibir. Se houver contatos, eles são listados separadamente contendo as informações de nome, e-mail e telefone. A exceção é tratada para garantir que o usuário seja notificado sobre a ausência de contatos de forma apropriada.


## Quais foram os desafios no projeto?
Um dos principais desafios que enfrentamos foi lidar com arrays dinâmicos para armazenar contatos. Como os arrays em Java têm um tamanho fixo, tivemos que desenvolver uma lógica para aumentar o tamanho do array à medida que novos contatos eram adicionados. Isso envolveu criar um novo array maior, copiar os dados do array antigo para o novo e garantir que a operação fosse eficiente e livre de erros.

## O que foi mais interessante?
O mais interessante do projeto foi a colaboração em equipe e o uso do GitHub para gerenciar o código. Trabalhar junto com os outros e manter o controle das versões foi uma experiência prática que ajudou a organizar e integrar as funcionalidades que implementamos

## O que pode ser melhorado?
Para melhorar o projeto, poderíamos adotar estruturas de dados mais avançadas, como coleções (ArrayList) da biblioteca padrão do Java, que oferecem redimensionamento automático. Além disso, a persistência dos dados poderia ser implementada para salvar os contatos em um arquivo ou banco de dados, permitindo que as informações sejam mantidas mesmo após o encerramento da aplicação.







