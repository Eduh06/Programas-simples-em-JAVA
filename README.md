# Programas-em-Java
 Guia de Iniciantes
 
Tutorial JAVA


-----------------------Comandos-------------------------------------------------

Comandos esão separadas por um ponto-vírgula. É permitido colocar vários comandos sobre a mesma linha.

Comandos são organizadas em blocos definidos por chaves {...}. Em especial, classes e métodos são blocos. Blocos podem conter outros blocos.

Nomes de variáveis devem começar com uma letra, um caráter de sublinhado _ ou um cifrão $. Não podem começar por um número.

É convencional (mas não obrigatório) usar uma letra minúscula para a primeira letra do nome de uma variável.

Todas as variáveis de tipos primitivos precisam ser declaradas e inicializadas, através de uma instrução da forma
  
 // EXEMPLO : < tipo > NomeDaVariavel = < valor>;
 


   ----------------------OPERADORES-------------------------------------------------

igual a  ==

diferente de !=

menor que  <   

maior que >
  
menor ou igual a <=	

maior ou igual a >=

&&	E ("logical AND")	a && b	retorna true se a e b forem ambos true. Senão retorna false. Se a for false, b não é avaliada.

&	E ("boolean logical AND")	a & b	retorna true se a e b forem ambos true. Senão retorna false. Ambas expressões a e b são sempre avaliadas.

||	OU ("logical OR")	a || b	retorna true se a ou b for true. Senão retorna false. Se a for true, b não é avaliada.

|	OU ("boolean logical inclusive OR")	a | b	retorna true se a ou b for true. Senão retorna false. Ambas expressões a e b são sempre avaliadas.

^	OU EXCLUSIVO ("boolean logical exclusive OR")	a ^ b	retorna true se a for true e b for false ou vice-versa. Senão retorna false

!	NÃO ("logical NOT")	!a	retorna true se a for false. Senão retorna false



-----------------------MOSTRAR DADOS SAIDA--------------------------------------

System.out.println(****) (texto normal)                                         

System.out.printf(“%.2f%n”)  (limitando o numero de casas decimais)


-----------------------ENTRADA DE DADOS------------------------------------------------

Scanner sc = new Scanner (System.in); ( associar teclado ao programa)

Sc.close(); final do programa para encerrar recurso

X= sc.next();     (associa o que digitar ao valor de x)


----------------------FUNÇÕES MATEMATICAS-----------------------------------------------

A= Math.sqrt(x)  (variável A recebe raiz quadrada de X)

A= Math.pow(x, y)  (variável A recebe resultado de x elevado a y)




-----------------------ESTRUTURAS JAVA---------------------------------------------------

comando sujeita a uma condição:

  if( <condição> ) <comando>;
 
A variável ou expressão condição deve ser do tipo boolean. O comando é executado se condição possuir o valor true.

 Para executar vários comandos sujeitos a uma condição, coloca-se os comandos num bloco:
  
 if( <condição> ){
   
 <comando 1>;
   
  <comando 2>;
  
   <...
 
  }
        
Para executar certos comandos caso uma condição for satisfeita, e outros comandos caso contrário:
 
  if( <condição> ){
   
   <comando 1>;
    
    <comando 2>;
     
  }
     
  else{
     
    <comando 3>;
     
    <comando 4>;
     
  }
     
No este exemplo, comando 1 e comando 2 são executados se condição for true. Caso contrário, comando 3 e comando 4 são executados.

O operador ?: pode ser utilizado em certos casos simples como um atalho para a estrutura if...else
     
  <variável> = <condição> ? <valor 1> : <valor 2>;
   
Aqui, <variável> recebe <valor 1> se <condição> for true e <valor 2> se <condição> for false.
   
Escolhas múltiplas de comandos a serem executados, dependendo do valor de uma variável, podem ser implementadas da seguinte maneira:
   
  switch( <controle> ){
   
    case <valor 1>:
   
      <comando 1>;
       
      <comando 2>;
       
      break;
       
    case <valor 2>: case <valor 3>:
       
      <comando 3>;
       
      <comando 4>;
       
      break;
       
    case <valor 4>:
       
      ...
       
      break;
       
    default:
       
      <comando 5>;
       
  }
       
O <controle> deve ser de tipo int ou char. Se ele assume o <valor 1>, <comando 1> e <comando 2> são executados. O comando break determina então a saida do bloco.
       
Se o <controle> assume o <valor 2> ou o <valor 3>, <comando 3> e <comando 4> são executados. O comando break de novo determina a saida do bloco, etc.
       
O <comando 5> é executado se o valor do <controle> é diferente de todos os valores listados.




