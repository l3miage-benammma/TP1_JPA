##### Binome BOUGUESSA NOUR ET BENAMMAR MAHMOUD

## Compte rendu TP1:

### EXO1:
1) Apres le changement dans le fichier application.yml de ddl-auto a la valeur create-drop on a constaté que:

- qu'on a plus besoin de l'annotation @Column pour creer une colonne.


2) les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo:

- l'annotation @Column(unique = false) Cela garantit les valeurs dans la colonne testName ne sont pas unique à travers la table.
- l'annonataion @Column(precision = 1) Cela définit la précision décimale de la colonne jpaSeed. Elle affiche un seul numéro apres la virgule.
- @Column() cette annontation ne prend pas de parametre donc elle utilise les conventions par defaut.

3) Les annotations @Column sont nécessaires dans quelques cas par exemple :

- Personnalisation du nom de la colonne : Si on voulait que le nom de la colonne dans la base de données soit différent du nom du champ dans la classe.

- Non-nullabilité : Pour indiquer que la colonne ne peut pas contenir de valeurs NULL avec nullable = false.

- Spécification de la longueur de la colonne : Par exemple, pour les chaînes de caractères où vous voulez définir une longueur maximale avec length.

- Autres paramètres spécifiques : Comme les options d'indexation.

