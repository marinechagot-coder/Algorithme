const readline = require(`readline`);
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
rl.question("Votre prénom ?", (prenom) => {
  console.log(`Bonjour ${prenom}`);
  rl.close();
});
