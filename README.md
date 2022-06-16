
## Utilisation de la base de données
l'utilisation se fait grace à cette commande

```bash
 spring.datasource.url= jdbc:h2:mem:rec
  
```

 ## Liste des entités cree(classes)
les entités seront les tables grace aux annotations jpa
 ```bash
Branche
CalculatedREC
Cedants 
 ConfirmationStatus
 Country
 PublicationDate
 Reference
 ValidationStatus
  
```

 ## Liste des Repository
 le repository permet de contacter la base de donnée afin de récupérer
 les informations qui s'y trouvent.

 ```bash
 BrancheRepository
 CalculRecRepository 
 CedantsRepository
 ConfirmationStatusRepository
 CountryRepository 
 PublicationDateRepository
 ReferenceRepository
 ValidationStatusRepository
  ```
   ## Spring Data Rest
 ```bash
 @RepositoryRestResource(collectionResourceRel = "validation"
, path ="validation")
  ```

l'annotation  @RepositoryRestResource récupéra les données du repository sur lequel il a été ajouté.

path détermine le chemin pour accéder aux données de la base de données(ValidationStatusRepository)

 ## Service
 Permet des creer une interface CalculatedRECImpl 
 et une classe CalculateRec qui implémente l'interface.
 - CalculatedRECImpl definit une méthode 
 qui permet de calculer le REC.
 - CalculateRec implémente l'interface donc la méthode 
qui calcule le REC.

 ## Controller
Permet des creer une classe calculreccontroller qui 
Définis les routes pour accéder à la valeur  retournée de la fonction calculer qui est 
 calcule le REC

