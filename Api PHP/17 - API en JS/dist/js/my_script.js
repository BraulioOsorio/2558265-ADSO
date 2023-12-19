let nombrePokemon = null;
let imgPokemon = null;
let contentButtons = null;
let btnNext = null;
let btnBack = null;

window.onload = function(){
    nombrePokemon = document.getElementById("nombrePokemon");
    imgPokemon = document.getElementById("imgPokemon");
    contentButtons = document.getElementById("contentButtons");
    btnNext = document.getElementById("btnNext");
    btnBack = document.getElementById("btnBack");

    PokemonsLoad("https://pokeapi.co/api/v2/pokemon");
}

function PokemonsLoad( endpoint ){
    console.log("Iniciando consumo API: " + endpoint);

    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => {
        console.log("Se recibe");
        console.log(data);
        contentButtons.innerHTML="";
        let temp = ""
        for (var i = 0;i < data.results.length;i++) {
            temp += `<button class="col-5 col-lg-2 m-1 btn btn-outline-primary"> ${data.results[i].name}</button>`;
            
            
        }
        contentButtons.innerHTML = temp;
        btnBack.setAttribute("onclik",`PokemonsLoad("${data.previus}")`);
        btnNext.setAttribute("onclik",`PokemonsLoad("${data.next}")`);
    });
}
