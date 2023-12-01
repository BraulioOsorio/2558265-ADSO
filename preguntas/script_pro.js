let contentProduts = null; 
let modal = null;
let RespuestasModal = null;


window.onload = function() {
    contentProduts = document.getElementById("contentProduts");
    RespuestasModal = document.getElementById("RespuestasModal");
    
    modal = new bootstrap.Modal(document.getElementById('Modal'), {
        keyboard: false,
        backdrop: "static"
    });


    getClients("http://192.168.1.7/preguntas/ObtenerPuntajes.php");
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
                        <td class="text-center">${data.puntajes[i].nombre}</td>
                        <td class="text-center">${data.puntajes[i].puntaje}</td>
                        <td class="text-center">${data.puntajes[i].fecha}</td>
                        <td class="text-center">
                            <button type="button" class="btn btn-primary text-center" data-bs-toggle="modal" data-bs-target="#exampleModal" onclick="abrirModal(${data.puntajes[i].id_puntaje})" data-id="${data.puntajes[i].id_puntaje}">
                                Preguntas
                            </button>
                        </td>
                    </tr>`;
            contentProduts.innerHTML += temp;
        }
    });
}
function abrirModal(indice){
    getpro("http://192.168.1.7/preguntas/ObtenerPreguntasPuntaje.php",indice);
    modal.show();

}
function getpro(endpoint, id_puntaje) {
    let datos = JSON.stringify({ id_puntaje: id_puntaje });
    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };
    fetch(endpoint, configuracion)
        .then(res => res.json())
        .then(data => {
            console.log(data);
            listaProductos = data.registros;
            RespuestasModal.innerHTML = "";
            let datos = ["No", "1917", "1776", "Amazonas", "Hierro", "Africa", "Tokio", "Gabriel García Marquez", "8", "Vincent van Gogh"];
            if(Array.isArray(data.registros) && data.registros.length > 0){
                for (var i = 0; i < data.registros.length; i++) {
                    temp = `<tr>
                        <td>${data.registros[i].descripcion}</td>
                        <td>${data.registros[i].respuesta}</td>
                        <td>${datos[i]}</td>
                        
                    </tr>`;
                    RespuestasModal.innerHTML += temp;
                }
            }
            
            
        })
        .catch(error => {
            console.error('Error al procesar la solicitud:', error);
        });
}




