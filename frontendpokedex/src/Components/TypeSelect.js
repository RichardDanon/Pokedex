import axios from "axios";
import {useEffect, useState} from 'react';

function TypeSelect({}) {

  const [types, setTypes] = useState([]);
  const [formErrorMessage, setFormErrorMessage] = useState("");
  const [error, setError] = useState(false);

  const loadTypesFromAPI = ()=>{
    axios.get("http://localhost:3000/api/types/")
    .then(function(response){

        if(response.status === 200){

            const typeData = response.data;

            setTypes(typeData);
        }

       console.log(response);

    })
    .catch((error)=> {

        console.log(error);
    })
}

  useEffect(()=>{
    loadTypesFromAPI();
  },[])

    return (
      <select className="Types">
        {
            types.map(element => {
                return(
                    <option key={element.id} value="{element.id}">{element.name}</option>
                )
            })
        }
      </select>
    );
  }
  
  export default TypeSelect;