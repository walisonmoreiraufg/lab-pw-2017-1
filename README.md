# lab-pw-2017-1

Laboratório da turma de Programação para Web.

## Para rodar o projeto

### Para fazer clone.

`git clone https://github.com/walison-moreira-ufg/lab-pw-2017-1`

### Para rodar com o Tomcat.

`mvnw tomcat7:run`

Para rodar com o Tomcat ignorando as configurações do plugin no `pom.xml`.

`mvnw org.apache.tomcat.maven:tomcat7-maven-plugin:run`

## Para acessar a aplicação

`http://localhost:8080/lab-pw-2017-1` em qualquer navegador.

### Para "empacotar" a aplicação.

`mvnw package`

## Sobre a construção do projeto

Ações que foram feitas para que o projeto funcionasse como está atualmente.

### Para "embutir" o Maven no projeto.

Opcional mas importante para facilitar a manipulação do projeto em ambientes que não têm Maven.

`mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9`

Esse comando cria oas arquivos "mvn.cmd", "mvn" e "./mvn".

No Linux, dê permissão de execução ao arquivo **mvnw** executanto `chmod +x mvnw`.

Se o arquivo `mvnw` estiver com a propriedade de execução definida no Git, então essa definição manual de permissão não é necessária.

Para definir a propriedade de permissão de execução no arquivo `mvnw` no git:

`git update-index --chmod=+x mvnw`

