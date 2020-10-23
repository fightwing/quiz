import React from 'react';
import './App.css';
import Footer from './components/Footer.js';
import Products from './components/Products';
import Order from './components/Order';
import AddProduct from './components/AddProduct';
import { Route, BrowserRouter, Switch } from 'react-router-dom';
import HeaderBar from './components/HeaderBar';
class App extends React.Component {
  render(){
    return (
      <div>
      <BrowserRouter>
      <HeaderBar/>
      <Switch>
          <Route path="/order"><Order/></Route>
          <Route path="/addProduct"><AddProduct/></Route>
          <Route path="/"><Products/></Route>
      </Switch>
      <Footer />
    </BrowserRouter>
    </div>   
    );
    
  }
}
export default App;
