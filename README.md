# GEN Labo 4 Refactoring

> Jorge-André Fulgencio Esteves, Claude-André Alves

### But
Le but de ce laboratoire est de mettre en oeuvre les techniques de refactoring vues en cours. Le code à améliorer est dans le répertoire [Code Source Original](https://cyberlearn.hes-so.ch/mod/folder/view.php?id=967097). En particulier le fichier OrdersWriter.java, mais cela requiert certainement de modifier les autres fichiers et d'en créer / supprimer. Les contraintes suivantes sont à respecter.

-   Créez un projet Maven pour ce code  
-   Stockez ce projet sur GitHub
-   Ne commitez que du code passant les tests de OrdersWriterTest
-   Vérifiez la contrainte ci-dessus avec Travis

Il est demander d'appliquer les refactorings un par un, en commitant chaque changement. Pour chaque commit, il faut indiquer dans le message du commit le nom du refactoring appliqué, la classe/méthode/attribut/... auquel il est appliqué, et éventuellement quelle mauvaise odeur vous incite à l'appliquer.

### Type de mauvaise odeurs trouvées
- Large class
- Lazy class
- Innapropriate intimacy
- Data class
- Switch statements
- Speculative generality
- Dead code
- Long method

### Type de refactoring appliqué
Innapropriate intimacy : Move Method
Data class : Move Method
Switch statements : Replace Type Code with Subclasses
Speculative generality : Collapse Hierarchy
Dead code : Delete
Long method : split into others Methods
Large class : split, extract to subclasses
Lazy class : Inline class treatment