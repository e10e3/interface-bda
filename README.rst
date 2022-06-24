===============
Interface BDA
===============

Application créée pour fournir une interface dans un projet.

Compilation
------------

Ce programme a été conçu en utilisant Netbeans. Vous avez la possibilité
d'importer ces fichiers dans Netbeans et d'utiliser la fonctionnalité incluse
de compilation. Pour obtenir un jar unique (avec tout inclus, sans
bibliothèques à côté), faites un clic droit sur le fichier ``build.xml`` dans
l'onglet *Fichiers* et sélectionnez l'option
``Run Target > Other Targets > package-for-store``.

Si vous avez envie de faire ça à la ligne de commande, exécutez la suivante :

.. code-block:: shell

	make default

Exécution du programme
-----------------------

Une fois que vous avez obtenu l'exécutable, vous pouvez le trouver dans le
dossier ``store/`` sous le nom ``configuration-verrou.jar``. Vous pouvez
l'exécuter en l'ouvrant comme pour les autres programmes si c'est dans
l'habitude de votre système d'exploitation.

Alternativement, vous pouvez utiliser la commande suivante :

.. code-block:: shell

	java -jar store/configuration-verrou.jar

Dépendances
------------

Ce programme utilise la bibliothèque de thème `FlatLaf
<https://www.formdev.com/flatlaf/>`_ en version 2.3. Elle est incluse dans le
répertoire ``lib/``.

Les icônes proviennent du thème Adwaita par le projet `GNOME
<https://gnome.org>`_, distribuées sous licence Creative Commons Attribution -
Partage dans les mêmes conditions (CC By-SA) 3.0.
