# ImportacaoExportacaoJson
Importação e Exportação de arquivos JSON em Java


Realizar o dowload do jar Json Simple http://www.java2s.com/Code/Jar/j/Downloadjsonsimple111jar.htm e importar no Java Build Path:

![alt text](/imagens/json-simple.png "Json Simple")


Após a configuração do jar e download do projeto, será possivel criar um arquivo.json "novoTime.json" e exibir na saída do console:


![alt text](/imagens/EscritaArquivoJSON.png "Escrita Arquivo JSON")

*Como padrão o arquivo gerado "novoTime.json" é salvo no diretório do projeto, mas pode ser alterado aqui: 


![alt text](/imagens/caminhoJson.png "Caminho Arquivo JSON")

Já para importação do arquivo JSON "timesGauchao2017.json" será feita a transformação para uma classe java e jogado em uma lista da Entidade TimeFutebol.java, essa é a saída do console que mostra o resultado da importação:


![alt text](/imagens/LeituraArquivo.png "Leitura Arquivo JSON")
