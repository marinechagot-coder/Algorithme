/*
    Algorithme Convertisseur de temps
    Debut
    VARIABLE temps : REEL
    VARIABLE  heure, minute, seconde: ENTIER
    ECRIRE ("Quelle durée en seconde?")
    LIRE(temps)
    seconde=temps%60
    temps=(temps-seconde)/60
    minute=temps%60
    heure=(temps-minute)/60
    ECRIRE(heure+"h "+minute+"m "+seconde+"s")
    Fin*/
const prompt = require("prompt-sync")();
let temps = parseFloat(prompt("Quelle durée en seconde? "));
let seconde = temps % 60;
temps = (temps - seconde) / 60;
let minute = temps % 60;
let heure = (temps - minute) / 60;
console.log(`${heure}h ${minute}min ${seconde}s`);
