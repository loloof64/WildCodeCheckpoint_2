# Application d'inventaire de livres

Développer une application web qui permet de tenir un inventaire de livres.

## L'application doit permettre à l'utilisateur:
- d'alimenter une BD (représentant un inventaire/stock de livres) grâce à l'upload d'un fichier de livres (cf fichier books.xml ci-joint).
On considère que :
	* les catégories sont des données fixes qui ne seront pas amenées à 	évoluer.
	* les auteurs sont à stocker dans une table dédiée. On considère qu'il n'y pas d'homonymie possible entre eux.

	L'upload du fichier doit effectuer une mise à jour des 		enregistrements pour les livres déjà présents en BD.

- de visualiser la liste des livres de l'inventaire

## Figures imposées: 
- mise à dispo du code sur votre github
- appli Web Full Java: java 8 + hibernate obligatoires. (Pas de angular/react pour le front)
Autre que ça, pas de contrainte de frameworks ou techno.
- projet "buildable" par maven 
- au moins un test unitaire (plus si affinité) sur une méthode métier (autre qu'un getter ou setter) et réalisée en TDD (historique Git à l'appui)
- code sql de création de la BD à disposition sur le dépôt


## Si vous en voulez encore:
- mettre en place au niveau de l'affichage de l'inventaire le tri sur les colonnes nom, auteur, prix, quantité
- ajouter le filtrage par catégorie
- permettre l'édition d'un livre et de son stock par une page dédiée
