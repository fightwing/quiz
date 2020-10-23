import React from 'react';
import './App.css';
import Footer from './components/Footer.js';
import Products from './components/Products';
import Order from './components/Order';
import AddProduct from './components/AddProduct';
import { Link, Redirect, Route, BrowserRouter as Router, Switch } from 'react-router-dom';

class App extends React.Component {
  render(){
    return (
      <div>
      <Router>
      <ul>
        <li>
          <Link exact to="/"><Products>商城</Products></Link>
        </li>
        <li>
          <Link exact to="/Order"><Products>订单</Products></Link>
        </li>
        <li>
          <Link exact to="/AddProduct"><Products>添加商品</Products></Link>
        </li>
      </ul>
      <Redirect to="/"/>
  
      <Switch>
          <Route exact path="/" component={Products}></Route>
          <Route path="/Order" component={Order}></Route>
          <Route path="/AddProduct" component={AddProduct}></Route>
      </Switch>
    </Router>
    <Footer />
    </div>
      
    );
    
  }
}
export default App;
