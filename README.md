# lab-pw-2017-1
Laboratório da turma de Programação para Web.

## Para rodar o projeto

### Para fazer clone.

`
git clone https://github.com/walison-moreira-ufg/lab-pw-2017-1
`
### Para rodar com o Tomcat.

`
mvn org.apache.tomcat.maven:tomcat7-maven-plugin:run
`

### Para "empacotar" a aplicação.

`
mvn package
`

## Para "preparar" o projeto

### Para "embutir" o Maven no projeto.

Não precisa fazer isso! Já foi feito. :)

`
mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9
`