# **API REST - Principais observações**

### A *Application Programming Interface* (API), é um software de interface encarregado de tornar possível a comunicação entre dois sistemas diferentes.
  No caso das APIs REST (*Representational State Transfer*), são APIs construídas em um protocolo de funcionamento baseado na arquitetura REST. Nesse sentido, REST é um estilo arquitetural para sistemas distribuídos, baseado em um conjunto de princípios que incluem a utilização de recursos, identificados por URLs, e a manipulação desses recursos por meio de operações padrão do protocolo HTTP, como GET, POST, PUT e DELETE. Isso permite que as APIs sejam intuitivas e fáceis de entender, de forma que a comunicação é facilmente realizada e programada pelos programadores. Ou seja, é uma arquitetura que visa, por meio do protocolo HTTP, facilitar o funcionamento e programação da interface.

  Nesse sentido, é válido salientar que todo o funcionamento das APIs REST são baseadas em funcionamento por meio de buscas e coletas de informação por meio de internet, por isso as URLs únicas para cada retorno de request de informação são únicos. Inclusive, o link de URL com o retorno da request é definido também pelo tipo de arquivo requerido, de forma que, para um mesmo request, caso seja feito requisitando um arquivo .XML ou .JSON, os endereços URL tem uma exclusividade que permite uma proibição nativa de repetição ou sobreposição de dados, de forma que a atualização das informações não exclui informações anteriores, a não ser que a API seja programada para excluir os dados.

### Com isso, podemos listar alguns pontos importantes sobre esse tipo de aplicação

1. As APIs REST modelam os recursos (ou entidades) que estão sendo manipulados, como usuários, posts ou pedidos, de forma que retornam o tipo de arquivo solicitado na request. Cada recurso é identificado por uma URL única.

2. As operações padrão do protocolo HTTP são utilizadas para manipular esses recursos, o que as tornam muito intuitivas. Por exemplo, GET é usado para recuperar recursos, POST para criar novos recursos, PUT para atualizar recursos existentes e DELETE para remover recursos.

3. Os recursos geralmente são representados em formatos como JSON ou XML, que são formatos de dados comuns e facilmente processáveis por diferentes tipos de aplicativos. Vale lembrar que isso pode ser modificado dependendo da necessidade do usuário.

4.  As APIs REST são stateless, o que significa que cada solicitação do cliente contém todas as informações necessárias para que o servidor entenda e processe a solicitação, sem depender de nenhum estado mantido pelo servidor entre as solicitações.

5.  As APIs REST são altamente flexíveis e escaláveis, permitindo que os sistemas sejam facilmente expandidos e modificados à medida que as necessidades mudam.

6.  As APIs REST podem ser consumidas por uma ampla variedade de clientes, incluindo aplicativos web, móveis e de desktop, independentemente da plataforma ou tecnologia utilizada.

### Exemplos de API REST

As APIs REST estão mais presentes no cotidiano social atual do que imagina-se. Portanto, é importante listar alguns desses aplicativos que integram dois ou mais sistemas de forma constante na sociedade digital atual.

1. API do Facebook Graph: O Facebook fornece uma API RESTful chamada Graph API, que permite que os desenvolvedores acessem e interajam com dados do Facebook, como perfis de usuário, publicações, fotos, eventos e muito mais. Ela é usada em uma variedade de aplicativos e serviços que integram funcionalidades do Facebook.

2. API do OpenWeatherMap: Esta API fornece dados meteorológicos em tempo real e previsões para diferentes localidades em todo o mundo. Ela é amplamente utilizada em aplicativos e serviços que exibem informações sobre o clima.

3. API do Twitter: A API do Twitter permite que os desenvolvedores criem aplicativos que interajam com a plataforma do Twitter, como enviar tweets, ler tweets, obter informações sobre usuários e tendências, entre outras funcionalidades.

4. API do GitHub: O GitHub fornece uma API RESTful que permite que os desenvolvedores acessem e interajam com repositórios, commits, pull requests, problemas e outros recursos do GitHub. Ela é utilizada em uma variedade de ferramentas e serviços que integram funcionalidades do GitHub.

5. API do Google Maps: Muitos aplicativos e serviços, como Uber, Airbnb e TripAdvisor, utilizam a API do Google Maps para fornecer funcionalidades de mapas, geolocalização, rotas e informações sobre pontos de interesse.

6. API do YouTube: A API do YouTube permite que os desenvolvedores acessem e integrem vídeos, listas de reprodução, comentários e outras informações relacionadas ao YouTube em seus próprios aplicativos e serviços.

### Considerações Finais

  As APIs REST são importantes interfaces de comunicação ente sistemas que integram boa parte do funcionamento do mundo digital atual. Desde a verificação do clima no navegador até o recebimento de localização no Whatsapp, as APIs se mostram presente de forma constante no dia a dia das pessoas do século XXI. Assim, com base em requests simples em protocolo HTTP, elas realizam procedimentos e buscas de informação que fazem a internet e diversos outros sistemas funcionarem para o adequado funcionamento do mundo moderno.
   




