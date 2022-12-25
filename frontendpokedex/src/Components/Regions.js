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
    <div className='backGround'>
          {
          regions.map(region => {
              return(
      <div className="card w-100 p-3;" key={'region-card-' + region.id}>
        <div className="card-body w-100 p-3">
          <h5 className="card-header w-100 p-3">{region.name}</h5>
          <p className="card-title w-100 p-3">Go see your Pokemon in that region!!!</p>
          <Link className="btn btn-primary" to={'/regions/' + region.id} >{region.name}</Link> 
        </div>
      </div>
              )
          })
          }
    </div>
    </>
  );
  }
  
  export default Region;