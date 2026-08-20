# Challenge_Shape
DESSINER DES FORMES GEOMETRIQUES 
DANS UNE INTERFACE GRAPHIQUE

# Intervenants
Mathieu Fix, Raphael Audouard, Philippe Peyrous, Paul pinsolle 

# Objectifs

Ce projet a été réalisé afin de mettre en pratique les notions suivantes :

-le développement Poo Java 

-Les noms de classes, attributs, méthodes et variables doivent être explicites, 
compréhensibles de tous, adaptés et en ANGLAIS

-Utiliser la Javadoc

-l'utilisation de git et de github

- Le travail collaboratif

- représentation graphique

# Enoncé de l' exercice :

- - - 
    Dans un premier temps, vous allez réaliser le TP sur les formes géométriques vu dans 
le cours (classes Shape, Square, et Circle) puis le tester pour obtenir le même 
résultat, puis ajouter la couche métier (voir slide sur l’interface) 

    Puis, étudier la classe Graphic.java afin de comprendre comment dessiner des formes 
géométriques dans une IHM avec Java.

    Enfin, vous devez réaliser une application interagissant avec une couche métier 
représentée par l’implémentation IJobImpl afin de gérer plusieurs formes 
géométriques qu’il faudra afficher chaque fois que votre IHM est 
redimensionnée(rafraîchit) : 
Circle c1 = new Circle(20 , 30 , 50); //rayon + x + y 
Point p = new Point( 100 , 150); 
Circle c2 = new Circle(15,p); 
Square s1 = new Square(50 , 200 , 200); //cote + x + y 
Square s2 = new Square(65, 200 , 50); 
Circle c3 = new Circle(30 , 300 , 300); //rayon + x + y 

NB : une forme géométrique est bien placée pour savoir comment elle doit se dessiner 

    Consignes : c’est un travail de groupe aussi tous les membres du groupe doivent coder (dans 
la mesure du possible), et vous devrez expliquer le rôle de chacun(e) dans la répartition des 
tâches (dans la mesure du degré d’implication/motivation). L'idée reste de permettre à tout 
le groupe d'apprendre!


# Technologies utilisées

- Java 8
- Git / GitHub

# Organisation du code

Main
  │
 crée
  ↓
La fenetre new JFrame
  │
 puis crée
  ↓
La surface de dessin 
  │
 puis crée les formes
  ↓
panel.addShape(new Circle(20,30,50));
Point p = new Point(100, 150);
panel.addShape(new Circle(15,p));
panel.addShape(new Square(50,200,200)); 
  │
 ajoute la surface dans la fenêtre
  ↓
frame.add(panel);
  │
ajoute la surface dans la fenêtre
  ↓
frame.setSize(600, 400);
  │
configure ce qui doit se passer à la fermeture de la fenêtre
  ↓
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  │
maintenant que tout est configuré
  ↓
On affiche la fenêtre
frame.setVisible(true);
