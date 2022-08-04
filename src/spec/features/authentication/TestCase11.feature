@publication
Feature: Je me connect a l'application  OrangeHRM
  En tant que utilisateur je souhaite publier un post sur l application

  Background: 
    Given Je me connect a l application OrangeHRM 
    When Je saisis Username 
    And Je saisis le password 
    And Je clique sur le bouton login

  @connexion
  Scenario Outline: Authentification a l application OrangeHRM
    And Je clique sur le module Buzz
    And Je saisis un message dans le champ mind
    And Je clique sur le bouton post
    Then Je verifie l affichage de message
    And Je me deconnecte de l application OrangeHRM

    Examples: 
      | Username | password    |
      | Admin    | admin123    |
      | Admin1   | admin123102 |
