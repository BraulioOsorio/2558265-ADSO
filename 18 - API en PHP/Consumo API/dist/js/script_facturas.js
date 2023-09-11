let contensProducts = null;
let listaFacturas = null;
let listaProductos = null;
let modalEditarFa = null;
let waitContent = null;
let modalEliminarFa = null;
let formEliminarFa = null;
let formEliminarItems = null;
let modalEliminarItems = null;
let itemsActual = null;

window.onload = function(){
    contensProducts = document.getElementById("contensProducts");
    waitContent = document.getElementById("waitContent");
    modalEliminarFa= new bootstrap.Modal(document.getElementById('modalEliminarFa'), {
        keyboard: false,
        backdrop: false
    });

    modalEliminarItems= new bootstrap.Modal(document.getElementById('modalEliminarItems'), {
        keyboard: false,
        backdrop: false
    });

    formEliminarItems = document.getElementById("formEliminarItems");
    formEliminarItems.addEventListener("submit",function(event){
        event.preventDefault();
        eliminarItems();
    });
    formEliminarFa = document.getElementById("formEliminarFa");
    formEliminarFa.addEventListener("submit",function(event){
        event.preventDefault();
        eliminarFactura();
    });
    modalEditarFa = new bootstrap.Modal(document.getElementById('modalEditarFa'), {
        keyboard: false,
        backdrop: false
    });

    getClients("http://localhost/APIenPHP/Facturas/ObtenerFa.php");
}

function getClients(endpoint){
    waitContent.style.display = "block";
    fetch(endpoint)
    .then(res => res.json())
    .then(data=>{
        listaFacturas = data.registros
        contensProducts.innerHTML = "";
        for (var i= 0; i < data.registros.length ;i++) {
            temp = ` <tr>
                        <td>${data.registros[i].id_facturas}</td>
                        <td>${data.registros[i].cedula_vendedor}</td>
                        <td>${data.registros[i].cedula_cliente}</td>
                        <td>${data.registros[i].precio_factura}</td>
                        <td>${data.registros[i].fecha}</td>
                        <td>${data.registros[i].estado}</td>
                        <td>
                            <button class="btn btn-primary" onclick="abrirModalEditar(${i})">Editar</button>
                        </td>
                        <td>
                            <button class="btn btn-danger" onclick="confirmarEliminacion(${i})">Eliminar</button
                        </td>
                    </tr>
        
            `
            contensProducts.innerHTML += temp;
        }
        waitContent.style.display = "none";
    });
}
function abrirModalEditar(indice){
    console.log(listaFacturas[indice].id_facturas);
    itemsActual = listaFacturas[indice].id_facturas;
    getpro("http://localhost/APIenPHP/Facturas/ObteneritemsFa.php",listaFacturas[indice].id_facturas);
    modalEditarFa.show();

}

function getpro(endpoint, id_facturas) {
    let datos = JSON.stringify({ id_facturas: id_facturas });
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
            productosConten.innerHTML = "";
            for (var i = 0; i < data.registros.length; i++) {
                temp = `<tr>
                    <td>${data.registros[i].nombre_producto}</td>
                    <td>${data.registros[i].cantidad}</td>
                    <td>${data.registros[i].costo_producto}</td>
                    <td>${data.registros[i].subtotal}</td>
                    
                    <td>
                        <button class="btn btn-danger" onclick="confirmarEliminacionItemns(${i})">Eliminar</button
                    </td>
                    
                </tr>`;
                productosConten.innerHTML += temp;
                document.getElementById("totalFactura").innerHTML = data.registros[i].precio_factura;
            }
            
        })
        .catch(error => {
            console.error('Error al procesar la solicitud:', error);
        });
}




            


function confirmarEliminacion(indice){
    document.getElementById("campo_id_eli").value = listaFacturas[indice].id_facturas;
    document.getElementById("campo_eliminar_cedulaV").value = listaFacturas[indice].cedula_vendedor;
    document.getElementById("campo_eliminar_cedulaC").value = listaFacturas[indice].cedula_cliente;
    document.getElementById("campo_eliminar_costo").value = listaFacturas[indice].precio_factura;
    document.getElementById("campo_eliminar_fecha").value = listaFacturas[indice].fecha;
    
    modalEliminarFa.show();
}



function eliminarFactura(){
    let datos = new FormData(formEliminarFa);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Facturas/deleteFa.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            formEliminarFa.reset();
            modalEliminarFa.hide();
            getClients("http://localhost/APIenPHP/Facturas/ObtenerFa.php");
            swal('Eliminado con Exito','Se a Eliminado el Producto con exito','success');
            
        }else{
            swal('Error','No se a podido Eliminado el Producto','error');
        }
    });
}

function confirmarEliminacionItemns(indice){
    
    document.getElementById("campo_id_Items").value = listaProductos[indice].id_items;
    document.getElementById("campo_nombreProducto").value = listaProductos[indice].nombre_producto;
    document.getElementById("campo_cantidad").value = listaProductos[indice].cantidad;
    document.getElementById("campo_valorU").value = listaProductos[indice].costo_producto;
    document.getElementById("campo_subtotal").value = listaProductos[indice].subtotal;
    
    modalEliminarItems.show();
}

function eliminarItems(){
    let datos = new FormData(formEliminarItems);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Facturas/deleteFaItems.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        if(data.status){
            modalEliminarItems.hide();
            getpro("http://localhost/APIenPHP/Facturas/ObteneritemsFa.php",itemsActual);
            getClients("http://localhost/APIenPHP/Facturas/ObtenerFa.php");
            swal('Eliminado con Exito','Se a Eliminado el Items con exito','success');
            
        }else{
            swal('Error','No se a podido Eliminado el Items','error');
        }
    });
}




