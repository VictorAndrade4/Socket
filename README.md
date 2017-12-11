# Sockets: 
### Sockets: 
Soquete de rede é um ponto final de um fluxo de comunicação entre processos através de uma rede de computadores. Hoje em dia, a maioria da comunicação entre computadores é baseada no Protocolo TCP/IP, portanto a maioria dos soquetes de rede são soquetes de Internet.


##1 - Versão Básica
	A versão básica do projeto consiste em um programa ‘Echo’. Ou seja, o cliente manda dados para o servidor, que recebe e retorna os mesmos dados ao cliente.
	O diálogo entre Cliente->Servidor termina assim que a palavra “Bye” é enviada do cliente ao servidor. Para a realização desse teste, foram utilizados dois terminais no Linux, cada um executando um programa.
> Para a execução em diferentes máquinas, o IP deverá ser alterado no código do Cliente (EchoClient). 
O código pode ser encontrado em:www.cs.uic.edu/~troy/spring05/cs450/sockets/socket.html

##2 - Versão Completa
A versão completa age da seguinte forma: 
O cliente avisa qual arquivo deseja receber. 
O servidor lê o arquivo e passa uma string ao cliente contendo os dados do arquivo.
Funciona de maneira análoga à um browser.
Neste Exemplo, o Cliente requisita o documento “dois.txt”, localizado em: “/home/victorandrade/workspace/Socket/” no computador que era o servidor.
> Para a reprodução deste programa, o diretório onde se encontra o arquivo texto deverá ser atualizado. 
O Servidor recebe a requisição do Cliente, lê o arquivo e manda o conteúdo do arquivo ao cliente.

