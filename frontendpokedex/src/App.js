import logo from './logo.svg';
import './App.css';
import Pokemon from './Components/Pokemon';
import Regions from './Components/Regions';
import Types from './Components/Types'
import Layout from './Components/Layout';
import { RouterProvider, createBrowserRouter, BrowserRouter,
    createRoutesFromElements, Route, Routes} from 'react-router-dom';
 
 const router = createBrowserRouter(
   createRoutesFromElements(  
    <Route path="/" element={<Layout />}> 
       <Route path='/pokemon' element={<Pokemon/>}/>
       <Route path='/pokemon/:id' element={<Pokemon/>}/>
       <Route path='/regions' element={<Regions/>}/>
       <Route path='/regions/:id' element={<Regions/>}/>
    </Route>
   ));
function App() {   
  return (
    <RouterProvider router={router} />
  );
}

export default App;
