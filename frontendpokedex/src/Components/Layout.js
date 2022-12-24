import axios from "axios";
import { useState } from "react";
import { Outlet, Link } from "react-router-dom";

function Layout() {
    return (
    <div>
        <div id="sidebar">
        <nav>
            <ul>
                <li>
                    <Link to='/pokemon' >Pokemon</Link>
                </li>
                <li>
                    <Link to='/regions' >Regions</Link>
                </li>
            </ul>
        </nav>

        <h1>Pokedex</h1>
        <div>
          <form id="search-form" role="search">
            <input
              id="q"
              aria-label="Search contacts"
              placeholder="Search"
              type="search"
              name="q"
            />
            <div
              id="search-spinner"
              aria-hidden
              hidden={true}
            />
            <div
              className="sr-only"
              aria-live="polite"
            ></div>
          </form>
          <form method="post">
            <button type="submit">New</button>
          </form>
        </div>

        <nav>
            <ul>
                <li>
                    <a href={`contacts/1`}>Your Name</a>
                </li>
                <li>
                    <a href={`contacts/2`}>Your Friend</a>
                </li>
            </ul>
        </nav> 

      </div>
        <Outlet />
    </div>
    );
  }
  
  export default Layout;