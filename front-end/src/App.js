import React from 'react';
import './App.css';
import Footer from './components/Footer.js';
import Header from "./components/HeaderBar";
import {  Container } from 'semantic-ui-react';
function App() {
  return (
    <Container>
      <Header />
      <Footer />
    </Container>
    
  );
}

export default App;
