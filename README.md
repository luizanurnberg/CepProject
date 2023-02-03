# CepProject
Esta é a documentação para o uso e ensino do CepProject. Esse projeto possui o intuito de auxiliar na busca de CEPs os quais o usuário deseja ter um maior conhecimento. Desenvolvido em Java, atrelado a interface Java Swing, o sistema foi conectado ao Webservice ViaCEP (disponibilizado nas referências) para conseguir efetuar as requisições, imprimindo em tela a localidade daquele CEP em específico. 

Toda construção precisa de uma planta e com um Software não é diferente. Para saber o caminho que deveria trilhar no desenvolvimento do programa, levantei brevemente as informações mais importantes, as quais serão listadas abaixo.

# Requisitos
<b>Requisitos Funcionais:</b> <br>
1. O sistema deve manter usuário <br>
2. O sistema deve disponibilizar a localidade em escrito do CEP pesquisado <br>

<b>Requisitos Não Funcionais:</b> <br>
1. O sistema deverá integrar com o Webservice ViaCep <br>
2. O sistema permitirá buscar pelo CEP apenas se o usuário estiver logado <br>
3. A linguagem do sistema deverá ser de fácil compreensão <br>

<b>Regras de Negócio:</b> <br>
1. O cadastro/login do usuário não será finalizado caso algum campo esteja nulo  <br>
2. O sistema apresentará uma mensagem caso exista erro na requisição do CEP <br>
3. O sistema apresentará uma mensagem caso não encontre o CEP informado pelo usuário <br>

<u><b>Referências</b></u>
https://viacep.com.br/

# Classes implementadas
As classes desse projeto tiveram como padrão a língua inglesa e foram divididas em packages conforme seu tipo, sendo eles: <br>

<b>Model</b> <br>
![Screen Shot 2023-02-02 at 23 37 25](https://user-images.githubusercontent.com/116217246/216499290-e9032e64-22ee-4458-856c-e6baa0291417.png)
1. CepProjectModel - é a única classe que possui atributos em Português, para evitar problemas na integracão e conversão das informações vindas da API. Armazenará o registro para que seja possível mostrar na consulta apenas os dados mais pertinentes ao usuário<br>

<b>View</b> <br>
![Screen Shot 2023-02-02 at 23 45 05](https://user-images.githubusercontent.com/116217246/216500318-3fb9c48c-71fc-488b-bdb2-520ac5a946ab.png)
1. CepProjectView - tela para a consulta do CEP<br>
2. CepProjectViewLogin - primeira tela que abrirá ao rodar o sistema, sendo que apenas é possível acessar o serviço caso o usuário se cadastre ou faça login<br>
3. CepProjectViewSignUp - tela de cadastro<br>

<b>Controller</b> <br>
![Screen Shot 2023-02-02 at 23 25 55](https://user-images.githubusercontent.com/116217246/216498278-07e9facb-468f-4ccf-ab69-d3e46a8237a3.png)
1. CepProjectController - é o controlador principal do projeto, é nessa classe que as regras e integração com WebService são feitas<br>
2. CepProjectControllerLogin - é o controlador da tela de login, define como será a entrada do usuário já cadastrado<br>
3. CepProjectControllerSignUp - é o controlador da tela de cadastro, caso o usuário não possua seu registro salvo, então esse será efetuado conforme o definido<br>

<b>Exception</b> <br>
![Screen Shot 2023-02-02 at 23 51 05](https://user-images.githubusercontent.com/116217246/216501121-9286a7e0-e964-47b8-a573-81c576c44451.png)
1. CepProjectEmptyFieldException - será disparada quando qualquer qualquer campo que precise ser preenchido venha em branco<br>
2. CepProjectRequestException - é disparada quando o usuário tenta inserir algo no campo do CEP que possa gerar um erro na requisição<br>


# Testes
Para que possam ser realizados os testes dos requisitos definidos para esse projeto, é necessário seguir os passos abaixo:<br>

1. Possuir baixada a versão do NetBeans conforme a imagem abaixo<br>
![Screen Shot 2023-02-02 at 23 56 25](https://user-images.githubusercontent.com/116217246/216501882-b84d3bdc-51ec-47f8-a956-b487d67fd26d.png)
2. Executar clean and build no projeto para evitar erros<br>
3. Ao rodar o projeto, ele já estará pronto para ser testado<br>

# Retornos possíveis na consulta
1. Nem todos os CEPs possuem todas informações da consulta (cidade, logradouro e bairro). Dessa forma, o sistema apenas trará aquelas que forem respectivamente encontradas<br>
2. Ao inserir um CEP inválido, ou seja, que no retorno da requisição voltou sem nenhuma informação, será solicitado ao usuário que insira um valor válido<br>
3. Caso aconteça algum problema na requisição, sistema não gastará processamento tentando validar a informação inserida, podendo acontecer principalmente por um dado mal colocado<br>

# Implementações futuras
1. Cache para armazenar as informações em um determinado período de tempo, criado por meio de um HashMap<br>
2. Vincular um Hibernate ao projeto para melhores validações de login<br>
