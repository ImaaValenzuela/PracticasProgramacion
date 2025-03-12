
const persona = { nombre: "Ana", edad: 25 };
const direccion = { ciudad: "Madrid", pais: "España" };

// Copia del objeto persona
const personaCopia = {...persona};

// Combinación de persona y dirección
const personaCompleta = {...persona, ...direccion};

console.log(personaCopia);
console.log(personaCompleta);