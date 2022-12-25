import axios from "axios";
import {useEffect, useState} from 'react';
import { Link } from "react-router-dom";

function Region() {

  const [regions, setRegions] = useState([]);
  const [formErrorMessage, setFormErrorMessage] = useState("");
  const [error, setError] = useState(false);

  const loadRegionsFromAPI = ()=>{
    axios.get("http://localhost:3000/api/regions/")
    .then(function(response){

        if(response.status === 200){

            const regionData = response.data;

            setRegions(regionData);
        }

       console.log(response);

    })
    .catch((error)=> {

        console.log(error);
    })
}

  useEffect(()=>{
    loadRegionsFromAPI();
  },[])

  return (
    <>
    </>
  );
  }
  
  export default Region;