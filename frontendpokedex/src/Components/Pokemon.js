import axios from "axios";
import {useEffect, useState} from 'react';
import RegionSelect from "./RegionSelect";
import TypeSelect from "./TypeSelect";
import { Form } from "react-router-dom";

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
      <>
        <div id="contact">
            <div className="detail">
            <div style={{display: "flex"}}>
                <img
                    key={pokemons.id}
                    src={pokemons.data || null} />
            </div>

            <div>
                <h1>
                    {pokemons.first || pokemons.last ? (
                        <>
                            {pokemons.first} {pokemons.last}
                        </>
                    ) : (
                        <i>No Name</i>
                    )}{" "}
                </h1>
            </div>

            <div>
                <form action="edit">
                    <button type="submit">Edit</button>
                </form>
                <form
                    method="post"
                    action="destroy"
                    onSubmit={(event) => { {
                        event.preventDefault();
                    }
                    }}
                >
                    <TypeSelect />
                    <RegionSelect />
                    <button type="submit">Delete</button>
                </form>
            </div>
            </div>
        </div>
        
        </>
    );
}
  
  export default Pokemon;