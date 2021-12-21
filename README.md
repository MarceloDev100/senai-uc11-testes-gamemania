
## SENAI-SP 
### UC11 - Aula online 2 e encontro remoto 2.

#### Elaboração de teste de navegabilidade automática no site _Game Mania_ ao fazer um cadastro e realizar login na página.
<br><br>

<h2 align="center">R E L A T Ó R I O (Game Mania) </h2>

**Descrição**

Nesta atividade, foram testadas as funcionalidades através da execução de um teste automático de navegabilidade com operações de cadastro e login de usuário no site Game Mania. 

**Ferramentas**

Foi feito o download e instalação do **Eclipse IDE for Enterprise Java and Web Developers, versão 2021-09 ,  do JDK 1.8 e do Apache Maven**.  Uma vez que o procedimento foi feito com o navegador Google Chrome ,  foi preciso também efetuar o download do executável **ChromeDriver (WebDriver)** compatível com a versão do browser. Todas as variáveis ambientes do Java e Maven foram devidamente configuradas na máquina Windows 10. Foram utilizadas as dependências do projeto **Selenium e JUnit** dentro do Eclipse após a pesquisa no  repositório do Maven. <br/><br/>

O Selenium consiste num framework que possui um recurso chamado WebDriver, o qual permite a automatização do browser, podendo ser utilizada em várias linguagens de programação. Nesta atividade foi utilizada a linguagem Java. O JUnit é um framework que facilita o desenvolvimento e execução de testes em código Java. Fornece uma completa API (conjunto de classes) para construir os testes.


**Métodos**

Dentro da pasta src/test/java foi criado um pacote chamado br.senai.testepagina que contém uma classe chamada LoginGameManiaTest 

Nessa classe foram elaborados procedimentos para configuração **antes (@Before)** do teste ser feito. Estas rotinas foram responsáveis por abrir o navegador Chrome, ficar em dormência por 2 segundos para dar tempo de carregar a página e em seguida poder maximizar o navegador.

Na fase  de **teste (@Test)** propriamente dita, foi elaborado um código para ter acesso à página inicial do site Game Mania de forma automatizada, para que fosse possível navegar para a página de cadastro, localizar todos os campos em sequência pelo atributo _name_ ,  inserir os dados necessários em cada um deles ,  e então , ao rolar a página para baixo, confirmar a operação através do botão cadastrar. Desta forma, a navegação foi redirecionada para a página de login.
Em seguida, já na página de login, os campos de usuário e senha foram localizados por _id_, bem como o botão continuar. Após os dados de um usuário cadastrado na etapa anterior serem preenchidos nos referidos campos, a operação de login foi confirmada pelo clique no botão continuar.  Desta forma, a navegação foi redirecionada para a página inicial. 
Durante esta fase, foram adicionados também alguns intervalos de tempo durante as operações para dar tempo de visualizar o processo de teste em andamento.

Na fase **após o teste(@After)**, foi aguardado um intervalo de 5s para poder visualizar o processo de logout. O botão de logout foi localizado por _xpath_, e então clicado para fazer o logout do sistema. Para finalizar, foi selecionado o ícone de login para demonstrar que usuário realmente fez o logout e que precisa fazer o login novamente para entrar no sistema.

**Código do teste pode ser acessado em :**  <https://github.com/MarceloDev100/senai-uc11-testes-gamemania/blob/main/codigo_teste_gamamania.jpg>

**Resultados e considerações**

O navegador foi aberto com sucesso , onde foi acessada a página inicial do site do Game Mania, permitindo a navegação para página de cadastro, onde os dados de um usuário fictício foram inseridos nos campos solicitados. O cadastro pôde ser realizado com sucesso, conforme mensagem exibida na tela e ao ser redirecionado para a página de login, os dados de usuário e senha foram preenchidos e a confirmação da operação foi feita com êxito (Vide mensagem de sucesso na tela da aplicação e no console durante a execução do teste).

---

**Execução do teste**

![Teste_game_mania 00_00_00-00_00_30](https://user-images.githubusercontent.com/88597534/146944658-4c372e9f-51a4-4bc3-b2b7-bcb648330746.gif)



