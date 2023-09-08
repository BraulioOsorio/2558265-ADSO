let id_facturaActual = null;
let selectProducto = null;
let formCrearFactura = null;
let listaProductos = null;




window.onload = function() {
    selectProducto = document.getElementById("selectProducto");
    formCrearFactura = document.getElementById("formCrearFactura");

    formCrearFactura.addEventListener("submit", function(event) {
        event.preventDefault();
        crearFactura();
    });

    getClients("http://localhost/APIenPHP/Productos/obtenerPro.php");
}

function getClients(endpoint){
    
    fetch(endpoint)
    .then(res => res.json())
    .then(data=>{
        listaProductos = data.registros;
        
        for (var i= 0; i < data.registros.length ;i++) {
            temp = `<option value = '${data.registros[i].id_producto}'>${data.registros[i].nombre_producto}</option>`

            selectProducto.innerHTML += temp;
        }
        
    });
}

function crearFactura(){
    let datos = new FormData(formCrearFactura);
    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body: datos,
    };
    fetch("http://localhost/APIenPHP/Facturas/InsertFa.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        id_facturaActual = data.id;
        if(data.status){
            formCrearFactura.reset();
            getClients("http://localhost/APIenPHP/Productos/obtenerPro.php");
            swal('Creado con Exito','Se a creado la Factura con exito','success');
            
        }else{
            swal('Error','No se a podido insertar la Factura puede que la cedula no exista','error');
        }
    });
}


