import React from 'react';
import './App.css';
import Footer from './components/Footer.js';
import Header from "./components/HeaderBar";
import {  Container } from 'semantic-ui-react';
import Product from './components/Product';

function App() {
  return (
    <Container>
      <Header />
      <Product />
      <Footer />
    </Container>
    
  );
}

export default App;
