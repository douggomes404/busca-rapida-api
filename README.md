Nessa API, temos um modelo de CRUD para uma loja de calças, é possivel através de requisições HTTP,
realizar buscas no estoque da loja, inserir novos produtos, alterar produtos existentes, e deletar produto.

A API foi desenvolvida em Spring Boot, utilizando a metodologia MVC. 

######

Metodos que contemplam a API

listarProdutos()
	Esse metodo espera uma requesição HTTP do tipo GET na URL: localhost:8090/buscar/produtos
	Ela busca todos os produtos cadastrados no banco de dados e traz para a aplicação um Json com as informaçãos .

listarProdutoUnico(id)
	Esse metodo espera uma requesição HTTP do tipo GET na URL: localhost:8090/buscar/produto/ID-DO-PRODUTO
	Ela busca o produto cadastrado no banco de dados com aquele id e traz para a aplicação que a chamou um Json com as informações. 

salvaProduto()
	Esse metodo espera uma requesição HTTP do tipo POST na URL: localhost:8090/buscar/produto
	A API espera uma requesição com cabeçalho:
	Content-Type = application/json
	No Json que será enviado para a API é esperado que tenham os seguintes dados:
	"nomeProduto": Tipo Character
	"qntestoque": Quantia em estoque
	"preco": Tipo Float
	Recebendo esses dados a API salva os dados na base de dados. 

deleteProduto()
	Esse metodo espera uma requesição HTTP do tipo DELETE na URL: localhost:8090/buscar/produto
	Essa requisição deve conter os dados do produto para que seja apagado do banco
	Recebendo esses dados a API deleta os dados na base de dados caso eles existam. 
	
atualizaProduto()
	Esse metodo espera uma requesição HTTP do tipo POST na URL: localhost:8090/buscar/produto
	A API espera uma requesição com cabeçalho:
	Content-Type = application/json
	No Json que será enviado para a API é esperado que tenham os seguintes dados:
	"nomeProduto": Tipo Character
	"picture": Caminho da imagem para salvar no banco de dados
	"preco": Tipo Float
	Recebendo esses dados a API salva os novos dados na base de dados.

Essas configurações estão no arquivo ProdutoController.java (/src/main/com.apibuscarapidaapi/controller)

#######

As configurações de acesso ao banco de dados, devem ser feitas no arquivo application.properties (../src/resources)

#######
 
 As configurações de tabelas que podem ser criadas e as existentes, estão na pasta model (/src/main/com.apibuscarapidaapi/model).
 Aqui podemos definir as configurações de tabelas do banco de dados e criar novas relações, nesse arquivo podemos definir getters e setters.
 
#######

O repositorio que faz a integração e consultas fica na pasta repository (/src/main/com.apibuscarapidaapi/repository)
ele extende para uma class de consulta a banco de dados (CrudRepository).
