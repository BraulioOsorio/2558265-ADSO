let contentClients = null;
let listaPersonas = null;
let formInsertarUsuario = null;
let modalCrearUsuario = null;
let modalEditarUsuario = null;
let formEditarUsuario = null;
let waitContent = null;
let modalEliminarUsuario = null;
let formEliminarUsuario = null;

window.onload = function(){
    contentClients = document.getElementById("contentClients");
    waitContent = document.getElementById("waitContent");
    formInsertarUsuario = document.getElementById("formInsertarUsuario");
    formInsertarUsuario.addEventListener("submit",function(event){
        event.preventDefault();
        crearPersona();
    });

    modalCrearUsuario = new bootstrap.Modal(document.getElementById('modalCrearUsuario'), {
        keyboard: false,
        backdrop: false
    });

    modalEditarUsuario = new bootstrap.Modal(document.getElementById('modalEditarUsuario'), {
        keyboard: false,
        backdrop: false
    });
    modalEliminarUsuario = new bootstrap.Modal(document.getElementById('modalEliminarUsuario'), {
        keyboard: false,
        backdrop: false
    });
    formEditarUsuario = document.getElementById("formEditarUsuario");
    formEditarUsuario.addEventListener("submit",function(event){
        event.preventDefault();
        editarPersona();
    });

    formEliminarUsuario = document.getElementById("formEliminarUsuario");
    formEliminarUsuario.addEventListener("submit",function(event){
        event.preventDefault();
        eliminarPersona();
    });

    getClients("http://localhost/APIenPHP/Clientes/Obtener.php");


}

function getClients(endpoint){
    waitContent.style.display = "block";
    fetch(endpoint)
    .then(res => res.json())
    .then(data=>{
        listaPersonas = data.registros
        contentClients.innerHTML = "";
        for (var i= 0; i < data.registros.length ;i++) {
            temp = ` <tr>
                        <td>${data.registros[i].cedula}</td>
                        <td>${data.registros[i].nombres}</td>
                        <td>${data.registros[i].apellidos}</td>
                        <td>${data.registros[i].telefono}</td>
                        <td>${data.registros[i].direccion}</td>
                        <td>${data.registros[i].email}</td>
                        <td>${data.registros[i].rol}</td>
                        <td>
                            <button class="btn btn-primary" onclick="abrirModalEditar(${i})">Editar</button>
                        </td>
                        <td>
                            <button class="btn btn-danger" onclick="confirmarEliminacion(${i})">Eliminar</button
                        </td>
                    </tr>
        
            `
            contentClients.innerHTML += temp;
        }
        waitContent.style.display = "none";
    });
}

function abrirModalEditar(indice){
    document.getElementById("campo_editar_cedula").value = listaPersonas[indice].cedula;
    document.getElementById("campo_editar_nombres").value = listaPersonas[indice].nombres;
    document.getElementById("campo_editar_apellidos").value = listaPersonas[indice].apellidos;
    document.getElementById("campo_editar_telefono").value = listaPersonas[indice].telefono;
    document.getElementById("campo_editar_direccion").value = listaPersonas[indice].direccion;
    document.getElementById("campo_editar_email").value = listaPersonas[indice].email;
    modalEditarUsuario.show();

}

function confirmarEliminacion(indice){
    document.getElementById("campo_eliminar_cedula").value = listaPersonas[indice].cedula;
    document.getElementById("campo_eliminar_nombres").value = listaPersonas[indice].nombres;
    document.getElementById("campo_eliminar_apellidos").value = listaPersonas[indice].apellidos;
    document.getElementById("campo_eliminar_telefono").value = listaPersonas[indice].telefono;
    document.getElementById("campo_eliminar_direccion").value = listaPersonas[indice].direccion;
    document.getElementById("campo_eliminar_email").value = listaPersonas[indice].email;
    modalEliminarUsuario.show();
}

function crearPersona(){
    let datos = new FormData(formInsertarUsuario);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Clientes/Insert.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            formInsertarUsuario.reset();
            modalCrearUsuario.hide();
            getClients("http://localhost/APIenPHP/Clientes/Obtener.php");
            swal('Creado con Exito','Se a creado el usuario con exito','success');
            
        }else{
            swal('Error','No se a podido insertar el usuario','error');
        }
    });
}

function editarPersona(){
    let datos = new FormData(formEditarUsuario);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Clientes/update.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            formEditarUsuario.reset();
            modalEditarUsuario.hide();
            getClients("http://localhost/APIenPHP/Clientes/Obtener.php");
            swal('Modificado con Exito','Se a modificado el usuario con exito','success');
            
        }else{
            swal('Error','No se a podido modificar el usuario','error');
        }
    });
}

function eliminarPersona(){
    let datos = new FormData(formEliminarUsuario);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Clientes/delete.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            formEditarUsuario.reset();
            modalEliminarUsuario.hide();
            getClients("http://localhost/APIenPHP/Clientes/Obtener.php");
            swal('Eliminado con Exito','Se a Eliminado el usuario con exito','success');
            
        }else{
            swal('Error','No se a podido Eliminado el usuario','error');
        }
    });
}

