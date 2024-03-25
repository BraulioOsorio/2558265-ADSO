let contentClients = null;
let listaProductos = null;
let modalEditarProducto = null;
let formEditarProducto = null;
let waitContent = null;
let modalEliminarProducto = null;
let formEliminarProducto = null;
let modalCrearProducto = null;
let formInsertarProducto = null;





window.onload = function(){
    contentProduts = document.getElementById("contentProduts");
    waitContent = document.getElementById("waitContent");

    formInsertarProducto = document.getElementById("formInsertarProducto");
    formInsertarProducto.addEventListener("submit",function(event){
        event.preventDefault();
        crearProducto();
    });

    modalCrearProducto = new bootstrap.Modal(document.getElementById('modalCrearProducto'), {
        keyboard: false,
        backdrop: false
    });


    modalEditarProducto = new bootstrap.Modal(document.getElementById('modalEditarProducto'), {
        keyboard: false,
        backdrop: false
    });
    modalEliminarProducto = new bootstrap.Modal(document.getElementById('modalEliminarProducto'), {
        keyboard: false,
        backdrop: false
    });
    formEditarProducto = document.getElementById("formEditarProducto");
    formEditarProducto.addEventListener("submit",function(event){
        event.preventDefault();
        editarProducto();
    });

    formEliminarProducto = document.getElementById("formEliminarProducto");
    formEliminarProducto.addEventListener("submit",function(event){
        event.preventDefault();
        eliminarProducto();
    });

    getClients("http://localhost/APIenPHP/Productos/ObtenerPro.php");


}

function getClients(endpoint){
    waitContent.style.display = "block";
    fetch(endpoint)
    .then(res => res.json())
    .then(data=>{
        listaProductos = data.registros
        contentProduts.innerHTML = "";
        for (var i= 0; i < data.registros.length ;i++) {
            temp = ` <tr>
                        <td>${data.registros[i].id_producto}</td>
                        <td>${data.registros[i].nombre_producto}</td>
                        <td>${data.registros[i].costo_producto}</td>
                        <td>
                            <button class="btn btn-primary" onclick="abrirModalEditar(${i})">Editar</button>
                        </td>
                        <td>
                            <button class="btn btn-danger" onclick="confirmarEliminacion(${i})">Eliminar</button>
                        </td>
                    </tr>
        
            `
            contentProduts.innerHTML += temp;

        }
        waitContent.style.display = "none";
    });
}

function abrirModalEditar(indice){
    document.getElementById("campo_id").value = listaProductos[indice].id_producto;
    document.getElementById("campo_editar_nombre").value = listaProductos[indice].nombre_producto;
    document.getElementById("campo_editar_costo").value = listaProductos[indice].costo_producto;
    modalEditarProducto.show();

}

function confirmarEliminacion(indice){
    document.getElementById("campo_id_eli").value = listaProductos[indice].id_producto;
    document.getElementById("campo_eliminar_nombre").value = listaProductos[indice].nombre_producto;
    document.getElementById("campo_eliminar_costo").value = listaProductos[indice].costo_producto;
    modalEliminarProducto.show();
}


function editarProducto(){
    let datos = new FormData(formEditarProducto);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Productos/updatePro.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            formEditarProducto.reset();
            modalEditarProducto.hide();
            getClients("http://localhost/APIenPHP/Productos/ObtenerPro.php");
            swal('Modificado con Exito','Se a modificado el Producto con exito','success');
            
        }else{
            swal('Error','No se a podido modificar el Producto','error');
        }
    });
}

function eliminarProducto(){
    let datos = new FormData(formEliminarProducto);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Productos/deletePro.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            formEditarProducto.reset();
            modalEliminarProducto.hide();
            getClients("http://localhost/APIenPHP/Productos/ObtenerPro.php");
            swal('Eliminado con Exito','Se a Eliminado el Producto con exito','success');
            
        }else{
            swal('Error','No se a podido Eliminado el Producto','error');
        }
    });
}


function crearProducto(){
    let datos = new FormData(formInsertarProducto);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Productos/InsertPro.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            formInsertarProducto.reset();
            modalCrearProducto.hide();
            getClients("http://localhost/APIenPHP/Productos/ObtenerPro.php");
            swal('Creado con Exito','Se a creado el Producto con exito','success');
            
        }else{
            swal('Error','No se a podido insertar el Producto','error');
        }
    });
}




