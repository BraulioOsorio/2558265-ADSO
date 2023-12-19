let id_facturaActual = null;
let productoSelect = null;
let formCrearFactura = null;
let listaProductos = null;
let temporalProductos = [];
let facturaContens = null;
let add = null;
let final = null;
let formAddProducts = null; 
let divFormAddProducts = document.getElementById("divFormAddProducts");

window.onload = function() {
    facturaContens = document.getElementById("facturaContens");
    productoSelect = document.getElementById("productoSelect");
    formCrearFactura = document.getElementById("formCrearFactura");
    formAddProducts = document.getElementById("formAddProducts");
    divFormAddProducts.style.display = "none";
    formAddProducts.addEventListener("submit",function(event){
        event.preventDefault();
        addProducto();
        
    });

    formCrearFactura.addEventListener("submit", function(event) {
        event.preventDefault();
        crearFactura();
    });
    
    final = document.getElementById("finalizar").addEventListener("click",function(){
        addProductoDB();
        
    });

    getClients("http://localhost/APIenPHP/Productos/obtenerPro.php");
}

function getClients(endpoint){
    
    fetch(endpoint)
    .then(res => res.json())
    .then(data=>{
        listaProductos = data.registros;
        productoSelect.innerHTML = "";
        for (var i= 0; i < data.registros.length ;i++) {
            temp = `<option value = '${data.registros[i].id_producto}'>${data.registros[i].nombre_producto}</option>`

            productoSelect.innerHTML += temp;
        }
        
    });
}

function productos(){
    facturaContens.innerHTML = "";
    for (var i = 0; i < temporalProductos.length; i++) {

        temp = `<tr>
            <td>${temporalProductos[i].id}</td>
            <td>${temporalProductos[i].cantidad}</td>
            <td>
                <button class="btn btn-danger" onclick="eliminar(${i})">Eliminar</button
            </td>
            
        </tr>`;
        facturaContens.innerHTML += temp;
    }
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

    document.getElementById("campo_cedula_cliente").disabled = true;
    document.getElementById("campo_cedula_vendedor").disabled = true;
    document.getElementById("enviar").disabled = true;
    document.getElementById("divFormAddProducts").style.display = "block";

    fetch("http://localhost/APIenPHP/Facturas/InsertFa.php",configuracion)
    .then(res => res.json())
    .then(data=>{
        console.log("Se recibe los datos");
        console.log(data);
        id_facturaActual = data.id;
        if(data.status){
            getClients("http://localhost/APIenPHP/Productos/obtenerPro.php");
            swal('Creado con Exito','Se a creado la Factura con exito','success');
            
        }else if(data.message ==  "CEDULA"){
            swal('Error','No se a podido insertar la Factura puede que la cedula del vendedor no exista','error');
        }else{
            swal('Error','No se a podido insertar la Factura puede que las cedulas no existaman','error');

        }
    });
}
function eliminar(indice){
    temporalProductos.splice(indice, 1);
    productos();
}
function addProducto(){
    let id_producto = document.getElementById("productoSelect").value;
    let cantidad = document.getElementById("campo_cantidad").value;
    

    if(id_producto !== null ){
        if(id_facturaActual !== null){
            const pro ={
                id_factura: id_facturaActual,
                id: id_producto,
                cantidad : cantidad
                
    
            };
            temporalProductos.push(pro);
            cantidad = document.getElementById("campo_cantidad").value = "";
            productos();
        }else{
            swal('Error','Primero llenar los campos de arriba antes de agregar productos','error');
        }
        
    }else{
        swal('Error','Todos los campos son del producto son requeridos','error');
    }
    
}


function addProductoDB(){
    console.log(temporalProductos);
    
    if(temporalProductos.length > 0){
        let datos = JSON.stringify({ id_factura: id_facturaActual, productos: temporalProductos });
        let configuracion = {
            method: "POST",
            headers:{
                "Accept":"application/json",
                
            },
            body: datos,
        };
        fetch("http://localhost/APIenPHP/Facturas/Insertitems.php",configuracion)
        .then(res => res.json())
        .then(data=>{
            console.log("Se recibe los datos");
            console.log(data);
            if(data.status){
                
                swal('Factura con Exito','Se a generado la Factura Exitosamente','success');
                
            }else{
                swal('Error','No se a podido Crear la Factura','error');
            }
        });
    }else{
        swal('Error','Agregar Minimo un producto antes de finalizar la compra','error');
    }
}


