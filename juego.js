// Función para iniciar el juego
function jugar() {
    // Obtiene las entradas de los jugadores y las convierte a minúsculas
    const j1 = document.getElementById('jugador1').value.toLowerCase().trim();
    const j2 = document.getElementById('jugador2').value.toLowerCase().trim();

    // Verifica si las entradas son válidas
    if (!esOpcionValida(j1) || !esOpcionValida(j2)) {
        document.getElementById('resultado').textContent = "Entrada inválida. Usa piedra, papel o tijeras.";
        return;
    }

    // Determina el resultado del juego
    if (j1 === j2) {
        document.getElementById('resultado').textContent = "Empate";
    } else {
        const ganador = determinarGanador(j1, j2);
        document.getElementById('resultado').textContent = "Gana el jugador " + ganador;
    }
}

// Función para verificar si la opción es válida
function esOpcionValida(opcion) {
    return opcion === "piedra" || opcion === "papel" || opcion === "tijeras";
}

// Función para determinar el ganador
function determinarGanador(j1, j2) {
    let ganador = 2; // Por defecto, asume que el jugador 2 gana
    switch (j1) {
        case "piedra":
            if (j2 === "tijeras") {
                ganador = 1;
            }
            break;
        case "papel":
            if (j2 === "piedra") {
                ganador = 1;
            }
            break;
        case "tijeras":
            if (j2 === "papel") {
                ganador = 1;
            }
            break;
    }
    return ganador;
}
