import React from 'react';
import './App.css';
import Footer from './components/Footer.js';
import Header from "./components/HeaderBar";
import {  Container } from 'semantic-ui-react';
import Product from './components/Product';
import Products from './components/Products';

function App() {
  return (
    <Container>
      <Header />
      <Products />
      <Footer />
    </Container>
    
  );
}

export default App;
