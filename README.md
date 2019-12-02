# convork
Write once, convert to multiple CSS frameworks

# Grupo:
João Pedro São Gregorio Silva, 726549
Lucas Yuji S. Aciole, 619680

# Como compilar
O projeto funciona com gradle, a task principal é o fatJar, que gera o jar do compilador

# Como rodar
O executavel possui 3 parametros:
- in: arquivo de entrada
- out: arquivo de saida
- target:  framework desejada, atualmente suporta material, bootstrap e foundation

# Exemplo de execução
java -jar cla.jar -in=entrada.txt -out=saida.html -target=foundation


