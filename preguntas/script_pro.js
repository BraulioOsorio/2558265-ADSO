let contentProduts = null; 


window.onload = function() {
    contentProduts = document.getElementById("contentProduts");


    getClients("http://192.168.143.31/preguntas/ObtenerPuntajes.php");
}

function getClients(endpoint) {

    fetch(endpoint)
    .then(res => res.json())
    .then(data => {
        console.log(data);  // Imprime la respuesta en la consola

        listaProductos = data.puntajes;
        contentProduts.innerHTML = "";
        for (var i = 0; i < data.puntajes.length; i++) {
            temp = ` <tr>
                        <td>${data.puntajes[i].nombre}</td>
                        <td>${data.puntajes[i].puntaje}</td>
                        <td>${data.puntajes[i].fecha}</td>
                    </tr>`;
            contentProduts.innerHTML += temp;
        }
    });
}

