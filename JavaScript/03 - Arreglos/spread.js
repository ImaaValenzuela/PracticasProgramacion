const frutas = ["🍎", "🍌", "🍇"];
const verduras = ["🥕", "🥦", "🌽"];

const alimentos = frutas.concat(...verduras);
console.log(alimentos); // ["🍎", "🍌", "🍇", "🥕", "🥦", "🌽"]

const nuevoAlimento = "🍕";

const nuevosAlimentos = frutas.concat(...nuevoAlimento, ...verduras);

console.log(nuevosAlimentos);
