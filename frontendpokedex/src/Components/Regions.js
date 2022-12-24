import axios from "axios";
import {useEffect, useState} from 'react';

function Region() {

  const [Regions, setRegions] = useState([]);
  const [formErrorMessage, setFormErrorMessage] = useState("");
  const [error, setError] = useState(false);

  const loadRegionssFromAPI = ()=>{
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
    loadRegionssFromAPI();
  },[])

    return (
      <div className="Region">
        
      </div>
    );
  }
  
  export default Region;