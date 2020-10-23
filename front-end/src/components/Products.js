import React from 'react';
import Product from './Product';
import '../Style/product.css'

const URL = "http://localhost:8080/products"
class Products extends React.Component{
    constructor(props){
        super(props);
        this.state={
            Products:[]
        }
    }

    componentDidMount() {
        fetch(URL,{method:'GET'})
          .then(response => response.json())
          .then(result => {
            this.setState({
              Products: result,
            })})
          .catch(error => {
            console.log(error);
          })
      }

      render() {
          return (
              <div className= "products">
                  {this.state.Products.map((product)=>(
                      <Product
                          id={product.id}
                          key={product.id}
                          price={product.price}
                          name={product.name}
                          unit={product.unit}
                          url={product.url}
                        />
                  ))}
              </div>
          );
      }
}

      

export default Products;