# Final assignment template

## Gegeven
- pom.xml met de benodigde dependencies
- initiële package & een JerseyConfig klasse
- Procfile & system.properties voor Heroku
- .gitignore file

## Ontwikkel
Een aquarium beheer systeem met (een functionele) frontend op basis van de technieken aangeboden tijdens Back End Programming. 

Het conceptuele domeinmodel staat, net als de rubriek voor de beoordelingsaspecten, op https://canvas.hu.nl/courses/7306/assignments/78255.

### Ontwikkel tips
Omdat ook het Object Oriented Programming onderdeel is van BEP, zul je zelf het domeinmodel moeten implementeren. Onthoud dat IntelliJ getters en setters voor je kan genereren, denk aan de werking van equals & contains. De complexiteit van de structuren kan beperkt worden tot String, int & boolean.
 
Ga uit van het conceptuele domeinmodel, maar werk iteratief, zo kun je blijven werken aan een werkend geheel. 
 
Commit & Push regelmatig je wijzigingen naar GitHub, zo kun je je voortgang garanderen en kan de docent je ook beter beoordelen, volgens hetzelfde model als bij een wiskundeproefwerk: 
_als de berekening op zich goed is, maar het antwoord door een rekenfout verkeerd, kun je nog steeds punten scoren voor de genomen stappen._
 
Gebruik dummy-data: blijf niet te lang fantaseren hoe het ongeveer zal gaan werken, maak er iets werkends van en test met realistische testdata zodat je in je hoofd inconsistenties sneller op kunt merken.
 
### Stel vragen, maar niet teveel
Zijn er onderdelen van de opdracht onduidelijk: neem contact op met je docent (in ieder geval via Discord op de ingeplande momenten)
 
Behandel deze opdracht echt als een eigen werkstuk, als je delen van je uitwerking deelt of baseert op dat van anderen kan dit als plagiaat worden gezien. 
 
Vragen over de opdracht zijn prima, vragen zoals "ik kom niet uit deze foutmelding" kun je bij je docent kwijt in de spreekkamer. 

Natuurlijk is het daarbij de bedoeling dat je al hebt gezocht op de discord server (veel is al gevraagd), de technische FAQ hebt gescreend en op internet hebt gekeken wat de foutmelding betekent. 

Je zou eigenlijk niets nieuws tegen moeten komen, maar we willen ook niet dat je opdracht sneuvelt, omdat je 3x over dezelfde constructiefout heen leest of een foutmelding toch verkeerd interpreteert. 
 
## Basis, wat testdata ter inspiratie
Docent Jos van Reenen heeft thuis drie aquaria, elk 30cm diep, 30cm hoog en 60cm breed, zgn 54 Liter tanks, 2 op zolder en 1 in de woonkamer.

Aquarium0 staat op dit moment leeg, maar bevat wel een intern filter (merk Tetra), een thermostaat op 26 graden en een Skimmer. Tevens zijn hier 2 griekse ornamenten aanwezig, 1 met en 1 zonder luchtpomp aansluiting.
 
Aquarium1 is van Zoonlief, bevat talloze vissoorten, maar in ieder geval 7 Kardinaal Tetra's, 6 Corydora's, maar ook 5 Japonica-garnalen en 2 Helena slakken. Hierin is een Spongebob, een ananashuis en een gezonken schip te zien.
In deze bak is een merkloos intern filter aanwezig, een thermostaat op 25 graden en een skimmer.

Aquarium2 is van Dochterlief, bevat 2 Corydora's, 5 Kardinaal Tetra's een CPO kreeft. Hierin zijn Anna en Elza te vinden alsook het ijskasteel van koningin Elza (alle drie geen luchtpomp aansluiting).
In deze bak is ook een merkloos intern filter aanwezig, en een thermostaat op 25 graden.

Planten laten we maar even buiten beschouwing. 