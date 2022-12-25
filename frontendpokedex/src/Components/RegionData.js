import axios from "axios";
import {useEffect, useState} from 'react';
import { Link, useParams } from "react-router-dom";

function RegionData() {

  const [region, setRegion] = useState([]);
  const [formErrorMessage, setFormErrorMessage] = useState("");
  const [error, setError] = useState(false);
  const { id } = useParams();


  const loadRegionFromAPI = ()=>{
    axios.get("http://localhost:3000/api/regions/" + id)
        .then(function(response){

        if(response.status === 200){

            const regionData = response.data.id;

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
    <>

    </>
  );
}

export default RegionData;