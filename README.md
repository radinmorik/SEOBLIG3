Startet med å koble intellj til github ved å logge inn med github inne på intellj. Også trykket jeg på "share this project on github" og da lagde intellj en repository med all test koden for meg.
Etter det la jeg til "testlogging" koden inn til build.gradle.

Jeg lastet ned gradle pluginen inne på actions på github.
Fikk en execute feil med gradle builden, som jeg måtte fikse ved å gi gradlew permission til å kjøre på git med en permission kommando inne på terminalen. 
Etter det gikk jeg inn på gradle.yml filen inne på github actions, og la til:    
    - name: Testing
      run: gradle test
      
Får å kjøre testen med gradle.
