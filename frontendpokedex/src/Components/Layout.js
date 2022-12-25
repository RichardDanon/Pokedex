import axios from "axios";
import { useState } from "react";
import { Outlet, Link } from "react-router-dom";

//                            



function Layout() {
    return (
    <>
    <div className="header">
        <div className="d-flex flex-column p-3 text-white bg-dark width: auto;">
            <span className="fs-4">Pokedex</span>
            <ul className="nav navbar-nav flex-column mb-auto">
                <li className ="nav-item">
                    <Link className="nav-link text-white" to='/regions' >Regions</Link>
                </li>
                <li className ="nav-item">
                    <Link className="nav-link text-white" to='/pokemon' >Pokemon</Link>
                </li>
            </ul>
        </div>
    </div>
    <div className="body">
        <Outlet />
    </div>
    </>
    );
  }
  
  export default Layout;