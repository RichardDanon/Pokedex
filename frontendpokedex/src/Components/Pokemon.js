

function Pokemon() {

    const [Pokemons, setPokemons] = useState([]);
    const [formErrorMessage, setFormErrorMessage] = useState("")
    const [error, setError] = useState(false);

    const loadPokemonsFromAPI = ()=>{
        axios.get("localhost:8080/api/pokemon/")
        .then(function(response){

            if(response.status === 200){

                const pokemontData = response.data;

                setPokemons(pokemontData);
            }

           console.log(response);

        })
        .catch((error)=> {

            console.log(error);
        })
    }


    return (
      <div className="Pokemon">
        
      </div>
    );
  }
  
  export default Pokemon;