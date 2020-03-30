Implementare in TDD una classe che rappresenti l'oggetto Frazione


Step1 Test: 
Fraction: Costruttore
getInverse, operatore unario
Step 1.5 red, green, green commit

Step2 Test:
product, sum, subtraction, division STATICI
isProper boolean, unario
Step2.5 red, green, green commit

Step3 Test
reduce: semplifica la frazione
Step4 Implementazione di reduce

Step5
toString   (con annotation)
equals     
implements Comparable

Step6
Utilizzo del pattern Strategy per stabilire
con quale criterio eseguire le operazioni,
ossia se semplificare le frazioni prima e
dopo il calcolo.
i.e. (2/3).equals(4/6) è lo stesso numero?