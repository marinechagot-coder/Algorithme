const readline = require(`readline`);
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
rl.question("Temperature en °C?", (Tc) => {
  let Tf = (Tc * 9) / 5 + 32;
  console.log(`Temperature en F: ${Tf}`);
  rl.close();
});
