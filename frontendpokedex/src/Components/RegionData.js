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
    <div className='backGround'>
          {
          region.map(region => {
              return(
      <div className="card width: 18rem ;">
        <div className="card-body">
          <h5 className="card-header">{region.name}</h5>
          <p className="card-title">Go see your Pokemon in that region!!!</p>
          <Link className="btn btn-primary"  to={'/regions/' + region.id} >{region.name}</Link> 
        </div>
      </div>
              )
          })
          }
    </div>
    </>
  );
}

export default RegionData;