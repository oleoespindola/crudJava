# Menu de controle financeiro

## Descrição

Esse programa é um sistema de controle financeiro que permite cadastrar, ler e excluir informações de funcionários, fornecedores, clientes e transações financeiras (valores a receber, pagar e fluxo de caixa).

## **Tecnologias utilizadas**

Esse programa foi desenvolvido em Java.

Para executar:
- Java 8 ou superior.
- IDE (Eclipse, NetBeans, IntelliJ) ou Editor de Texto (Sublime, VSCode).

## **Funcionamento**

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

Cada submenu apresenta as seguintes opções:

1. Cadastrar
2. Ler
3. Excluir
4. Voltar

### Arquitetura das **classes**

Baseado em MVC, para cada uma das classes abaixo existe um model, uam view e uum controller. Arquivos com a estrutura `*List.java` foram criados no package controller para armazenas os objetos models instanciados. 

- **`Funcionario`**: representa os funcionários da empresa
- **`Fornecedor`**: representa os fornecedores da empresa
- **`Cliente`**: representa os clientes da empresa
- **`Receber`**: representa as contas a receber da empresa
- **`Pagar`**: representa as contas a pagar da empresa
- **`FluxoCaixa`**: representa o fluxo de caixa da empresa

Cada classe tem seus atributos e métodos próprios, que são definidos de acordo com a sua finalidade e função no sistema. Além disso, cada classe pode ter relacionamentos e interações com outras classes do sistema, como por exemplo, um funcionário realizando uma compra de um fornecedor ou um cliente efetuando o pagamento de uma conta a receber.

### Faker

insere um objeto na `InterfaceView` para inserir dados nas listas e otimizar testes. 

### Colaboração e sugestões de melhorias

O código está aberto e disponível para colaboração e sugestões de melhorias. Sinta-se livre para enviar pull requests com modificações e correções.

Qualquer dúvida ou sugestão, não hesite em entrar em contato!
