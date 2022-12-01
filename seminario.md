# Componentes de Navegação
**Data: 01/11/2022**

**Valor: 10 pontos**

**Grupo: Gabriella Souza Aguiar | Jeferson Constantino Junior | Mariana Turibio Gressi | Wallace Freitas Oliveira**

---
Durante a construção de interfaces gráficas é comum que tenhamos diversas funcionalidades e tarefas que podem ser executadas em determinada janela do sistema, no entanto quanto mais dessas incrementamos no programa, pior ficaria a interatividade do usuário com a interface, uma vez que seria bombardeado por botões para cada uma dessas possibilidades de interação. Nesse contexto, surge um mecanismo que visa facilitar a navegação e melhor organizar as funções, ferramentas e funcionalidades do programa executado, os Menus de Navegação.
Os menus em interfaces gráficas são regiões do sistema responsáveis por organizar, armazenar e prover as diversas funcionalidades do software no qual ele está definido, além de facilitar a navegação do usuário, no dia-a-dia quando navegamos por app’s podemos encontrá-los nos mais diferentes modos, barra superior, lateral, inferior, móvel, popUp etc…, e possuem geralmente associados a eles tarefas importantes da aplicação como salvamento, abertura de repositórios, entre outros.
Ao trabalharmos com o pacote Java Swing para construir nossas interfaces também podemos contar com essa importante ferramenta de manipulação do sistema através das classes JMenuBar, JMenu, JMenuItem, JToolBar entre outros que auxiliam a construção dos mais diferentes modelos de menu para nossa aplicação, abaixo abordaremos brevemente cada uma dessas Classes e qual o melhor cenário para aplicar cada uma delas.
JMenuBar - A classe JMenuBar é a responsável por reservar um campo na janela para que seja construído um menu de navegação, nela podem ser inseridos elementos do tipo JMenu, JMenuItem permitindo que usuário selecione alguma opção desses para interagir.

JMenu - A classe JMenu é uma implementação de um menu popUp vertical, que quando pressionado exibe uma lista de opções que podem ser executadas, essas opções por vez podem estar contidas em outro JMenu ou em um JMenuItem. Quando em um JMenu, a exibição do popUp do subItem é realizada horizontalmente e quando implementado um JMenuItem é executado um evento associado ao mesmo.

JMenuItem - A classe JMenuItem é uma implementação de botão de listas, que permite que ações sejam executadas a partir de um menu de navegação, sua utilização é associada aos JMenuBar contidos no sistema, e serve como botões clicáveis que serão exibidos quando o usuário interage com o JMenuBar que o contém permitindo o que o usuário execute sua funcionalidade nesse momento realizando um click no MenuItem.

JToolBar - A classe JtoolBar é a implementação da barra de ferramentas. É um grupo de componentes comumente usados, como botões ou menu suspenso, com a finalidade de permitir uma ação rápida por parte do usuário, facilitando o acesso a funções do programa. JToolBar pode ser arrastado para diferentes locais pelo usuário, tanto nas bordas quanto no meio da janela.






 
JMenuBar(): Cria um novo MenuBar.


JMenu(): Cria um novo Menu sem texto.
JMenu (nome da string): Cria um novo Menu com um nome especificado.
JMenu (String name, boolean b): Cria um novo Menu com um nome especificado e o
valor booleano especifica como um menu destacável ou não. Um menu destacável pode ser aberto e arrastado para fora de sua barra de menus ou menu pai.


JMenuItem(): Cria um sem texto ou ícone definido.
JMenuItem(Action a):Cria um item de menu cujas propriedades são retiradas do Action especificado.
JMenuItem(Icon icon): Cria um ícone especificado.
JMenuItem(String text): Cria um o texto especificado.
JMenuItem(String text, Icon icon): Cria o texto e o ícone especificados.
JMenuItem(String text, int mnemonic): Cria o texto especificado e teclado mnemônico.


JToolBar() : cria uma nova barra de ferramentas com orientação horizontal
JToolBar(int o): cria uma nova barra de ferramentas com orientação especificada
JToolBar(String n): cria uma nova barra de ferramentas com o nome especificado
JToolBar(String n, int o): cria uma nova barra de ferramentas com nome e orientação especificados.
