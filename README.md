# Java-COMPLETO-Programa-o-Orientada-a-Objetos

#Projeto: Course
# Objetivo Principal dos Programas: 
1. O objetivo central é demonstrar o uso de Programação Orientada a Objetos (POO) em Java para:Modelar um Triângulo como uma classe, encapsulando seus dados (lados) e a lógica para calcular sua área. 
2.  Criar um programa principal que instancia e manipula dois triângulos (X e Y) distintos.Comparar as áreas calculadas de X e Y para determinar e informar qual deles possui a maior área.
3.  Como os Arquivos Funcionam Juntos1. O Molde: Triangle.java (Classe de Entidade)Este arquivo atua como o molde ou a definição do que é um triângulo no contexto do programa.Dados (Atributos): Ele armazena os três lados (a, b, c) como variáveis do tipo double.
4.  Comportamento (Método): Ele define o método area(), que calcula a área do triângulo ao qual for aplicado.Fórmula Usada: É a Fórmula de Herão, que utiliza o semiperímetro ($p$).$$p = \frac{a + b + c}{2.0}$$$$\text{Área} = \sqrt{p \times (p - a) \times (p - b) \times (p - c)} $$2.
5.  A Execução: Program.java (Classe Principal)Este arquivo é o ponto de entrada e a lógica de controle do sistema.Configuração: Configura o Locale para aceitar o formato de número americano (.) e inicializa o Scanner para entrada de dados.Instanciação (Criação de Objetos):Cria duas variáveis, x e y, e as inicializa como novos objetos da classe Triangle (Instâncias)
6.  .Isso significa que x e y são triângulos separados com seus próprios conjuntos de lados ($a, b, c$).
7.  Interação com o Usuário: Solicita ao usuário que insira as três medidas para o triângulo X e, em seguida, para o triângulo Y.Cálculo e Comparação:Chama o método x.area() e y.area() para obter as áreas.
8.  Imprime as áreas formatadas com 4 casas decimais.
9.  Usa uma estrutura if/else para comparar areaX e areaY e exibe na tela qual letra (X ou Y) corresponde à maior área

#Projeto: Projeto1
#Fazer um programa para ler os dados de um produto em estoque (nome, preço e
#quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
Para resolver este problema, você deve criar
uma CLASSE conforme projeto ao lado:
