# Menu de controle financeiro
Sistema Financeiro de fluxo de caixa.

## Tecnologias utilizadas
Esse programa foi desenvolvido em Java.

Para executar:
- Java 8 ou superior.
- IDE (Eclipse, NetBeans, IntelliJ) ou Editor de Texto (Sublime, VSCode).

## Funcionamento
O programa é executado a partir da classe **`Menu`**. Ele possui um menu principal e um submenu para cada opção do menu principal. O usuário pode escolher as opções do menu e submenu usando o teclado.

O menu principal apresenta as seguintes opções:
1. Funcionário
2. Fornecedor
3. Cliente
4. Valor a receber
5. Valor a pagar
6. Fluxo de caixa
7. Sair

Cada uma dessas opções representa uma categoria de operações a serem realizadas. Ao selecionar uma opção, o usuário é direcionado a um submenu específico para realizar as operações desejadas dentro da categoria escolhida.

As principais funcionalidades do submenu são:
1. Cadastrar
2. Ler
3. Excluir
4. Voltar

### Arquitetura das classes
Baseado em MVC, para cada uma das classes abaixo existe um model, uam view e uum controller. Arquivos com a estrutura `*List.java` foram criados no package controller para armazenas os objetos models instanciados. 

- **`Funcionario`**: representa os funcionários da empresa
- **`Fornecedor`**: representa os fornecedores da empresa
- **`Cliente`**: representa os clientes da empresa
- **`Receber`**: representa as contas a receber da empresa
- **`Pagar`**: representa as contas a pagar da empresa
- **`FluxoCaixa`**: representa o fluxo de caixa da empresa

### Faker
Instanciado na `InterfaceView` para inserir dados nas listas e otimizar testes. 

### Colaboração e sugestões de melhorias
O código está aberto e disponível para colaboração e sugestões de melhorias. Sinta-se livre para enviar pull requests com modificações e correções.

Qualquer dúvida ou sugestão, não hesite em entrar em contato!

## Desenvolvimento
* [Leo Espindola](https://github.com/oleoespindola)
* [Luis](https://github.com/luis1408)
