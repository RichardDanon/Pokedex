import axios from "axios";
import {useEffect, useState} from 'react';
import RegionSelect from "./RegionSelect";
import TypeSelect from "./TypeSelect";
import { Form, Link } from "react-router-dom";

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

    const addPokemon = (pokemon)=>{

        axios.post("http://localhost:3000/api/pokemon/", pokemon)
        .then(function (response){
            if (response.status == 200){
                setFormErrorMessage("")
                loadPokemonsFromAPI();
            }
        })
        .catch((error)=>{
           alert(error);
        })

    }

    const onSubmitForm = (event)=>{
        event.preventDefault();
        
        var name = event.target.elements.name.value;
        var primaryType = event.target.elements.primaryType.value;
        var secondaryType = event.target.elements.secondaryType.value.value;

        var region = event.target.elements.region.value;



        if (name !== "" && primaryType != null && region != null)
        {

            addPokemon({name: name, primaryType: primaryType})
            event.target.elements.name.value = "";
            event.target.elements.description.value = "";
            setError(false);

        }
        else{
            setFormErrorMessage("Please make sure all customization boxes were succesfully filled ")
            setError(true);
        }

    }

  return (
    <div className='backGround'>
          {
          pokemons.map(pokemon => {
              return(
      <div className="card w-100 p-3;" key={'pokemon-card-' + pokemon.id}>
        <div className="card-body w-100 p-3">
          <h5 className="card-header w-100 p-3">{pokemon.name}</h5>
          <p className="card-title w-100 p-3" style={{backgroundColor: pokemon.primaryType.color }}>{pokemon.primaryType.name}</p>
          { pokemon.secondaryType != null &&
          <p className="card-title w-100 p-3" style={{backgroundColor: pokemon.secondaryType.color }}>{pokemon.secondaryType.name}</p>
          }
          <Link className="btn btn-primary" to={'/regions/' + pokemon.region.id} >{pokemon.region.name}</Link> 
        </div>
      </div>
              )
          })
          }
    </div>
  );
  }
  
  export default Pokemon;