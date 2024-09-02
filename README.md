# Gestion de Bibliothèque en Java

Ce projet est une application de gestion de bibliothèque développée en Java. Il permet de gérer des documents tels que des livres et des magazines, incluant des fonctionnalités comme l'ajout, l'emprunt, le retour, l'affichage et la recherche de documents. L'application utilise une architecture en couches, comprenant une couche de présentation (interface utilisateur), une couche métier (gestion des documents et de la bibliothèque), et une couche utilitaire (gestion des dates).

## Fonctionnalités

- Ajouter un document (Livre ou Magazine) à la bibliothèque.
- Emprunter un document en fonction de son titre.
- Retourner un document en fonction de son titre.
- Afficher tous les documents disponibles dans la bibliothèque.
- Rechercher un document par titre .
- Gérer les dates des documents grâce à une classe utilitaire.

## Structure du Projet

Le projet est organisé en plusieurs packages :

- `presentation` : Contient la classe `ConsoleUI.java` qui gère l'interface utilisateur via la console.
- `metier` : Contient les classes métiers `Document.java`, `Livre.java`, `Magazine.java`, et `Bibliotheque.java` qui gèrent la logique de l'application.
- `utilitaire` : Contient la classe utilitaire `DateUtils.java` pour la manipulation des dates.

## Prérequis

- Java Development Kit (JDK) 8 ou version supérieure
- Un IDE compatible Java comme IntelliJ IDEA, Eclipse, ou VS Code

## Installation et Exécution

1. Clonez le projet depuis GitHub :

    git clone https://github.com/Radiaidel/gestion_bibliotheque.git
    cd gestion_bibliotheque

2. Compilez le projet avec la commande suivante :

    javac -d bin src/presentation/*.java src/metier/*.java src/utilitaire/*.java

3. Exécutez l'application en utilisant la classe ConsoleUI :

    java -cp bin presentation.ConsoleUI