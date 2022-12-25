import axios from "axios";
import {useEffect, useState} from 'react';
import { Link, useParams } from "react-router-dom";

function RegionData() {

    const [region, setRegion] = useState({ pokemon: [] })
  const { id } = useParams();


  const loadRegionFromAPI = ()=>{
    console.log("REGION ID: " + id);

    axios.get("http://localhost:3000/api/regions/" + id)
        .then(function(response){

        if(response.status === 200){

            const regionData = response.data;

            setRegion(regionData);
        }

       console.log(response);

    })
    .catch((error)=> {

        console.log(error);
    })
}

  useEffect(()=>{
    loadRegionFromAPI();
  },[])

  return (
    <ul className="list-group w-100 p-3">
        {
          region.pokemon.map(pokemon => {
              return(
            <li className="list-group-item active p-3"  key={'region-card-' + pokemon.region.id}>{pokemon.name}</li>
              )})
          }
    </ul>
  );
}

export default RegionData;