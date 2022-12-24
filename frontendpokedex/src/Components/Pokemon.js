import axios from "axios";
import {useEffect, useState} from 'react';
import RegionSelect from "./RegionSelect";
import TypeSelect from "./TypeSelect";

function Pokemon() {

    const [pokemons, setPokemons] = useState([]);
    const [formErrorMessage, setFormErrorMessage] = useState("");
    const [error, setError] = useState(false);

    const loadPokemonsFromAPI = ()=>{
        axios.get("http://localhost:3000/api/pokemon/")
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

    useEffect(()=>{
        loadPokemonsFromAPI();
    },[])


    return (
      <div className="Pokemon">
            <TypeSelect />
            <RegionSelect />
      </div>
    );
  }
  
  export default Pokemon;